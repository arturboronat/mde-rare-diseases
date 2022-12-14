import React from "react"
export const form = `w-12/12 grid grid-col  mx-auto   mb-10 py-8  rounded-lg pt-8 bg-[#e2e8f0]`


export function formLayout(layout?:("vertical"|"horizontal")){ 

    if(layout==="vertical"){
     return "flex flex-col ml-[32%] w-12/12 "
     } 
     else{
      return `grid grid-cols-3 gap-1 ml-[8%] w-12/12`
     }
 
}

export const formInput = `input rounded-xl h-10 w-5/12  bg-white`
export const submitStyle = 'rounded-xl 2xl:w-1/12 xl:w-2/12  h-10 btn btn-lg bg-[#38bdf8] hover:bg-[#60a5fa] mt-8 mb-8  mx-auto sm:text-sm md:text-base lg:text-lg xl:text-lg 2xl:text-xl'
export const addStyle = 'rounded-lg w-1/12   h-10 btn btn-lg bg-[#38bdf8] hover:bg-[#60a5fa] mt-[-18.5%] grid place-self-center place-items-center ml-[10%]'
export const inputLabel = 'ml-1 mb-1 font-[sans-serif] text-[#262626] opacity-70 w-6/12 overflow-hidden sm:text-xs md:text-xs lg:text-sm xl:text-base 2xl:text-lg '
export const selectLabel = 'font-[sans-serif] w-6/12  sm:text-sm md:text-sm lg:text-sm xl:text-sm 2xl:text-sm'
export const uploadButton = "rounded-lg w-5/12   h-10 btn btn-lg bg-[#38bdf8] hover:bg-[#60a5fa] mt-8 mb-8"
export const upload = "w-10/12 mb-10 mx-auto bg-[#e2e8f0] grid grid-cols-3 rounded-xl gap-4 justify-items-center"
export const sliderStyle:{} = 
{ 
  marginLeft: 1,
  width: 2/3
}

export const textStyle:{} = 
{
  backgroundColor: "#f5f5f4",
  width:3/5,
  marginBottom: 1,
}

export const searchStyle:{} = 
{
  backgroundColor: "#f5f5f4",
  width:2/2,
  marginBottom: 1,
}

export const checkboxStyle:{} = 
{
  marginBottom: 1,
  marginTop: 1,
  paddingTop:1,
  paddingRight:0

}

export const optionStyle:{} = 
{
  width: 3/5,
  marginBottom:2
}