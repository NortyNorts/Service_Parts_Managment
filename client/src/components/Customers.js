import React from "react"
import CustomerList from "./CustomerList"

const Customers = ({customers, setCustomer})=>{
    
    
    return(
        <>
            <CustomerList customers={customers} setCustomer={setCustomer}/>
        </>
    )
}

export default Customers
