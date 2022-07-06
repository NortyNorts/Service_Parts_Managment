import React from "react"
import CustomerList from "./CustomerList"
import { Link } from "react-router-dom"

const Customers = ({customers, changeCustomer})=>{
    
    
    return(
        <>
            <CustomerList customers={customers} changeCustomer={changeCustomer}/>
        </>
    )
}

export default Customers
