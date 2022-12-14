import React from 'react';
import AddIcon from '@mui/icons-material/Add';
import ClearIcon from '@mui/icons-material/Clear';
import {Backdrop, CircularProgress, Fab, IconButton} from '@mui/material';
import {VForm} from "../VForm/FormCompiler"
import { getJSDocReturnType } from 'typescript';
interface appProps {
    formData?:any
    setSave:(save:boolean)=>void,
    addInput?:(input:any)=>void,
    getResult:(event:any)=>void,
    getRoute:(event:string)=>void,
}
function GFM({formData, setSave, addInput, getResult, getRoute}:appProps) {
    return (<div>
    {(formData!==undefined)&&<div>
        <div className='flex flex-row-reverse bg-[#e2e8f0] rounded-t-lg mb-[-2%] pb-[2%] '>
        <IconButton 
            onClick={(()=>{

               getRoute("save")
            })}>
                <ClearIcon sx={{color:"black"}}/>
            </IconButton>
           {(addInput!==undefined)&& <IconButton 
            onClick={(()=>{
               addInput("dsl")
            })}>
                <AddIcon sx={{color:"black"}}/>
            </IconButton>}
            </div>
        <VForm 
        model={formData} 
        handleOutput={((event)=>{
            getResult(event)
            
        })} 
        // deleted={handleDelete} 
        // edited={handleEdit} 
        />
        </div>}
    </div>
    
    )
}

export default GFM;