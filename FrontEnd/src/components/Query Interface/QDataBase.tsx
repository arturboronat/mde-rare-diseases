import React from 'react';
import {useEffect, useState} from 'react';
import { FormModel } from '../VForm/Model';
import { VForm } from '../VForm/FormCompiler';
import ClearIcon from '@mui/icons-material/Clear';
import { Backdrop, IconButton } from '@mui/material';
import axios from 'axios'

interface appProps {
    dataBase?:any,
    route:string,
    outPut:(outPut:any)=>void,
    getRoute:(route:string)=>void
}

function QDataBase({dataBase, route, outPut, getRoute}:appProps) {

    // useEffect(()=>{
        axios.get("http://localhost:8080/getDataBase").then((res)=>{
            setDataBase(res.data)
        })
    // }, [])

     const [db,setDataBase] = useState<any>("")

    return (

        <div>

            <Backdrop
                sx={{ color: '#fff', zIndex: (theme) => theme.zIndex.drawer + 1}}
                open={(route==="dataBase"&&db!="")} 
            >
                <div className="grid grid-cols-1 w-[50%] mr-[10%] mb-[10%]" > 
                <div className="mb-[-8%] ml-[95%]">
                    <IconButton 
                            onClick={(()=>{
                            getRoute("Qhome")
                            })}>
                                <ClearIcon/>
                    </IconButton>
                </div>               
                       
                        <div className="flex flex-row">

                            <div className="w-[100%] ml-[10%] ">
                                <VForm 
                                    model={db} 
                                    handleOutput={outPut}
                                />
                            </div>
                        </div>
                </div>
            </Backdrop>

   

        </div>
         
    );
}

export default QDataBase;
