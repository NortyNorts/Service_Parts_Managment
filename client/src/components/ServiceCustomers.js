import React from "react"
import CustomerList from "./CustomerList"


const ServiceCustomers = ({customers, changeCustomer})=>{
    
    
    return(
        <>
            <CustomerList customers={customers} changeCustomer={changeCustomer}/>
        </>
    )
}

export default ServiceCustomers

