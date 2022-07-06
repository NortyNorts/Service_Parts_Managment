import React from "react"
import CustomerList from "./CustomerList"

const Customers = ({customers, changeCustomer})=>{
    
    
    return(
        <>
            <CustomerList customers={customers} changeCustomer={changeCustomer}/>
        </>
    )
}

export default Customers
