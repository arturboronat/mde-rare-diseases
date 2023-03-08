import {useState, useEffect} from 'react';
import Delete from './Delete';
import Upload from './Upload';
import Card from '@mui/material/Card'
import CardContent from '@mui/material/CardContent';
import CardActions from '@mui/material/CardActions';
import Fab from  '@mui/material/Fab';
import CloudUploadIcon from '@mui/icons-material/CloudUpload';
import DeleteIcon from '@mui/icons-material/Delete';
import Dialog from '@mui/material/Dialog';
import DialogContent from '@mui/material/DialogContent';
import FolderIcon from '@mui/icons-material/Folder';
import ClearIcon from '@mui/icons-material/Clear'
import { Backdrop, IconButton } from '@mui/material';
import InfoIcon from '@mui/icons-material/Info';
import axios from "axios"
import {isUndefined} from "mathjs"
import {
    BarChart,
    Bar,
    XAxis,
    YAxis,
    CartesianGrid,
    Tooltip,
    Legend, PieChart, Pie, Sector, Cell, ResponsiveContainer
  } from "recharts";



  

interface appProps {
    getRoute: (route:string)=>void
}


function DataBase({getRoute}:appProps) {
    function randColor(){
        let letters = "0123456789ABCDDEF"
        let color = "#"
        for(let i=0; i<6; i++){
            color += (letters[Math.floor(Math.random()*16)])
        }
        return color
    }
   
   const COLORS = ["#FFBB28", "#FF8042", "#00C49F"];
    
    const RADIAN = Math.PI / 180;
    const renderCustomizedLabel = ({ cx, cy, midAngle, innerRadius, outerRadius, percent, index }:any) => {
      const radius = innerRadius + (outerRadius - innerRadius) * 0.5;
      const x = cx + radius * Math.cos(-midAngle * RADIAN);
      const y = cy + radius * Math.sin(-midAngle * RADIAN);
    
      return (
        <text x={x} y={y} fill="white" textAnchor={x > cx ? 'start' : 'end'} dominantBaseline="central">
          {(percent!==0)&&`${(percent * 100).toFixed(0)}%`}
        </text>
      );
    };

    async function getGph(data:any){
        
          try{
         const res = await axios.post("http://localhost:5000/discriptionModel/visualModel", {data:data})
          
         if(res.status === 200){
           axios.get("http://localhost:5000/discriptionModel/visualModel").then(res=>{
           setgphd(res.data)   
           })
          }
          
        }
        catch(err){
          console.log(err)
          
        }
          setTimeout(()=>{setRoute("viz")}, 3000)
      }
  
   
    useEffect(()=>{
        axios.get("http://localhost:8080/files").then((res)=>{
            setDataBase((prev:any[])=>{
              
                prev = res.data.map((item:any)=>{
                    return {
                        label:item.split(".")[0],
                        value:item
                    }
                })

                return prev
            })
        })

       
        setTimeout(()=>{setOpac("opacity-10")},100)
        setTimeout(()=>{setOpac("opacity-20")},150)
        setTimeout(()=>{setOpac("opacity-30")},200)
        setTimeout(()=>{setOpac("opacity-40")},250)
        setTimeout(()=>{setOpac("opacity-50")},300)
        setTimeout(()=>{setOpac("opacity-60")},350)
        setTimeout(()=>{setOpac("opacity-70")},400)
        setTimeout(()=>{setOpac("opacity-80")},450)
        setTimeout(()=>{setOpac("opacity-90")},500)
        setTimeout(()=>{setOpac("opacity-1")},550)
    }, [])

   const [route, setRoute] = useState("home")
   const [opac, setOpac] = useState("opacity-10")
   const [dataBase, setDataBase] = useState<any[]>([])
   const [grap, setGrap] = useState("bar")
   const [gphd, setgphd] = useState<any>()

   const data =[ {
    name:"today",
    value:20
    } ,
    {
        name:"task",
        value:50
        } ]
    async function deleted(file:string){
        
        setRoute("delete")
        try{
         const res =  await axios.post("http://localhost:5000/delete", {data:file})
        } 
        catch(error){
          console.log(error)
        }
        axios.get("http://localhost:5000/files").then((res)=>{
            setDataBase((prev:any[])=>{
              
                prev = res.data.map((item:any)=>{
                    return {
                        label:item.split(".")[0],
                        value:item
                    }
                })

                return prev
            })
        })
        setTimeout(()=>{
            setRoute("home")
        }, 1000)
    }
    
 

   function uploaded(){
    axios.get("http://localhost:5000/files").then((res)=>{
            setDataBase((prev:any[])=>{
              
                prev = res.data.map((item:any)=>{
                    return {
                        label:item.split(".")[0],
                        value:item
                    }
                })

                return prev
            })
        })
    setRoute("home")
   }


    return (
        <div className={`grid grid-cols-2 home  min-h-full bg-cover ${opac}`} >  
       
        <div className="dataBase-bg h-[100%] w-[200%] bg-cover opacity-50">
 
        </div>
        
        
         <div className="ml-[-57%]  z-[70]">
            <div className="flex flex-col" >
            <div className="flex flex-row w-[30%] gap-4  mt-[1%] mb-[1%] ml-[70%] opacity-90">
            <button onClick={(()=>{

                getRoute("home")
            })} 
            className="text-lg font-bold text-[white] hover:border-b-4">Home</button>
            <button onClick={(()=>{
                getRoute("dataBase")
            })} 
            className="text-lg font-bold text-[white] hover:border-b-4">Data Admin</button>
            <button onClick={(()=>{
                getRoute("query")
            })}
            className="text-lg font-bold text-[white] hover:border-b-4">Query UI Design</button>
            </div>
            {
                (route==="home")&&
        
            
            <div className="w-[80%] bg-[white] ml-[-10%] opacity-70 rounded-lg mt-[3%] p-[3%]">
              
               <div className="grid grid-cols-4">
               {
                (dataBase.length>0)&&
                dataBase.map((itm)=>{
                    return (
                        <div>
                        <FolderIcon
                        sx={{width:"60%", height:"50%"}}/>
                       <span >
                        <IconButton size='small'
                        onClick={(()=>{
                            deleted(itm.value)
                        })}>
                        <ClearIcon fontSize='small' />
                        </IconButton>
                        <IconButton size='small'
                        onClick={(()=>{
                            getGph(itm.value)
                        })}>
                            <InfoIcon fontSize='small'/>
                        </IconButton>
                        </span>
                         <p>{itm.label}</p>
                        </div>
                    )
                       
                })
               }
     
             
               </div>
               {/* <div className="bg-[black] z-1000 z-[1000]">
              
               </div> */}
               
              
             
                 <Fab sx={{marginLeft: "40%", padding: "2%"}} size="small" variant="extended" color="primary" onClick={(()=>{
                    setRoute("upload")
                })}><p>Upload</p></Fab>

            </div>
            }


            </div>
            <Backdrop  
        sx={{ color: '#fff', zIndex: (theme) => theme.zIndex.drawer + 1 }}
            open={(route==="delete")} >
         <div className='w-[50%] z-[90]'>
         
         </div>
          </Backdrop>

        </div>
  
        <Backdrop  
        sx={{ zIndex: (theme) => theme.zIndex.drawer + 1 }}
            open={(route==="upload")} >
         <div className='w-[35%] h-[40%] z-[90]'>
         <Upload uploaded={uploaded}/>
         </div>
          </Backdrop>
          <Backdrop  
        sx={{ zIndex: (theme) => theme.zIndex.drawer + 1 }}
            open={(route==="viz")} >
         <div className='w-[70%] h-[60%] z-[90] bg-[white] p-[5%] pr-[-10%]' >
           <div className="mt-[-9%]  ml-[104%] pb-[2%] pt-[1%]">
           <IconButton 
            onClick={(()=>{
                setRoute("home")
            })}>
                <ClearIcon/>
            </IconButton>
            </div>   
         
        
         { (grap==="bar")&& <div className="h-[130%] w-[100%] mt-[-2%] flex">
           
            <div className="overflow-y-scroll w-[80%]">
            {
                (typeof(gphd)==="object")&&
            Object.keys(gphd.data).map((hy)=>{
                return(
                    <div>
                        <div className="w-[40%] mt-[4%] mb-[2%] text-center">{hy}</div>
                    <BarChart
                    width={600}
                    height={300}
                    data={gphd.data[hy]}
                    margin={{
                        top: 5,
                        right: 5,
                        left: 5,
                        bottom: 5
                    }}
                    >
          <CartesianGrid strokeDasharray="3 3" />
          <XAxis dataKey="name" />
          <YAxis />
          <Tooltip />
          <Legend />
          <Bar dataKey="value" fill="#8884d8" >
          {gphd.data[hy].map((entry:any, index:any) => (
          <Cell key={`cell-${index}`} fill={randColor()} />
        ))}
            </Bar>
        </BarChart>
               </div> )
            })}
            </div>
            <div className='w-[20%] my-auto'>
            <Fab sx={{marginLeft: "40%", padding: "4%", width:"80%", height:"60%"}} size="small" variant="extended" color="primary" onClick={(()=>{
                    setGrap("pie")
                })}><p>Show Type Summary</p></Fab>
            </div>
          </div>}


          { (grap==="pie")&& <div className="h-[120%] w-[100%] flex">
           
            <div className="overflow-y-scroll w-[80%]">
            {
                (typeof(gphd)==="object")&&
            Object.keys(gphd.typeData).map((hy)=>{
                return(
                    <div className="flex flex-row ">
                       
                        <PieChart width={400} height={400}>
      <Pie
        data={gphd.typeData[hy]}
        cx={200}
        cy={200}
        labelLine={false}
        label={renderCustomizedLabel}
        outerRadius={150}
        fill="#8884d8"
        dataKey="value"
      >
        {COLORS.map((entry, index) => (
          <Cell key={`cell-${index}`} fill={COLORS[index % COLORS.length]} />
        ))}
      </Pie>
    </PieChart>
    <div className="w-[40%] my-auto">
        <p className=''>{hy}</p>
    
        <p className="border-l-[40px] pl-[3px] border-[#FFBB28] w-[10%] mt-[1%]">String</p>
        <p className="border-l-[40px] pl-[3px] border-[#FF8042] w-[10%] mt-[1%]">Number</p>
        <p className="border-l-[40px] pl-[3px] border-[#00C49F] w-[10%] mt-[1%]">Undefined</p>
        </div>
               </div> )
            })}
            </div>
            <div className='w-[20%] my-auto'>
            <Fab sx={{marginLeft: "40%", padding: "4%", width:"80%", height:"60%"}} size="small" variant="extended" color="primary" onClick={(()=>{
            setGrap("bar")
        })}><p>Show Data Summary</p></Fab>
            </div>
          </div>}
           

         </div>
          </Backdrop>
        </div>
    );
}

export default DataBase;