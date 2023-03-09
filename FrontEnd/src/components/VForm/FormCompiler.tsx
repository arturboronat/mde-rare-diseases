
import React, { useState, useEffect} from 'react';
import { TextField,  Slider, Checkbox, Autocomplete, MenuItem, Select, FormControl, InputLabel, IconButton} from '@mui/material';
import ClearIcon from '@mui/icons-material/Clear'
import EditIcon from '@mui/icons-material/Edit';
import {FormModel} from "./Model"
import {optionStyle, formLayout, form, submitStyle, addStyle} from "../../css/styles/Style"
import {sliderStyle, textStyle, inputLabel, checkboxStyle, searchStyle} from "../../css/styles/Style"
import { isUndefined } from 'mathjs';

interface AppProps {
  submitted?:(submit:boolean)=>void;
  handleOutput:(out:object)=>void;
  model:FormModel;
  deleted?:(event:string)=>void;
  edited?:(event:string)=>void;
}



export const VForm = ({submitted, handleOutput, deleted, model, edited}:AppProps)=> {

  /* ===== States ===== */
  let [show, setShow] = useState<any>({})
  let [errNo, setErrNo] = useState<any>({})
  let [data, setData] = useState<any>({})
  let [qClause, setQClause] = useState<any>({})
  let [click, setClick] = useState<boolean>(false)


 

 let newModel = {
    formLayout:model.formLayout,
    formInputs:processModel(model.formInputs)
 } 


 function processModel(mode:FormModel["formInputs"] ){
  let newInputs:FormModel["formInputs"] = mode?.map((item)=>{
    if(isUndefined(item.id)){
     return {...item, id:item.inputName}
    }
    else{
      return item
    }
})

    return newInputs
       
}
  /* ===== Form ===== */
  
  return (
    <div >
      <form className={form} onSubmit={handleSubmit} >
        {generateForm(newModel)}
        <button type="submit" className={submitStyle}>submit</button>
      </form>
    
  </div>
  )

  function generateForm(model:any){
    return(
      <div className={generateLayout(model["formLayout"])}>
              
      {generateInputs(model["formInputs"])}
      
    
    </div>
    )
  }
  
  function generateLayout(element:any){

    return formLayout(element)
  }

  function generateInputs(element:any, groupName?:any, logic?:string){
  
    return(
      element?.map((obj:any)=>{
    
        switch(obj.inputType){
        
          case "text":
            return(<div
            onMouseEnter={(()=>{

                setShow(()=>{
                  return { [obj.id]:"show"}
                })
            })}
            onMouseLeave={(()=>{
              setShow(()=>{
                return { [obj.id]:"hide"}
              })
          })}
            >
              <TextField
                id={obj.id}
                sx={textStyle}
                color = "primary"
                size = "small"
                label={obj.inputName}
                placeholder ={obj.inputName}
                onChange={((event:React.ChangeEvent<HTMLInputElement>)=>{
                  setData((sbData:any)=>{
                  if(groupName===undefined){
                    return {...data, [obj.id]:event.target.value, BOOLEAN_LOGIC:logic}
                  }
                  else{
                    if(groupName in data){
                      sbData = data
                    return {...data, [groupName]:{...sbData[groupName], [obj.id]:event.target.value, BOOLEAN_LOGIC:logic}}
                      
                    }
                    else
                    return {...data, [groupName]:{[obj.id]:event.target.value}}
                  }
                    })               
                })}
              />
                {(!isUndefined(deleted)&&(show[`${obj.id}`]==="show"))&&<IconButton id={obj.id} onClick={()=>{
                    
                    deleted(obj.id)
                  
                }
             }>
            <ClearIcon fontSize="inherit" />
            </IconButton>}
             {(!isUndefined(edited)&&(show[`${obj.id}`]==="show"))&&<IconButton id={obj.id} onClick={()=>{
                  
                  edited(obj.id)
                  
                }
             }>
            <EditIcon fontSize="inherit" />
           </IconButton>}  
            </div>)


          case "digit":
            return(<div
              onMouseEnter={(()=>{
  
                setShow(()=>{
                  return { [obj.id]:"show"}
                })
            })}
            onMouseLeave={(()=>{
              setShow(()=>{
                return { [obj.id]:"hide"}
              })
          })}
            >
              <TextField
                error={errNo[`${obj.id}`]}
                name={obj.id}
                sx={textStyle}
                color = "primary"
                size = "small"
                label={obj.inputName}
                placeholder ={obj.inputName}
                helperText={(errNo[`${obj.id}`])?"please enter a valid number":""}
                onChange={((event: any)=>{
                 let value = event.target.value

                  if(isNaN(Number(value))||value===undefined){
                   setErrNo(()=>{
                   return {...errNo, [obj.id]:true}
                   })
              
                  }
                  else{
                    setErrNo(()=>{
                      return {...errNo, [obj.id]:false}
                      })
                    setData((sbData:any)=>{

                      if(groupName===undefined){
                        return {...data, [obj.id]:`${Number(value)}`}
                      }
                      else{
                        if(groupName in data){
                          sbData = data
                          return {...data, [groupName]:{...sbData[groupName], [obj.id]:`${Number(value)}`, BOOLEAN_LOGIC:logic}}
                          
                        }
                        else
                        return {...data, [groupName]:{[obj.id]:`${Number(value)}`, BOOLEAN_LOGIC:logic}}
                      }
                    })
                      
                  }
                  
                })} 
              />
               { (obj.queryClause !== false)&&<FormControl >
                <InputLabel id="select2"></InputLabel>
                <Select
                  labelId='select2'
                  size="small"
                  onChange={((event: any)=>{

                    let value = event.target.value
               
                     
                      
                       setData((sbData:any)=>{
                         let qC = "="
                         if(value!==undefined){
                           qC = value
                         }
                       
                         if(groupName===undefined){
                           return {...data, [obj.id]:`${qC}${data[`${obj.id}`]}`}
                         }
                         else{
                           if(groupName in data){
                             sbData = data
                             return {...data, [groupName]:{...sbData[groupName], [obj.id]:`${qC}${data[`${groupName}`][`${obj.id}`]}`, BOOLEAN_LOGIC:logic}}
                             
                           }
                           else
                           return {...data, [groupName]:{[obj.id]:`${qC}${data[`${groupName}`][`${obj.id}`]}`, BOOLEAN_LOGIC:logic}}
                         }
                       })
                         
                     
                  })} 
                  
                  >
                  <MenuItem value="= "><em> {"="} </em></MenuItem>
                  <MenuItem value="> "><em> {">"}</em></MenuItem>
                  <MenuItem value="< "><em>{"<"}</em></MenuItem>
                  <MenuItem value=">= "><em>{">="}</em></MenuItem> 
                  <MenuItem value="<= "><em>{"<="}</em></MenuItem>
                  <MenuItem value="≠ "><em>{"≠"}</em></MenuItem>
                </Select>
                </FormControl>
              }

              {(!isUndefined(deleted)&&(show[`${obj.id}`]==="show"))&&<IconButton id={obj.id} onClick={()=>{
                    
                      deleted(obj.id)
                    
                  }
               }>
              <ClearIcon fontSize="inherit" />
            </IconButton>}
               {(!isUndefined(edited)&&(show[`${obj.id}`]==="show"))&&<IconButton id={obj.id} onClick={()=>{
                      edited(obj.id)
                    
                  }
               }>
              <EditIcon fontSize="inherit" />
            </IconButton>}
            </div>)
  
  
          case "checkbox":
            return(<div
              onMouseEnter={(()=>{
  
                setShow(()=>{
                  return { [obj.id]:"show"}
                })
            })}
            onMouseLeave={(()=>{
              setShow(()=>{
                return { [obj.id]:"hide"}
              })
          })}
            >
              <Checkbox
                name={obj.id}
                sx={checkboxStyle}
                color = "primary"
                {...{inputProps:{"aria-label":obj.id}}}
                onChange={((event: any)=>{
                  let checked = event.target.checked
                
                    setData((sbData:any)=>{
                      
                    
                      if(groupName===undefined){
                        return {...data, [obj.id]:checked}
                      }
                      else{
                        if(groupName in data){
                          sbData = data
                          return {...data, [groupName]:{...sbData[groupName], [obj.id]:checked, BOOLEAN_LOGIC:logic}}
                          
                        }
                        else
                        return {...data, [groupName]:{[obj.id]:checked, BOOLEAN_LOGIC:logic}}
                      }
                    })
                })}
              />
                <span className = {inputLabel}>
                  {obj.inputName}
                </span>
              {(!isUndefined(deleted)&&(show[`${obj.id}`]==="show"))&&<IconButton id={obj.id} onClick={()=>{
                    
                      deleted(obj.id)
                    
                  }
               }>
              <ClearIcon fontSize="inherit" />
            </IconButton>}
               {(!isUndefined(edited)&&(show[`${obj.id}`]==="show"))&&<IconButton id={obj.id} onClick={()=>{
                    
                    edited(obj.id)
                    
                  }
               }>
              <EditIcon fontSize="inherit" />
            </IconButton>}
            </div>)


          case"range":
            return(<div
              onMouseEnter={(()=>{
  
                setShow(()=>{
                  return { [obj.id]:"show"}
                })
            })}
            onMouseLeave={(()=>{
              setShow(()=>{
                return { [obj.id]:"hide"}
              })
          })}
            >
              <p className = {inputLabel}>{obj.inputName}</p>
              <Slider
                name={obj.id}
                sx={sliderStyle}
                aria-label="Small"
                defaultValue={0}
                min={obj.min}
                max={obj.max}
                valueLabelDisplay="auto"
                onChange={((event: any)=>{
                  let value = event.target.value

                  setData((sbData:any)=>{
                    if(groupName===undefined){
                      return {...data, [obj.id]:value}
                    }
                    else{
                      if(groupName in data){
                        sbData = data
                      return {...data, [groupName]:{...sbData[groupName], [obj.id]:value, BOOLEAN_LOGIC:logic}}
                        
                      }
                      else
                      return {...data, [groupName]:{[obj.id]:value , BOOLEAN_LOGIC:logic}}
                    }
                  }) 

                })}
              />
              {(!isUndefined(deleted)&&(show[`${obj.id}`]==="show"))&&<IconButton id={obj.id} onClick={()=>{
                    
                      deleted(obj.id)
                    
                  }
               }>
              <ClearIcon fontSize="inherit" />
            </IconButton>}
               {(!isUndefined(edited)&&(show[`${obj.id}`]==="show"))&&<IconButton id={obj.id} onClick={()=>{
                    
                    edited(obj.id)
                    
                  }
               }>
              <EditIcon fontSize="inherit" />
            </IconButton>}
            </div>)

          case "disabled":
           if(Object.entries(data).length===0){
            setData({["id"]:obj.id})
           }
          
            return(<div> 
              <TextField
            //sx={{...textStyle, width:"40.5%", marginLeft: "32%",zIndex: 100}}
            disabled
            id="outlined-disabled"
            label="id"
            defaultValue={obj.id}
            color = "primary"
            size = "small"
              />
              </div>)
             
          case "select":
            return(<div
              onMouseEnter={(()=>{
  
                setShow(()=>{
                  return { [obj.id]:"show"}
                })
            })}
            onMouseLeave={(()=>{
              setShow(()=>{
                return { [obj.id]:"hide"}
              })
          })}
            >
               



               <FormControl sx={optionStyle}>
                <InputLabel id="select">{obj.inputName}</InputLabel>
                <Select
                  labelId='select'
                  name={obj.inputName}
                  size="small"
                  label={obj.inputName}
                  onChange={((event: any)=>{
                    let value = event.target.value
                
                    if(value===""){
                        setData((sbData:any)=>{
                          if(groupName===undefined){
                            return {...data, [obj.id]:undefined}
                          }
                          else{
                            if(groupName in data){
                              sbData = data
                            return {...data, [groupName]:{...sbData[groupName], [obj.id]:undefined, BOOLEAN_LOGIC:logic}}
                              
                            }
                            else
                            return {...data, [groupName]:{[obj.id]:undefined , BOOLEAN_LOGIC:logic}}
                          }
                        })  
                    }
                    else{
                      setData((sbData:any)=>{
                        if(groupName===undefined){
                          return {...data, [obj.id]:value}
                        }
                        else{
                          if(groupName in data){
                            sbData = data
                          return {...data, [groupName]:{...sbData[groupName], [obj.id]:value, BOOLEAN_LOGIC:logic }}
                            
                          }
                          else
                          return {...data, [groupName]:{[obj.id]:value , BOOLEAN_LOGIC:logic}}
                        }
                      }) 
                    }
                  
                  })}
                >
                  <MenuItem value=""><em>none</em></MenuItem>
                  {generateOptions(obj.options)}
                    
                </Select>
              </FormControl>

              {(obj.queryClause !== false)&&<FormControl >
                <InputLabel id="select2"></InputLabel>
                <Select
                  labelId='select2'
                  size="small"
                  onChange={((event: any)=>{

                    let value = event.target.value
               
                    if((data[`${groupName}`][`${obj.id}`]!== undefined)||(data[`${obj.id}`]!==undefined)){
                      setData((sbData:any)=>{
                        let qC = "IS"
                        if(value!==undefined){
                          qC = value
                        }
                      
                        
                        if(groupName===undefined){
                          return {...data, [obj.id]:`${qC}${data[`${obj.id}`]}`}
                        }
                        else{
                          if(groupName in data){
                            sbData = data
                            return {...data, [groupName]:{...sbData[groupName], [obj.id]:`${qC}${data[`${groupName}`][`${obj.id}`]}`, BOOLEAN_LOGIC:logic}}
                            
                          }
                          else
                          return {...data, [groupName]:{[obj.id]:`${qC}${data[`${groupName}`][`${obj.id}`]}`, BOOLEAN_LOGIC:logic}}
                        }
                      })

                    }
                      
                       
                         
                     
                  })} 
                  
                  >
                  <MenuItem value="IS "><em> is </em></MenuItem>
                  <MenuItem value="IS NOT "><em> is not</em></MenuItem>
                </Select>
                </FormControl>}

              {(!isUndefined(deleted)&&(show[`${obj.id}`]==="show"))&&<IconButton id={obj.id} onClick={()=>{
                    
                      deleted(obj.id)
                    
                  }
               }>
              <ClearIcon fontSize="inherit" />
            </IconButton>}
               {(!isUndefined(edited)&&(show[`${obj.id}`]==="show"))&&<IconButton id={obj.id} onClick={()=>{
                    
                      edited(obj.id)
                    
                  }
               }>
              <EditIcon fontSize="inherit" />
            </IconButton>}
            </div>)


          case "search":
            return(<div className="flex flex-row items-center"
            onMouseEnter={(()=>{
              setShow(()=>{
                return { [obj.id]:"show"}
              })
          })}
          onMouseLeave={(()=>{
            setShow(()=>{
              return { [obj.id]:"hide"}
            })
          })}
            >
              <Autocomplete 
                sx={{width:3/5}}
                freeSolo
                disableClearable
                id={obj.id}
                onChange={(event: any, value:string|any)=>{
                  const {id} = event.target
                  setData((sbData:any)=>{
                    if(groupName===undefined){
                      return {...data, [id.split("-")[0]]:value}
                    }
                    else{
                      if(groupName in data){
                        sbData = data
                      return {...data, [groupName]:{...sbData[groupName], [id.split("-")[0]]:value, BOOLEAN_LOGIC:logic}}
                        
                      }
                      else
                      return {...data, [groupName]:{[id.split("-")[0]]:value , BOOLEAN_LOGIC:logic}}
                    }
                  }) 
                }
              }
                options={obj.options}
                renderInput={(params) => (
                  <TextField

                  color = "primary"
                  placeholder ={obj.inputName}
                    {...params}
                    size = "small"
                    InputProps={{
                      ...params.InputProps,
                    }}
                    sx={searchStyle}
                    className="flex-grow"
                  />
                )}
              />
              

              {(obj.queryClause !== false)&&<FormControl >
                <InputLabel id="select2"></InputLabel>
                <Select
                  labelId='select2'
                  size="small"
                  sx={{marginBottom:1}}
                  
                  >
                  <MenuItem value="IS "><em> is </em></MenuItem>
                  <MenuItem value="IS NOT "><em> is not</em></MenuItem>
                </Select>
                </FormControl>}

              
              {(!isUndefined(deleted)&&(show[`${obj.id}`]==="show"))&&<IconButton   id={obj.id} onClick={()=>{
                    
                    deleted(obj.id)
                  
                }
             }>
            <ClearIcon fontSize="inherit" />
          </IconButton>}
             {(!isUndefined(edited)&&(show[`${obj.id}`]==="show"))&&<IconButton id={obj.id} onClick={()=>{
                  
                  edited(obj.id)
                  
                }
             }>
            <EditIcon fontSize="inherit" />
          </IconButton>}   
            </div>) 

          case "date":
            return(<div
              onMouseEnter={(()=>{

                setShow(()=>{
                  return { [obj.id]:"show"}
                })
            })}
            onMouseLeave={(()=>{
              setShow(()=>{
                return { [obj.id]:"hide"}
              })
          })}
            >
              <TextField
                error={errNo[`${obj.id}`]}
                name={obj.id}
                sx={textStyle}
                color = "primary"
                size = "small"
                label={obj.inputName}
                placeholder ={"dd/mm/yyyy"}
                helperText={(errNo[`${obj.id}`])?"please enter a valid date":""}
                onChange={((event: any)=>{
                let value = event.target.value
                  if(value.match(/^(0?[1-9]|[12][0-9]|3[01])[\/\-](0?[1-9]|1[012])[\/\-]\d{4}$/)===null){
                  setErrNo(()=>{
                  return {...errNo, [obj.id]:true}
                  })
              
                  }
                  else{
                    if(value.split("-").length===2||value.split("/").length===2){
                      setErrNo(()=>{
                        return {...errNo, [obj.id]:true}
                        })
                    }
                    else{
                      setErrNo(()=>{
                        return {...errNo, [obj.id]:false}
                        })
                      setData((sbData:any)=>{
                        
                      
                        if(groupName===undefined){
                          return {...data, [obj.id]:value}
                        }
                        else{
                          if(groupName in data){
                            sbData = data
                            return {...data, [groupName]:{...sbData[groupName], [obj.id]:value, BOOLEAN_LOGIC:logic}}
                            
                          }
                          else
                          return {...data, [groupName]:{[obj.id]:value, BOOLEAN_LOGIC:logic}}
                        }
                      })

                    }
                    
                    
                      
                  }
                  
                })} 
              />

              <FormControl >
                <InputLabel id="select2"></InputLabel>
                <Select
                  labelId='select2'
                  size="small"
                  onChange={((event: any)=>{

                    let value = event.target.value
               
                     
                    if((data[`${groupName}`][`${obj.id}`]!== undefined)||(data[`${obj.id}`]!==undefined)){
                       setData((sbData:any)=>{
                         let qC = "="
                         if(value!==undefined){
                           qC = value
                         }
                       
                         if(groupName===undefined){
                           return {...data, [obj.id]:`${qC}${data[`${obj.id}`]}`}
                         }
                         else{
                           if(groupName in data){
                             sbData = data
                             return {...data, [groupName]:{...sbData[groupName], [obj.id]:`${qC}${data[`${groupName}`][`${obj.id}`]}`, BOOLEAN_LOGIC:logic}}
                             
                           }
                           else
                           return {...data, [groupName]:{[obj.id]:`${qC}${data[`${groupName}`][`${obj.id}`]}`, BOOLEAN_LOGIC:logic}}
                         }
                       })
                    }   
                     
                  })} 
                  
                  >
                  <MenuItem value="= "><em> {"="} </em></MenuItem>
                  <MenuItem value="> "><em> {">"}</em></MenuItem>
                  <MenuItem value="< "><em>{"<"}</em></MenuItem>
                  <MenuItem value=">= "><em>{">="}</em></MenuItem> 
                  <MenuItem value="<= "><em>{"<="}</em></MenuItem>
                  <MenuItem value="≠ "><em>{"≠"}</em></MenuItem>
                </Select>
                </FormControl>

              {(!isUndefined(deleted)&&(show[`${obj.id}`]==="show"))&&<IconButton id={obj.id} onClick={()=>{
                    
                      deleted(obj.id)
                    
                  }
              }>
              <ClearIcon fontSize="inherit" />
            </IconButton>}
              {(!isUndefined(edited)&&(show[`${obj.id}`]==="show"))&&<IconButton id={obj.id} onClick={()=>{
                      edited(obj.id)
                    
                  }
              }>
              <EditIcon fontSize="inherit" />
            </IconButton>}
            </div>) 

          case "hpo":
            return(<div
              onMouseEnter={(()=>{
  
                setShow(()=>{
                  return { [obj.id]:"show"}
                })
            })}
            onMouseLeave={(()=>{
              setShow(()=>{
                return { [obj.id]:"hide"}
              })
          })}
            >
              <TextField
                error={errNo[`${obj.id}`]}
                name={obj.id}
                sx={textStyle}
                color = "primary"
                size = "small"
                label={obj.inputName}
                placeholder ={`HP:${`000000`};`}
                helperText={(errNo[`${obj.id}`])?"please enter a valid HPO Ontology":""}
                onChange={((event: any)=>{
                 let value = event.target.value

                  if(value.match(/^([H][P])[:][0-9]+[;]$/)===null){
                   setErrNo(()=>{
                   return {...errNo, [obj.id]:true}
                   })
              
                  }
                  else{
                    setErrNo(()=>{
                      return {...errNo, [obj.id]:false}
                      })
                    setData((sbData:any)=>{

                      if(groupName===undefined){
                        return {...data, [obj.id]:`${value}`}
                      }
                      else{
                        if(groupName in data){
                          sbData = data
                          return {...data, [groupName]:{...sbData[groupName], [obj.id]:`${value}`, BOOLEAN_LOGIC:logic}}
                          
                        }
                        else
                        return {...data, [groupName]:{[obj.id]:`${value}`, BOOLEAN_LOGIC:logic}}
                      }
                    })
                      
                  }
                  
                })} 
              />
                <FormControl >
                <InputLabel id="select2"></InputLabel>
                <Select
                  labelId='select2'
                  size="small"
                  onChange={((event: any)=>{

                    let value = event.target.value
               
                     
                    if((data[`${groupName}`][`${obj.id}`]!== undefined)||(data[`${obj.id}`]!==undefined)){
                       setData((sbData:any)=>{
                         let qC = "IS"
                         if(value!==undefined){
                           qC = value
                         }
                       
                         if(groupName===undefined){
                           return {...data, [obj.id]:`${qC}${data[`${obj.id}`]}`}
                         }
                         else{
                           if(groupName in data){
                             sbData = data
                             return {...data, [groupName]:{...sbData[groupName], [obj.id]:`${qC}${data[`${groupName}`][`${obj.id}`]}`, BOOLEAN_LOGIC:logic}}
                             
                           }
                           else
                           return {...data, [groupName]:{[obj.id]:`${qC}${data[`${groupName}`][`${obj.id}`]}`, BOOLEAN_LOGIC:logic}}
                         }
                       })
                      }     
                     
                  })} 
                  
                  >
                  <MenuItem value="IS  "><em> is </em></MenuItem>
                  <MenuItem value="IS NOT  "><em> is not</em></MenuItem>
                  <MenuItem value="IS LIKE "><em> is like </em></MenuItem>
                  <MenuItem value="IS NOT LIKE "><em> is not like</em></MenuItem>
               
                </Select>
                </FormControl>
                

              {(!isUndefined(deleted)&&(show[`${obj.id}`]==="show"))&&<IconButton id={obj.id} onClick={()=>{
                    
                      deleted(obj.id)
                    
                  }
               }>
              <ClearIcon fontSize="inherit" />
            </IconButton>}
               {(!isUndefined(edited)&&(show[`${obj.id}`]==="show"))&&<IconButton id={obj.id} onClick={()=>{
                      edited(obj.id)
                    
                  }
               }>
              <EditIcon fontSize="inherit" />
            </IconButton>}
            </div>)

        case "orpha":
        return(<div
          onMouseEnter={(()=>{

            setShow(()=>{
              return { [obj.id]:"show"}
            })
        })}
        onMouseLeave={(()=>{
          setShow(()=>{
            return { [obj.id]:"hide"}
          })
      })}
        >
          <TextField
            error={errNo[`${obj.id}`]}
            name={obj.id}
            sx={textStyle}
            color = "primary"
            size = "small"
            label={obj.inputName}
            placeholder ={`ORPHA:${`000000`}`}
            helperText={(errNo[`${obj.id}`])?"please enter a valid ORPHA Ontology":""}
            onChange={((event: any)=>{
            let value = event.target.value

              if(value.match(/^([O][R][P][H][A])[:][0-9]+$/)===null){
              setErrNo(()=>{
              return {...errNo, [obj.id]:true}
              })
          
              }
              else{
                setErrNo(()=>{
                  return {...errNo, [obj.id]:false}
                  })
                setData((sbData:any)=>{

                  if(groupName===undefined){
                    return {...data, [obj.id]:`${value}`}
                  }
                  else{
                    if(groupName in data){
                      sbData = data
                      return {...data, [groupName]:{...sbData[groupName], [obj.id]:`${value}`, BOOLEAN_LOGIC:logic}}
                      
                    }
                    else
                    return {...data, [groupName]:{[obj.id]:`${value}`, BOOLEAN_LOGIC:logic}}
                  }
                })
                  
              }
              
            })} 
          />
            <FormControl >
            <InputLabel id="select2"></InputLabel>
            <Select
              labelId='select2'
              size="small"
              onChange={((event: any)=>{

                let value = event.target.value
          
                if((data[`${groupName}`][`${obj.id}`]!== undefined)||(data[`${obj.id}`]!==undefined)){
                  
                  setData((sbData:any)=>{
                    let qC = "IS"
                    if(value!==undefined){
                      qC = value
                    }
                  
                    if(groupName===undefined){
                      return {...data, [obj.id]:`${qC}${data[`${obj.id}`]}`}
                    }
                    else{
                      if(groupName in data){
                        sbData = data
                        return {...data, [groupName]:{...sbData[groupName], [obj.id]:`${qC}${data[`${groupName}`][`${obj.id}`]}`, BOOLEAN_LOGIC:logic}}
                        
                      }
                      else
                      return {...data, [groupName]:{[obj.id]:`${qC}${data[`${groupName}`][`${obj.id}`]}`, BOOLEAN_LOGIC:logic}}
                    }
                  })
                }    
                
              })} 
              
              >
              <MenuItem value="IS  "><em> is </em></MenuItem>
              <MenuItem value="IS NOT  "><em> is not</em></MenuItem>
              <MenuItem value="IS LIKE "><em> is like </em></MenuItem>
              <MenuItem value="IS NOT LIKE "><em> is not like</em></MenuItem>
          
            </Select>
            </FormControl>
            

          {(!isUndefined(deleted)&&(show[`${obj.id}`]==="show"))&&<IconButton id={obj.id} onClick={()=>{
                
                  deleted(obj.id)
                
              }
          }>
          <ClearIcon fontSize="inherit" />
        </IconButton>}
          {(!isUndefined(edited)&&(show[`${obj.id}`]==="show"))&&<IconButton id={obj.id} onClick={()=>{
                  edited(obj.id)
                
              }
          }>
          <EditIcon fontSize="inherit" />
        </IconButton>}
        </div>)


case "hgvs":
  return(<div
    onMouseEnter={(()=>{

      setShow(()=>{
        return { [obj.id]:"show"}
      })
  })}
  onMouseLeave={(()=>{
    setShow(()=>{
      return { [obj.id]:"hide"}
    })
})}
  >
    <TextField
      error={errNo[`${obj.id}`]}
      name={obj.id}
      sx={textStyle}
      color = "primary"
      size = "small"
      label={obj.inputName}
      placeholder ={`c.${`000`}A>A`}
      helperText={(errNo[`${obj.id}`])?"please enter a valid HGVS SEQUENCE":""}
      onChange={((event: any)=>{
      let value = event.target.value

        if(value.match(/^([c])[.][0-9]+[A-Z]*[>][A-Z]$/)===null){
        setErrNo(()=>{
        return {...errNo, [obj.id]:true}
        })
    
        }
        else{
          setErrNo(()=>{
            return {...errNo, [obj.id]:false}
            })
          setData((sbData:any)=>{

            if(groupName===undefined){
              return {...data, [obj.id]:`${value}`}
            }
            else{
              if(groupName in data){
                sbData = data
                return {...data, [groupName]:{...sbData[groupName], [obj.id]:`${value}`, BOOLEAN_LOGIC:logic}}
                
              }
              else
              return {...data, [groupName]:{[obj.id]:`${value}`, BOOLEAN_LOGIC:logic}}
            }
          })
            
        }
        
      })} 
    />
      <FormControl >
      <InputLabel id="select2"></InputLabel>
      <Select
        labelId='select2'
        size="small"
        onChange={((event: any)=>{

          let value = event.target.value
    
          if((data[`${groupName}`][`${obj.id}`]!== undefined)||(data[`${obj.id}`]!==undefined)){
            
            setData((sbData:any)=>{
              let qC = "IS"
              if(value!==undefined){
                qC = value
              }
            
              if(groupName===undefined){
                return {...data, [obj.id]:`${qC}${data[`${obj.id}`]}`}
              }
              else{
                if(groupName in data){
                  sbData = data
                  return {...data, [groupName]:{...sbData[groupName], [obj.id]:`${qC}${data[`${groupName}`][`${obj.id}`]}`, BOOLEAN_LOGIC:logic}}
                  
                }
                else
                return {...data, [groupName]:{[obj.id]:`${qC}${data[`${groupName}`][`${obj.id}`]}`, BOOLEAN_LOGIC:logic}}
              }
            })
          }    
          
        })} 
        
        >
        <MenuItem value="IS  "><em> is </em></MenuItem>
        <MenuItem value="IS NOT  "><em> is not</em></MenuItem>
        <MenuItem value="IS LIKE "><em> is like </em></MenuItem>
        <MenuItem value="IS NOT LIKE "><em> is not like</em></MenuItem>
    
      </Select>
      </FormControl>
      

    {(!isUndefined(deleted)&&(show[`${obj.id}`]==="show"))&&<IconButton id={obj.id} onClick={()=>{
          
            deleted(obj.id)
          
        }
    }>
    <ClearIcon fontSize="inherit" />
  </IconButton>}
    {(!isUndefined(edited)&&(show[`${obj.id}`]==="show"))&&<IconButton id={obj.id} onClick={()=>{
            edited(obj.id)
          
        }
    }>
    <EditIcon fontSize="inherit" />
  </IconButton>}
  </div>)


          case "group":
         return( <div className="col-span-3 w-12/12 ml-[-8.5%]">
          <div className='bg-[#ffff] text-center py-[1%] my-[2%]'>{obj.id}</div>
            
            <div className="grid grid-cols-3 gap-1 w-12/12 ml-[8%]">
            {generateInputs(processModel(obj.groupInputs),obj.id, obj.logic)} 
            </div>
            
          { (obj.id==="ONTOLOGIES"||obj.id==="DNA SEQUENCE")&&<div className="grid grid-cols-2 gap-1 w-12/12 ml-[8%] mt-[5%] mb-[2%]">
            <div>
            <p className = {inputLabel}>{`${obj.id} Term Pairwise Similarity`}</p>
              <Slider
                name={`${obj.id} Term Pairwise Similarity`}
                sx={sliderStyle}
                aria-label="Small"
                defaultValue={0}
                min={0}
                max={100}
                valueLabelDisplay="auto"
                onChange={((event: any)=>{
                  let value = event.target.value

                    setData({...data, [obj.id]:{...data[obj.id], SIMILARITY:`${value}% data`}})

                })}
              />
            </div>

            <div>
            <p className = {inputLabel}>{"Minimum Matched Terms"}</p>
              <Slider
                name={"Minimum Matched Terms"}
                sx={sliderStyle}
                aria-label="Small"
                defaultValue={0}
                min={0}
                max={100}
                valueLabelDisplay="auto"
                onChange={((event: any)=>{
                  let value = event.target.value

                  setData({...data, [obj.id]:{...data[obj.id], MATCH:`${value}% data`}}) 

                })}
              />
            </div>
            
            </div>}
            

          </div>)  
          
  }
     
      })
  
    )
  
  }

  function generateOptions(entity:any){
    switch(entity.optionType){
      case"data":
        return(
        
        entity.data.map((opt:any) => 
            (
              <MenuItem  value={opt.value}>
                {opt.label}
              </MenuItem>
            )
          )
        )

      case "number":
        return (
            generateData(entity).map((opt) => 
            (
              <MenuItem  value={opt.value}>
                {opt.label}
              </MenuItem>
            )
          )
        )

      case "enum":
        return ( 
            entity.data.map((opt:any) => 
            (
              <MenuItem  value={opt}>
                {opt}
              </MenuItem>
            )
          )
        )  

    }
  }

  function generateData(oN:any):any[]{
    let start = oN.min+oN.range
    let end = (oN.max-oN.range)
    let optionData: any[] = [{label:`${oN.min.toString()}-${(start).toString()}`, value:`${oN.min},${start}`}]
    for(let i=start; i<end; i+=oN.range){
      optionData =
       [  ...optionData,
          {label:`${i.toString()}-${(i+oN.range).toString()}`,
            value: `${i},${i+oN.range}`
            }
        ]
    }
    optionData.push({label:`< ${end}`, value:`${end},${oN.max}`})
    return optionData
  }
  
/* Form Control */

  // function handleCheckbox(event: any, value:any){
  //   const {name, checked} = event.target
  //   data ={...data, [name]:checked}
  // }

  // function handleRange(event: any){
  //   const {name, value} = event.target
  //   data ={...data, [name]:value}
  // }

  // function handleSelect(event: any){
  //   const {name, value} = event.target

  //   if(value===""){
  //     data = {...data, [name]:undefined}
  //   }
  //   else{
  //     data ={...data, [name]:value}
  //   }
  
  //}

  // function handleSearch(event: any, value:string|any){
  //   const {id} = event.target
  //   data ={...data, [id.split("-")[0]]:value.value}
  // }

  // function handleText(event:React.ChangeEvent<HTMLInputElement>){
  //   const {name, value} = event.target
  //   data = {...data, [name]:value}
  // }

  // function handleNumber(event: any){
  //   const {name, value} = event.target
  //   if(isNaN(Number(value))){
  //     errNo = {error:true, text:"Please enter a valid number"}

  //   }
  //   else{
  //     errNo = {error:false, text:""}
  //     data ={...data, [name]:Number(value)}
  //   }
    
  // }

  // function handledelete(event:any){
  //   if(!isUndefined(deleted)){
  //     deleted(event.target.id)
  //   }
    
  // }
  function handleSubmit(event: React.FormEvent<HTMLFormElement>){
    
  //  if(errNo.error !== true){

    
  event.preventDefault()
    
    handleOutput(data)
    
    if(!isUndefined(submitted)){
      submitted(true)
    }
    

    

  // } 
  }
}





 
