import React from 'react';

function GuiDsl(gui:any, layout:any) {
        let k:any[] = []
        let group = new Set()
        for(let i in gui){
          if(gui[i].group !==undefined){
            // if(group.has(gui[i].group)){
              let idx =  k.findIndex((itm)=>{return itm?.id===gui[i].group})
              if(idx!==-1){
                if(k[idx]?.groupInputs.findIndex((it:any)=>{return it?.id===gui[i].id})===-1){
                  k[idx]?.groupInputs.push(generateInput(gui[i]))
                  }  
              }
              else{
                k.push(
                       {
                         inputType:"group",
                         id:gui[i].group,
                         inputName:gui[i].group,
                         groupInputs:[generateInput(gui[i])],
                         logic:"AND"
                       }
                     )
              }
              
             

              
            //  }
            //  else{
            //    group.add(gui[i].group)
            //    k.push(
            //      {
            //        inputType:"group",
            //        inputName:gui[i].group,
            //        groupInputs:[generateInput(gui[i])],
            //        logic:"AND"
            //      }
            //    )
            //  }
          }
          else{

            k.push(generateInput(gui[i]))
          }

        }
        
        let dsl:any = {
          formLayout:layout,
          formInputs:k
        }
        return dsl
}


function generateInput(inputData:any){

  switch(inputData.type[0]){
    case "search":
      return{
        inputName:inputData.name,
        id:inputData.id,
        inputType:inputData.type[0],
        options:inputData.data.map((element:any) => {
          return  element.value
        })
      }
    break;

    case "range":
      return{
        inputName:inputData.name,
        id:inputData.id,
        inputType:inputData.type[0],
        min:inputData.min,
        max:inputData.max
      }
    break;

    case "select":
      return{
        inputName:inputData.name,
        id:inputData.id,
        inputType:inputData.type[0],
        options:{
          optionType:"data",
          data:inputData.data
        }
      }
    break;

    case "checkbox":
      return{
        inputName:inputData.name,
        id:inputData.id,
        inputType:inputData.type[0]
      }
    break;

    case "digit":
      return{
        inputName:inputData.name,
        id:inputData.id,
        inputType:inputData.type[0],
      }
    break;

    case "date":
      return{
        inputName:inputData.name,
        id:inputData.id,
        inputType:inputData.type[0],
      }
    break;

    case "hgvs":
      return{
        inputName:inputData.name,
        id:inputData.id,
        inputType:inputData.type[0],
      }
    break;

    case "orpha":
      return{
        inputName:inputData.name,
        id:inputData.id,
        inputType:inputData.type[0],
      }
    break;

    case "hpo":
      return{
        inputName:inputData.name,
        id:inputData.id,
        inputType:inputData.type[0],
      }
    break;

    case "group":
      return{
        inputName:inputData.name,
        id:inputData.id,
        inputType:inputData.type[0],
        groupInputs:inputData.input,
        logic:inputData.logic
      }
    break;
  }

}

export default GuiDsl;