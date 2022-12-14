import React from "react"
import {FormModel} from "./Model"

export const VFormDSL:FormModel =

{





formLayout:"horizontal",
formInputs:[
   
    {
        inputType:"group",
        inputName:"DEMOGRAPHICS",
        groupInputs:[
            {
                inputType:"text",
                inputName:"SubjectID"
            },
            {
                inputType:"checkbox",
                inputName:"Gender",
                
            },
            {
                inputType:"select",
                inputName:"eyeColor",
                options:{
                    optionType:"enum",
                    data:["blue","grey"]
                }
            },
            {
                inputType:"range",
                inputName:"height",
                min:0,
                max:220
            },
            {
                inputType:"number",
                inputName:"age"
            }
        ],
        logic:"AND"
    },
    {
        inputType:"text",
        inputName:"Name"
    },
    {
        inputType:"disabled",
        inputName:"Age"
    },
 
]





























    












}


























    









//     {
    //       inputType:"range",
    //       inputName:"age",
    //       min:0,
    //       max:90
    //     },
    //     {
    //       inputType:"option",
    //       inputName:"Gender",
    //       options:{
    //         optionType:"data",
    //         data:[
    //           {
    //             label:"Boy",
    //             value:"boy"
    //           },
    //           {
    //             label:"Girl",
    //             value:"girl"
    //           }
    //         ]
    //       }
    //     },
    //     {
    //       inputType:"option",
    //       inputName:"Age",
    //       options:{
    //         optionType:"number",
    //         min:2,
    //         max:100,
    //         range:10
    //       }
    //     },
    //     {
    //       inputType:"text",
    //       inputName:"new Text"
    //     }