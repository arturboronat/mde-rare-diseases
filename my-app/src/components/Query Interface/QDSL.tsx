import {useEffect, useState} from 'react';
import { VForm } from '../VForm/FormCompiler';
import Form from '../Form/Form';
import axios from 'axios'
import { isUndefined } from 'mathjs';
import GuiDsl from '../GuiToDSL/GuiDsl';
import Result from './Result'
import AddIcon from '@mui/icons-material/Add';
import ClearIcon from '@mui/icons-material/Clear';
// import Save from "./Save"
import GForm from "./GForm"
import GFM from './GFM';
import QDataBase from "./QDataBase"
import QHistory from './QHistory';
import {Backdrop, CircularProgress, Fab, IconButton, Alert, AlertTitle} from '@mui/material';
import { setgroups } from 'process';

interface appProps {
    getRoute: (route:string)=>void
    history:(history:any)=>void
}

function QDSL({getRoute, history}:appProps) {


    useEffect(()=>{
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
    const [outPut, setOutPut] = useState<any>()
    const [hist, setHist] = useState<any[]>([])
    const [cNew, setCNew] = useState<{}>()
    const [createN, setCreateN] = useState<any>()
    const [method, setMethod] = useState<any>()
    const [inputFormD, setInputFormD] = useState<any>()
    const [ formData, setFormData] = useState<any>()
    const [saveForm, setSaveForm] = useState(false)
    const [group, setNewGroup] = useState<string[]>([])

    
    function routeController(route:string){
        if(route!=="Qhome"){
            setRoute(route)
        } 
        else{
            getRoute(route)
        }
    }

    function handleSave(event:boolean){
        if(event){
            setSaveForm(false)
            setLays("rename")
        }
        else{
            setRoute("Qhome")
            setSaveForm(false)
        }
    }
    function handleDelete(event:any){
        setDel(event)
        let prev = data
        delete prev[event]
    setData(prev)
        setOutPut(GuiDsl(prev, layout))
    }

    function handleEdit(event:any){
    setEdit(data[event])
    }

    
    function getResult(event:any){
        setResult(event)
        setRoute("result")
        
    }

    async function getData(data:any){
      setName(data.DataBase.label)
      setRoute("ui")
        try{
       const res = await axios.post("http://localhost:5000/presentationModel", data)
        
       if(res.status === 200){
         axios.get("http://localhost:5000/presentationModel").then(res=>{
         setData(res.data[0]);
         setNewGroup([...group, ...res.data[1]])
    })
        }
        
      }
      catch(err){
        console.log(err)
        
      }
      
        setTimeout(()=>{
            setMethod("dsl")
            setRoute("query")
        }, 3000)

    }

    function editForm(intp:any){
    setData({...data, ...intp})
    setOutPut(GuiDsl({...data, ...intp}, layout))
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
                className="text-lg font-bold text-[white] hover:border-b-4">Query UI Design</button>
                <button onClick={(()=>{
                    getRoute("dataBase")
                })} 
                className="text-lg font-bold text-[white] hover:border-b-4">Data Admin</button>
                <button onClick={(()=>{
                    getRoute("Qhome")
                })} 
                className="text-lg font-bold text-[white] hover:border-b-4">Home</button>
            </div>
       
        <div className="w-[220%] ml-[-60%] mt-[20%] z-[70]">
            {/* <QDataBase getRoute={routeController} route={route} dataBase={dataBase} outPut={getData}/> */}

            

           {(method==="dsl")&&
           <GForm 
                data={data} 
                inputGroup={group}
                getRoute={((route)=>{
                setRoute(route[0])
                {(route.length>1)&&setMethod("")}
                setData(undefined)
                })}
                sendFormData={((event)=>{
                   if(event[Object.keys(event)[0]].type[0]==="group"){
                    setNewGroup([...group, event[Object.keys(event)[0]].id])
                   }

                    setInputFormD({...inputFormD, ...event})
                    setFormData(GuiDsl({...inputFormD, ...event}, "horizontal"))
                    setMethod("")
                })}
            />
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
                    // inputGroup={group}
                outputData={editForm}
                />
                </div>
                </Backdrop>
                
            }

           { (route==="query")&&
            
            
            <GFM
                formData={formData} 
                setSave={((event)=>{setSaveForm(event)})}
                addInput={((event)=>{ setMethod(event)})}
                getResult={getResult}
                getRoute={((route)=>{
                    setLays(route)
                })}
            />
            
            
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




            <Backdrop open={(route==="ui")}
                sx={{ color: '#fff', zIndex: (theme) => theme.zIndex.drawer + 1 }}>
              <div className='mt-[-20%] xl:mr-[-50%] 2xl:mr-[30%] p-[30%]'>
                  <p className="text-xl ml-[-50%] 2xl:ml-[-25%]">Please be patient, The DSL is adapting to  {name.split(".")[0]} Schema</p>
                  <CircularProgress  sx={{marginTop: "10%"}}/>
                </div>
            </Backdrop>
     
        {/* <Save open={saveForm} save={handleSave}/> */}

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
                        value:formData
                         }
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

export default QDSL;
