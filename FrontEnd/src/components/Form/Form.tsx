import {FormModel} from "../VForm/Model"
import { VForm } from "../VForm/FormCompiler";
import { useState} from "react";
import { isUndefined } from "mathjs";
import { Backdrop, TextField, IconButton } from "@mui/material";
import {textStyle} from "../../css/styles/Style"
import ClearIcon from '@mui/icons-material/Clear';
import InfoIcon from '@mui/icons-material/Info';
import {drawInput} from "./NumInterval"
import Chart from "../Chart";

interface appProps {
    outputData:(omD:object[])=>void;
    inputData?:any
    inputGroup?:any
   
  }

function Form({ inputData, outputData, inputGroup}:appProps) {

let [datgph, setDatgph] = useState(inputData.aut)
let [datNum, setDatNum] = useState(inputData.data)
let [sj, setSj] = useState("false")
let [ge, setGe] = useState("true")
let [createGroup, setCreateGroup] = useState("false")

function submitted(submitted:Boolean){}


function typeOutput(type:any){ 

  let newName = type.inputName 
  if(isUndefined(newName)||newName===""){
    newName = inputData.name
  }
  let inType = inputData.type.filter((item:any)=>{
    return type.inputType != item
  })
  inType = [type.inputType, ...inType]

  if(isUndefined(type.inputType)||(type.inputType.length===0)){
        inType = inputData.type
  }

  let groupName = inputData.group
  if(!isUndefined(type.groupName)){
    groupName = type.groupName
  }

let datAut = datNum
let datAutGp = datgph


  let dat:any = {
    [inputData.id]:{
    id:inputData.id,
    std:inputData.std,
    name:newName,
    type:inType,
    min:inputData.min,
    max:inputData.max,
    mean:inputData.mean,
    data:datAut,
    aut:datAutGp,
    numData:inputData.numData,
    group:groupName


  }
}

outputData(dat)
}


function typeInput(input?:any[]){
let options = ["text", "checkbox", "range", "select"]
let inputG = []
if(!isUndefined(input)){
    options = input
}
if(!isUndefined(inputGroup)){
  inputG = inputGroup
}
    const model:FormModel = {
        formLayout:"vertical",
        formInputs:[
           {
            inputName:"inputName",
            inputType:"text"
           },
            {
                inputType:"select",
                inputName:"inputType",
                queryClause:false,
                options:{
                    optionType:"enum",
                    data:options
                }
            },
            {
              inputType:"select",
              inputName:"groupName",
              queryClause:false,
              options:{
                  optionType:"enum",
                  data:[
                    ...inputG
                  ]
              }
          }
        ]
    }

    return model
}




return (
        <div> 
   
       
               
                <div className="bg-[#e2e8f0] pt-[5%] w-[100%]  rounded-t-lg" >
            <TextField
            sx={{...textStyle, width:"40.5%", marginLeft: "32%",zIndex: 100}}
            disabled
            id="outlined-disabled"
            label="id"
            defaultValue={inputData.id}
            color = "primary"
            size = "small"
              />
                </div>
            
            <div className='w-[100%]  mx-auto z-[90] mt-[-3%] mb-[-5%]'>
                <VForm  
            submitted={submitted}
             model={typeInput(inputData.type)} 
             handleOutput={typeOutput}
             />
             {(inputData.aut!==undefined)&&<IconButton sx={{marginTop: "-30%", marginLeft: "90%"}} onClick={(()=>{
                setSj("true")
             })}><InfoIcon /></IconButton>}
              </div>
               { (inputData.aut!==undefined)&&
                 <Backdrop  
                 sx={{ zIndex: (theme) => theme.zIndex.drawer + 1 }}
                     open={(sj==="true")} >
                        <div className='w-[70%] h-[60%] z-[90] bg-[white] p-[5%] pr-[-10%]' >
                    
           <div className="mt-[-9%]  ml-[104%] pb-[2%] pt-[1%]">
           <IconButton 
            onClick={(()=>{
                setSj("false")
            })}>
                <ClearIcon/>
            </IconButton>
            </div>   
               {(ge==="true")&&<div>
                <Chart datgph={datgph} />
        <VForm model={{
        formLayout:"vertical",
        formInputs:[
            {
                inputType:"number",
                inputName:"std"
            }
        ]
        }}
        handleOutput={((out:any)=>{
            
            
           let  draGph = drawInput(inputData, out["std"])
            setDatgph(draGph[0])
            setDatNum(draGph[1])

        
     })}/>
     </div>
        }
     
        </div>
          </Backdrop>}

        </div>
    )
}

export default Form;