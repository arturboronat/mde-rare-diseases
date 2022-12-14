import {useState, useEffect} from 'react';
import {form} from "../../css/styles/Style"
import axios from "axios"
import FileUploadIcon from '@mui/icons-material/FileUpload';
import { Alert, AlertTitle, Backdrop, Card, CardContent, CircularProgress, Fab, IconButton } from '@mui/material';
import { CheckCircle, CloudDone, UploadFile } from '@mui/icons-material';
import FileUpload from '@mui/icons-material/FileUpload';


interface appProps {
    uploaded: ()=>void
}
const Upload = ({uploaded}:appProps)=>{
const [route, setRoute] = useState("")
const [name, setName] = useState("")
const [file, setFile] = useState<string|Blob>("")

async function uploadFile(){
    
    setRoute("uploading")
    const formData = new FormData()
    formData.append("file", file)
    formData.append("fileName", name)
    try{
     await axios.post("http://localhost:5000/files", formData)
    } 
    catch(error){
      console.log(error)
    }
   
    setTimeout(()=>{setRoute("success")}, 2000)
}

    return (
        <div>
         
         <div className={form}>
            <input type="file" onChange={(e)=>{
             if(e.target.files !==null){
                setFile(e.target.files[0])
                setName(e.target.files[0].name)
             }
               
            }} />
            
             <Fab 
             sx={{width: "24%", marginX: "auto", marginTop: "5%"}}
             variant="extended"
             size="small"
             color="primary" onClick={uploadFile}>
              UPload
               </Fab>
        </div>
            <Backdrop open={(route==="uploading")}
              sx={{ color: '#fff', zIndex: (theme) => theme.zIndex.drawer + 1 }}>
            <div className='mt-[-20%] mr-[-20%] p-[30%]'>
                <p className="text-xl ml-[-35%]">Uploading {name.split(".")[0]} to DataBase,  please wait</p>
                <CircularProgress  sx={{marginTop: "10%"}}/>
            </div>
            </Backdrop>

            <Backdrop open={(route==="success")}
              sx={{ color: '#fff', zIndex: (theme) => theme.zIndex.drawer + 1 }}>
            <Alert sx={{height: "25%", marginTop: "-20%"}} severity='success'>
                <AlertTitle>
                <p className="text-xl">Success</p>
                </AlertTitle>
                <p className="text-lg">Congratulations, {name.split(".")[0]}  has been uploaded successfully</p>
                <Fab
                onClick={()=>{
                    uploaded()
                    setRoute("")
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

export default Upload;