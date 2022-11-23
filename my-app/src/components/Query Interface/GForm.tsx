import {useState} from 'react';
import { Backdrop, IconButton} from '@mui/material';
import EditIcon from '@mui/icons-material/Edit';
import ClearIcon from '@mui/icons-material/Clear';
import AddIcon from '@mui/icons-material/Add';
// import Save from "./Save"
import{VForm} from "../VForm/FormCompiler"
import GuiDsl from '../GuiToDSL/GuiDsl';
import Form from "../Form/Form"
import {submitStyle} from "../../css/styles/Style"
import Fab from '@mui/material/Fab'

interface appProps {
    data?:any,
    getRoute:(route:string[])=>void,
    sendFormData: (event:any)=>void,
    inputGroup?:any
}

function GForm({data, getRoute, sendFormData, inputGroup}:appProps){
    const [saveForm, setSaveForm] = useState(false)
    const [input, setInput] = useState<any>()
    const [route, setRoute] = useState<any>("input")


    function createNew(intp:any){
        // setNewInput({...newInput, ...intp})
       sendFormData(intp)

    
    }

    
    return (
        <div>
              {
                (data!==undefined)&&
                <div> 
                
                {
                <Backdrop
                sx={{ color: '#fff', zIndex: (theme) => theme.zIndex.drawer + 1}}
                open={route==="input"} >
                 <div className="grid grid-cols-1 w-[40%]"> 

                <div className='flex flex-row-reverse bg-[#e2e8f0] rounded-t-lg mb-[-2%] pb-[2%] w-[100%]' >
                    <IconButton 
                    onClick={(()=>{
                       getRoute(["dataBase", ""])
                    })}>
                        <ClearIcon/>
                    </IconButton>
                </div>
                <div className='flex flex-col bg-[#e2e8f0] rounded-lg mb-[-2%] pb-[2%] w-[100%]'>
                <Fab variant="extended" size="medium" color="primary" aria-label="add" sx={{width:"30%", marginX:"auto", marginY:"3%"}} onClick={(()=>{setRoute("newGroup")})} >
                New Group
                </Fab>
                <Fab variant="extended" size="medium" color="primary" aria-label="add"sx={{width:"30%", marginX:"auto", marginY:"3%"}} onClick={(()=>{setRoute("newInput")})} >
                New Input
                </Fab>
                </div>
               
       
                </div>
                </Backdrop>
                
            }

            {
                <Backdrop
                sx={{ color: '#fff', zIndex: (theme) => theme.zIndex.drawer + 1}}
                open={route==="newInput"} >
                 <div className="grid grid-cols-1 w-[40%]"> 

                <div className='flex flex-row-reverse bg-[#e2e8f0] rounded-t-lg mb-[-2%] pb-[2%] w-[100%]' >
                    <IconButton 
                    onClick={(()=>{
                       getRoute(["dataBase", ""])
                    })}>
                        <ClearIcon/>
                    </IconButton>
                </div>
                <VForm
                model={{
                    formLayout:"vertical",
                    formInputs:[{
                        inputName:"newInput",
                        inputType:"search",
                        options:Object.keys(data).map((it)=>{
                            return {label:it, value:data[it]}
                        })
                    }]
                }}
                handleOutput={((out:any)=>{
                    setInput(out.newInput.value)
                    setRoute("")
                })}
                />
                </div>
                </Backdrop>
                
            }

            {
                <Backdrop
                sx={{ color: '#fff', zIndex: (theme) => theme.zIndex.drawer + 1}}
                open={route==="newGroup"} >
                 <div className="grid grid-cols-1 w-[40%]"> 

                <div className='flex flex-row-reverse bg-[#e2e8f0] rounded-t-lg mb-[-2%] pb-[2%] w-[100%]' >
                    <IconButton 
                    onClick={(()=>{
                       getRoute([""])
                    })}>
                        <ClearIcon/>
                    </IconButton>
                </div>
                <VForm
                model={{
                    formLayout:"vertical",
                    formInputs:[{
                        inputName:"newGroup",
                        inputType:"text"
                    }]
                }}
                handleOutput={((out:any)=>{
                    sendFormData({[out.newGroup]:{
                        id:out.newGroup,
                        name:out.newGroup,
                        type:["group"],
                        input:[],
                        logic:"AND"
                    }})
                    setRoute("")
                })}
                />
                </div>
                </Backdrop>
                
            }
               
                </div>
            }
              {
                (input!==undefined)&& 
                <Backdrop
                sx={{ color: '#fff', zIndex: (theme) => theme.zIndex.drawer + 1}}
                open={(input!==undefined)} >
                 <div className="grid grid-cols-1 w-[40%]"> 

                <div className='flex flex-row-reverse bg-[#e2e8f0] rounded-t-lg mb-[-2%] pb-[2%] w-[100%]' >
                    <IconButton 
                    onClick={(()=>{
                       setInput(undefined)
                    })}>
                        <ClearIcon/>
                    </IconButton>
                </div>
                    <Form inputData={input} 
                    outputData={createNew}
                    inputGroup={inputGroup}
                />
                </div>
                </Backdrop>
                
            }
            {/* <Save open={saveForm} save={handleSave}/> */}
        </div>
    );
}

export default GForm;
