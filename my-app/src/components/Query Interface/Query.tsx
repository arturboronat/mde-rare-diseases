import React, { useState } from 'react';
import QAuto from './QAuto';
import QDSL from './QDSL';
import QHome from './QHome';
import QHistory from "./QHistory"
import Qcode from './Qcode';
import { isUndefined } from 'mathjs';

interface appProps {
    getRoute: (route:string)=>void
}

function Query({getRoute}:appProps) {
    const [route, setRoute] = useState("Qhome")
    const [history, setHistory] = useState<any[]>([])
   function saveHistory(newHistory:any){
        setHistory([...history, newHistory])
   }
    function handleRoute(route:string){
        switch(route){
            case "automate":
                setRoute("automate")
            break
            case "dsl":
                setRoute("dsl")
            break
            case "Qhome":
                setRoute("Qhome")
            break
            case "history":
                setRoute("history")
            break
            case "code":
                setRoute("code")
            break
            default:
                getRoute(route)
        }
       
       
    }
    return (
        <div className="h-[100%]">
           { (route==="Qhome")&&<QHome getRoute={handleRoute}/>}
           { (route==="automate")&&<QAuto history={saveHistory} getRoute={handleRoute}/>}
           { (route==="dsl")&&<QDSL history={saveHistory} getRoute={handleRoute}/>}
           { (route==="code")&&<Qcode history={saveHistory} getRoute={handleRoute}/>}
           {(route==="history")&& <QHistory  getRoute={handleRoute} history={history}/>}
        </div>
    );
}

export default Query;