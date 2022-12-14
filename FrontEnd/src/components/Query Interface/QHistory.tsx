import React from 'react';
import {useEffect, useState} from 'react';
import { FormModel } from '../VForm/Model';
import { VForm } from '../VForm/FormCompiler';
import ClearIcon from '@mui/icons-material/Clear';
import { Backdrop, IconButton } from '@mui/material';
import { isUndefined } from 'mathjs';
import Result from "./Result"




interface appProps {
    outPut?:(outPut:any)=>void,
    history:any,
    getRoute:(route:string)=>void
}

function QHistory({history, getRoute}:appProps) {


    useEffect(()=>{
 
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


    const [opac, setOpac] = useState("opacity-10")
    const [result, setResult] = useState<{}>()
    const [frm, setFrm] = useState()
    const [route, setRoute] = useState("historyDB")

    function generateForm(history:any){
        let form:FormModel ={
            formLayout:"vertical",
            formInputs:[
                {
                    inputName:"history",
                    inputType:"select",
                    options:{
                        optionType:"data",
                        data:history
                    }
                }
            ]
        }
    
        return form
    }

    function getResult(event:any){
        setResult(event)
        setRoute("result")
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
       
            <div>

                <Backdrop
                    sx={{ color: '#fff', zIndex: (theme) => theme.zIndex.drawer + 1}}
                    open={(route==="historyDB")} 
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
                                    <div>
                                        <VForm
                                            model={generateForm(history)}
                                            handleOutput={((out:any)=>{
                                                setFrm(out.history)
                                                setRoute("form")
                                            })}
                                        />
                                    </div>
                                </div>
                                    
                        </div>
                    </div>
                </Backdrop>
                <div className='w-[150%] ml-[-30%] mt-[6%]'>
                {
                ((route==="form")&&(!isUndefined(frm)))&&
                <VForm 
                    model={frm}
                    handleOutput={((it)=>{
                        setRoute("result")
                        setResult(it)
                    })}
                />
                }
                {
                (route==="result")&&(!isUndefined(result))&&
                <Result 
                    data={result}
                    getRoute={(()=>{setRoute("form")})}
                />
                }
                </div>
               

                </div>
 
              </div>
        </div>
        
    );
}

export default QHistory
