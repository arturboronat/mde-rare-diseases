import { url } from 'inspector';
import React, { useState, useEffect } from 'react';
import Fab from "@mui/material/Fab"
interface appProps {
    getRoute: (route:string)=>void
}

function Home({getRoute}:appProps) {
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
    return (
        <div  className={`grid grid-cols-2 home bg-cover h-[100%] ${opac}`} >
            <div className="home-bg  w-[200%]  h-[100%] bg-cover opacity-50 "></div>
            <div className="flex flex-col z-[70] w-[80%] ml-[-42%]  ">
            <div className="flex flex-row-reverse w-[100%] gap-4  mt-[2%] ml-[50%] opacity-90">
            <button onClick={(()=>{
                // setTimeout(()=>{setOpac("opacity-90")},100)
                // setTimeout(()=>{setOpac("opacity-70")},150)
                // setTimeout(()=>{setOpac("opacity-50")},200)
                // setTimeout(()=>{setOpac("opacity-30")},250)
                // setTimeout(()=>{setOpac("opacity-10")},300)
                // setTimeout(()=>{getRoute("query")},350)
                getRoute("query")
            })}
            className="text-lg font-bold text-[white] hover:border-b-4">Query UI Design</button>
            <button  onClick={(()=>{
                getRoute("dataBase")
            })} 
            className="text-lg font-bold text-[white] hover:border-b-4">Data Admin</button>
            <button   onClick={(()=>{
                getRoute("home")
            })} 
            className="text-lg font-bold text-[white] hover:border-b-4">Home</button>
   

                </div>
                <div className='mt-[38%]'>
                <p className="text-center  text-[white] text-2xl font-bold" > 
                This is an automated query Interface
                Prototype for Cafe Variome, sponsored by MDNET.
                 It provides functionality for automating a
                user interface from a dataset. </p>
            <div className="flex flex-row gap-16 ml-[10%] mt-[7%]">
            <Fab  sx={{width: "35%"}} variant="extended"  color="primary"  
            onClick={(()=>{
                getRoute("dataBase")
            })} >Data Admin</Fab>
            <Fab sx={{width: "35%", border: "40%", borderColor: "black"}}  
             variant="extended"  color="primary"  
            onClick={(()=>{
                getRoute("query")
            })} >Query UI Design</Fab>
            </div>
                </div>
           
           
            </div>
           
            
        </div>
    );
}

export default Home;