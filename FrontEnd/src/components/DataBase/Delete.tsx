import {useState, useEffect} from 'react';
import axios from 'axios'
import { VForm } from '../VForm/FormCompiler';
import { FormModel } from '../VForm/Model';
import { Alert, AlertTitle, Backdrop, CircularProgress, Fab } from '@mui/material';

interface appProps {
    deleted: ()=>void
}

function Delete({deleted}:appProps) {
    const [route, setRoute] = useState("")
    const [name, setName] = useState("")
    const [dataBase, setDataBase] = useState<string[]>([])

    async function deleteData(file:any){
        setName(file.DataBase)
        setRoute("deleting")
        try{
         const res =  await axios.post("http://localhost:5000/delete", file)
        } 
        catch(error){
          console.log(error)
        }

        setTimeout(()=>{
            setRoute("success")
        }, 1000)
    }

   

  

    return (
        <div>
              
              

                <Backdrop open={(route==="deleting")}
                sx={{ color: '#fff', zIndex: (theme) => theme.zIndex.drawer + 1 }}>
              <div className='mt-[-20%] mr-[-20%] p-[30%]'>
                  <p className="text-xl ml-[-35%]">Removing {name.split(".")[0]} from file storage</p>
                  <CircularProgress  sx={{marginTop: "10%"}}/>
              </div>
              </Backdrop>
  
              <Backdrop open={(route==="success")}
                sx={{ color: '#fff', zIndex: (theme) => theme.zIndex.drawer + 1 }}>
              <Alert sx={{height: "25%", marginTop: "-20%"}} severity='info'>
                  <AlertTitle>
                  <p className="text-xl">Confirmation</p>
                  </AlertTitle>
                  <p className="text-lg">{name.split(".")[0]}  has been successfully removed from the file storage</p>
                  <Fab
                  onClick={()=>{
                      deleted()
                  }}
                  sx={{width: "15%", marginLeft: "40%", marginTop: "8%"}}
                  size="small"
                  variant="extended"
                  color="primary"
                  >Done</Fab>
              </Alert>
              </Backdrop>
              
        </div>
    );
}

export default Delete;