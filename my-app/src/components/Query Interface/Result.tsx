import React, {useState, useEffect} from 'react';
import { getJSDocReturnType } from 'typescript';

interface appProps {
    getRoute: ()=>void
    data:{}
}
function Result({getRoute, data}:appProps) {


    return (
        <div className=' flex flex-col  items-center '>
    
        <h1 className='text-center text-black text-2xl  opacity-70 font-[sans]'>Your Search Returned</h1>

        <div className='border-2 w-6/12'>
        
       
        <h1 className='break-words tracking-wider leading-10  py-2 font-[sans-serif] text-center bg-[white]'>{JSON.stringify(data)}</h1>          
      
    
    </div> 
        <button onClick={(()=>{
            getRoute()
        })} className="rounded-lg w-1/12 mx-auto  mt-8  h-10 btn btn-lg bg-[#38bdf8] hover:bg-[#60a5fa] text-sm">Go Back</button>
        </div>
    );
}

export default Result;