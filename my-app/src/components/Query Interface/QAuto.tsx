import {useEffect, useState} from 'react';
import { FormModel } from '../VForm/Model';
import { VForm } from '../VForm/FormCompiler';
import Form from '../Form/Form';
import axios from 'axios'
import { isUndefined } from 'mathjs';
import GuiDsl from '../GuiToDSL/GuiDsl';
import Result from './Result'
import EditIcon from '@mui/icons-material/Edit';
import ClearIcon from '@mui/icons-material/Clear';
import QDataBase from './QDataBase';
import QHistory from "./QHistory"
import { Backdrop, CircularProgress, IconButton, Alert, AlertTitle, Fab } from '@mui/material';

interface appProps {
    getRoute: (route:string)=>void,
    history:(history:any)=>void
    
}

function QAuto({getRoute, history}:appProps) {


    useEffect(()=>{
        axios.get("http://localhost:8080/getDataBase").then((res)=>{
            setDataBase(res.data)
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

    const [name, setName] = useState("")
    const [result, setResult] = useState<{}>()
    const [del, setDel] = useState<{}>()
    const [edit, setEdit] = useState<{}>()
    const [route, setRoute] = useState("dataBase")
    const [dataBase, setDataBase] = useState<any[]>([])
    const [data, setData] = useState<any>()
    const [opac, setOpac] = useState("opacity-10")
    const [lay, setLay] = useState('#e2e8f0')
    const [layout, setLayout] = useState('horizontal')
    const [lays, setLays] = useState("hide")
    const [outPut, setOutPut] = useState<FormModel>()
    const [hist, setHist] = useState<any[]>([])
    const [group, setNewGroup] = useState<string[]>([])

    function routeController(route:string){
       if(route!=="Qhome"){
        setRoute(route)
       } 
       else{
        getRoute(route)
       }
    }

    function handleDelete(event:any){
    //     setDel(event)
    //     let prev = data
    //     delete prev[event]
    // setData(prev)
    //     setOutPut(GuiDsl(prev, layout))
    }

    function handleEdit(event:any){
    setEdit(data[event])
    }

    function getResult(event:any){
        setResult(event)
        setRoute("result")
    }

    async function getData(data:any){
      setRoute("ui")
        try{
       const res = await axios.post("http://localhost:8080/dataset", data.DataBase)

       console.log(res.status)

       if(res.status===200){

        axios.get("http://localhost:8080/getData").then(res=>{
            setData(res.data)
           
            }
        )
       }
           
     }
      catch(err){
        console.log(err)
        
      }
        setTimeout(()=>{
            

            
            
            setRoute("query")}, 3000)
    }

    function editForm(intp:any){
    setEdit(undefined)

    }


    return (
        <div className={`grid grid-cols-2 home  min-h-full bg-cover ${opac}`} >  
       
       <div className="query-bg h-[100%] w-[200%] bg-cover opacity-50">

       </div>
       <div className="flex flex-col z-[70] w-[80%] ml-[-42%]  ">
            <div className="flex flex-row-reverse w-[100%] gap-4  mt-[2%] ml-[50%] opacity-90">
                <button onClick={(()=>{
                    getRoute("query")
                })}
                className="text-lg font-bold text-[white] hover:border-b-4">Query UI</button>
                <button onClick={(()=>{
                    getRoute("dataBase")
                })} 
                className="text-lg font-bold text-[white] hover:border-b-4">DataBase</button>
                <button onClick={(()=>{
                    getRoute("Qhome")
                })} 
                className="text-lg font-bold text-[white] hover:border-b-4">Home</button>
            </div>
        <div className="w-[220%] ml-[-60%] mt-[20%] z-[70]">
            
        <QDataBase getRoute={routeController} route={route} dataBase={dataBase} outPut={getData}/>
        
            {
                (!isUndefined(data)&&(route==="query"))&&
                <div> 
                    <div className='flex flex-row-reverse bg-[#e2e8f0] rounded-t-lg mb-[-2%] pb-[2%] '
                    onMouseEnter={(()=>{
                        setLay("black")
                    })}

                    onMouseLeave={(()=>{
                        setLay("#e2e8f0")
                    })}
                    >
                    <IconButton 
                    onClick={(()=>{
                       setLays("show")
                    })}>
                        <EditIcon sx={{color:lay}}/>
                    </IconButton>
                    <IconButton 
                    onClick={(()=>{
                       setLays("save")
                    //    setHist([...hist, GuiDsl(data, layout)])
                    })}>
                        <ClearIcon sx={{color:lay}}/>
                    </IconButton>
                    </div>
                    
                <VForm 
                model={data} 
                handleOutput={getResult} 
                deleted={handleDelete} 
                edited={handleEdit} 
                />
                </div>
            }

       { /* Edit Form */ }
            {
                (!isUndefined(edit))&& 
                <Backdrop
                sx={{ color: '#fff', zIndex: (theme) => theme.zIndex.drawer + 1}}
                open={(!isUndefined(edit))} >
                 <div className="grid grid-cols-1 w-[40%]"> 

                <div className='flex flex-row-reverse bg-[#e2e8f0] rounded-t-lg mb-[-2%] pb-[2%] w-[100%]' >
                    <IconButton 
                    onClick={(()=>{
                       setEdit(undefined)
                    })}>
                        <ClearIcon/>
                    </IconButton>
                </div>
                    <Form inputData={edit} 
                    inputGroup={group}
                outputData={editForm}
                />
                </div>
                </Backdrop>
                
            }

            {
                (route==="result")&&
                (!isUndefined(result))&&
                <Result data={result}
                getRoute={
                    (()=>{setRoute("query")})
                }
                />
            }
            <Backdrop open={(route==="ui")}
                sx={{ color: '#fff', zIndex: (theme) => theme.zIndex.drawer + 1 }}>
              <div className='mt-[-20%] xl:mr-[-50%] 2xl:mr-[30%] p-[30%]'>
                  <p className="text-xl ml-[-50%] 2xl:ml-[-25%]">Please be patient, the User Interface for  is being generated </p>
                  <CircularProgress  sx={{marginTop: "10%"}}/>
              </div>
        </Backdrop>
        <Backdrop open={(lays==="show")}
                sx={{ color: '#fff', zIndex: (theme) => theme.zIndex.drawer + 1 }}>
              <div className='w-[40%]  mx-auto z-[90] mt-[-3%] mb-[-5%]'>
              <div className='flex flex-row-reverse bg-[#e2e8f0] rounded-t-lg mb-[-2%] pb-[2%]' >
                    <IconButton 
                    onClick={(()=>{
                       setLays("hide")
                    })}>
                        <ClearIcon/>
                    </IconButton>
                    </div>
                 <VForm
                 model={{
                    formLayout:'vertical',
                    formInputs:[
                        {
                            inputName:"layout",
                            inputType:"select",
                            options:{
                                optionType:"enum",
                                data:["horizontal", "vertical"]
                            }
                        }
                    ]
                 }}

                 handleOutput={((layDat:any)=>{
                    setLayout(layDat.layout)
                    setOutPut(GuiDsl(data, layDat.layout))
                        setLays("hide")
                        
                 })}
                 />
              </div>
        </Backdrop>
        <Backdrop open={(lays==="save")}
                sx={{ color: '#fff', zIndex: (theme) => theme.zIndex.drawer + 1 }}>
                    
                    <Alert sx={{ marginTop: "-20%", paddingX:"7%"}} severity="info">
                  <AlertTitle>
                  <p className="text-xl">Save Action</p>
                  </AlertTitle>
                  <p className="text-xl">Do you Wish to Save Changes ?</p>
                  <div className="flex flex-row">

                  <Fab
                  onClick={()=>{
                    
                     setLays("rename")
                  }}
                  sx={{width: "30%", marginLeft: "10%", marginTop: "8%"}}
                  size="small"
                  variant="extended"
                  color="primary"
                  >Yes</Fab>
                   <Fab
                  onClick={()=>{
                   getRoute("Qhome")
                     setLays("hide")
                  }}
                  sx={{width: "30%", marginLeft: "10%", marginTop: "8%"}}
                  size="small"
                  variant="extended"
                  color="primary"
                  >No</Fab>

                  </div>
                
              </Alert>
            
              </Backdrop>

              <Backdrop open={(lays==="rename")}
                sx={{ color: '#fff', zIndex: (theme) => theme.zIndex.drawer + 1 }}>
                    <div className="w-[40%]">
                    <VForm
                model={{
                    formLayout:"vertical",
                    formInputs:[
                        {
                            inputName:"name",
                            inputType:"text"
                        }
                    ]
                }}

                handleOutput={((out:any)=>{
                    history(
                        {
                        label:out.name+`- (${name})`,
                        value:GuiDsl(data, layout)}
                        )
                    getRoute("Qhome")
                    setLays("hide")
                })}
                   />
                    </div>
                
            
              </Backdrop>
        </div>
        
        </div>
        </div>
    );
}

export default QAuto;