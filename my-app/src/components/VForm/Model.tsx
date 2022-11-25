import React from "react"

export type FormModel = {
  formLayout?: Layout;
  formInputs?: (text|num|checkbox|range|select|search|date|group|hpo|orpha|hgvs|Disabled)[];
}

type Layout = "vertical"|"horizontal"

type text = {
  inputType:"text",
  inputName: string,
  id?:string
}

type num = {
  inputType:"number",
  inputName: string,
  id?:string
}

type checkbox = {
  inputType:"checkbox",
  inputName: string,
  id?:string
}

type Disabled = {
  inputType:"disabled",
  inputName: string,
  queryClause?:boolean,
  id?:string
}

type range = {
  inputType:"range",
  inputName: string,
  id?:string,
  min: number,
  max: number
}

type date = {
  inputType:"date",
  inputName: string,
  id?:string,
}

type select = {
  inputType:"select",
  inputName: string,
  id?:string,
  queryClause?:boolean
  options:(dataOption|numberOption|enumOption)
}

type search = {
  inputType:"search",
  inputName: string,
  queryClause?:boolean,
  id?:string,
  options:(string|number|data)[]
}

type group = {
  inputType:"group",
  inputName:string,
  id?:string,
  groupInputs:FormModel["formInputs"],
  logic:string
}

type enumOption = {
  optionType:"enum",
  data:(string|number)[]
}

type dataOption = {
  optionType: "data",
  data:data[]
}

type data = {
  label: string;
  value: any;
}

type numberOption = {
  optionType: "number",
  min: number,
  max: number,
  range: number,
}

type hpo = {
  inputType: "hpo",
  inputName: string,
  id?:string
}

type orpha = {
  inputType: "orpha",
  inputName: string,
  id?:string
}

type hgvs = {
  inputType: "hgvs",
  inputName: string,
  id?:string
}
