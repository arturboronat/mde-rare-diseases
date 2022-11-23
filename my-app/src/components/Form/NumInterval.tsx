



 function getNumberData(max:any, min:any, std:any, mean:any){
    let  numberData:any = []
    let count = mean
    let label =""
      while(count<max){
        count+=std
        label = ((count-std).toString()+" - "+(count.toString()))
        if(count>=max){
          label =`<${count-std}`
        }
        numberData= [...numberData, 
            {
              label:label, 
              value:[count-std, count-1]
            }
          ]
        
      }
      count = mean
    
      while(count>min){
        count-=std
        let r = 1
        if(count<=min){
          r = 0
        }
        label = ((count*r).toString()+" - "+((count+std-1).toString()))
        
        numberData= [ 
            {
              label:label, 
              value:[(count)*r, (count+std-1)]
            },
            ...numberData
          ]
        
      }

      return numberData
    }



    function getpgh(numData:any, nData:any){
        let pos = 0
        let data = {}
        for (let q in nData){
         let count = 0
         let kem = numData.sort((a:any,b:any)=>{
           return a-b
         })
         while(kem[pos]<=nData[q]["value"][1]){
           count++
           pos++
         }
         
         data = {...data, [nData[q]["value"]]:((count/kem.length)*100)}
         
         
         count = 0
        }
        
        return data
          
         }



export    function drawInput(inputData:any, stdy:number){
let data =  getNumberData(inputData.max, inputData.min, stdy*inputData.std, inputData.mean)
    let tsds:any = getpgh(inputData.numData, data )
    let das:any = []
    for(let k in tsds){
        
        das = [...das, {name:k, value:tsds[k]}]
    
    }
    
    return [das, data]
}