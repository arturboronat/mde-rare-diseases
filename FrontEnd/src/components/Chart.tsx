
import { useState} from "react";

import {
    BarChart,
    Bar,
    XAxis,
    YAxis,
    CartesianGrid,
    Tooltip,
    Legend, PieChart, Pie, Sector, Cell, ResponsiveContainer
  } from "recharts";

interface appProps {
  datgph:any
   
  }

function Chart({datgph}:appProps) {

    return (
        <div>
          <ResponsiveContainer aspect={2}>
               <BarChart
                    // width={600}
                    // height={300}
                    data={datgph}
                    margin={{
                        top: 5,
                        right: 5,
                        left: 5,
                        bottom: 5
                    }}
                    >
          <CartesianGrid strokeDasharray="3 3" />
          <XAxis dataKey="name" 
            style={{fontSize:"80%"}}/>
          <YAxis />
          <Tooltip />
          <Legend />
          <Bar dataKey="value" fill="#8884d8" >
          {datgph.map((entry:any, index:any) => (
          <Cell key={`cell-${index}`} fill={randColor()} />
        ))}
            </Bar>
        </BarChart>
        </ResponsiveContainer>
  </div>
    )
    
}

function randColor(){
    let letters = "0123456789ABCDDEF"
    let color = "#"
    for(let i=0; i<6; i++){
        color += (letters[Math.floor(Math.random()*16)])
    }
    return color
}

export default Chart;
