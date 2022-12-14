import {useEffect, useState} from 'react';
import { FormModel } from '../VForm/Model';
import { VForm } from '../VForm/FormCompiler';
import Form from '../Form/Form';
import axios from 'axios'
import { isUndefined } from 'mathjs';
import GuiDsl from '../GuiToDSL/GuiDsl';
import Result from './Result'
import AddIcon from '@mui/icons-material/Add';
import ClearIcon from '@mui/icons-material/Clear';
import HistoryIcon from '@mui/icons-material/History';
import GForm from "./GForm"
import GFM from './GFM';
import Query from "./QAuto"
import PrecisionManufacturingIcon from '@mui/icons-material/PrecisionManufacturing';
import BuildCircleIcon from '@mui/icons-material/BuildCircle'
import {Card, CardContent, CardActions} from '@mui/material';


import {Backdrop, CircularProgress, Fab, IconButton} from '@mui/material';

interface appProps {
    getRoute: (route:string)=>void
}

function QHome({getRoute}:appProps) {


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
    const [route, setRoute] = useState("home")


    return (
        <div className={`grid grid-cols-2 home  min-h-full bg-cover ${opac}`} >  
        
       
       <div className="query-bg h-[100%] w-[200%] bg-cover opacity-50"></div>
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
                    getRoute("home")
                })} 
                className="text-lg font-bold text-[white] hover:border-b-4">Home</button>

            </div>
       
        <div className="w-[220%] ml-[-60%] mt-[20%] z-[70]">
        { 
           <div className="flex flex-row gap-4 justify-center mt-[3%] mx-[auto] w-[90%]">
  
            <Card sx={{marginX: "1%", padding: "2%"}} >
             <CardContent sx={{paddingX: "auto"}}>
             <BuildCircleIcon  sx={{width: "60%", height:"60%",  marginLeft:"18%"}} />
             <p>
             This Manually employs the The Data-driven Powered DSL for building its Interface
             </p>
             </CardContent>
             <CardActions >
             <Fab sx={{marginX: "auto"}}  variant="extended" color="primary" onClick={(()=>{
                 getRoute("dsl")
             })}>Generate UI From DSL</Fab>
             </CardActions>
            </Card>
          
            <Card sx={{marginX: "1%", padding: "2%"}}>
             <CardContent>
             <PrecisionManufacturingIcon sx={{width: "60%", height:"60%",  marginLeft:"18%"}}/>
             <p>
             This Automatically Infer all UI based on the Presentation Algorithm
             </p>
             </CardContent>
             <CardActions>
             <Fab sx={{marginX: "auto"}}  variant="extended"   color="primary"  onClick={(()=>{
                getRoute("automate")
             })}>Automate UI from DataSet</Fab>
             </CardActions>
            </Card>

            <Card sx={{marginX: "1%", padding: "2%"}}>
             <CardContent >
             <HistoryIcon sx={{width: "60%", height:"60%", marginLeft:"18%"}}/>
             <p>
                View Existing Interfaces from history, that have been stored for future references
             </p>
             </CardContent>
             <CardActions>
             <Fab sx={{marginX: "auto"}}  variant="extended"   color="primary"  onClick={(()=>{
                getRoute("history")
             })}>Search Existing Interface</Fab>
             </CardActions>
            </Card>

            <Card sx={{marginX: "1%", padding: "2%"}} >
             <CardContent sx={{paddingX: "auto"}}>
             <BuildCircleIcon  sx={{width: "60%", height:"60%",  marginLeft:"18%"}} />
             <p>
             This Manually employs the The Data-driven Powered DSL for building its Interface
             </p>
             </CardContent>
             <CardActions >
             <Fab sx={{marginX: "auto"}}  variant="extended" color="primary" onClick={(()=>{
                 getRoute("code")
             })}>Generate UI From Code</Fab>
             </CardActions>
            </Card>
          
             
          </div>
        }
        </div>
        </div>
        </div>
    );
}

export default QHome;
