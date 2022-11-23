import React, {useState, useEffect} from 'react';
import GuiDsl from './GuiToDSL/GuiDsl';
import Header from './Header'
import Footer from './Footer'
import Result from "./Query Interface/Result"
import {VForm} from './VForm/FormCompiler'
import {VFormDSL} from './VForm/VFormDSL'
import {FormModel} from "./VForm/Model"
import Upload from "./DataBase/Upload"
import Form from "../components/Form/Form"
import axios from 'axios';
import { resolveSrv } from 'dns/promises';
import { isUndefined } from 'mathjs';
import Home from "./Home";
import DataBase from './DataBase/DataBase'
import Query from './Query Interface/Query';



function App() { 

const [out, formOut] =  useState({})
const [route, setRoute] = useState("home")



function getRoute(route:string){
  setRoute(route)
}

function formOutput(outData:{}){  
    formOut(outData);
}


    return (
      <div className="h-5/6">
        {/* <Header /> */}
        
        
       
        {
          (route==="home")&&
          <Home 
          getRoute={getRoute}
          />
        }

        {
          (route==="query")&&
          <Query
          getRoute={getRoute}
          />
        }

        {
          (route==="dataBase")&&
          <DataBase 
          getRoute={getRoute}
          />
        }

        <Footer />
      </div>
    );
  };
  

// function getInput(data:any){
//   let input:any[] = []

//   for(let i in data){
//       let x = {
//         inputName:i,
//         inputType:"checkbox"
//       }
//       input = [...input, x]
//   }
//   let outModel:FormModel = {
//     formLayout:"horizontal",
//     formInputs:input
//   }
//   return outModel
// }
  export default App;