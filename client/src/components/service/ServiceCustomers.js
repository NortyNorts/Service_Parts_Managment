import React from "react"
import ServiceCustomerList from "./ServiceCustomerList"


const ServiceCustomers = ({customers, changeCustomer, changeUnit})=>{
    
    
    return(
        <>
            <ServiceCustomerList customers={customers} changeCustomer={changeCustomer} changeUnit={changeUnit}/>
        </>
    )
}

export default ServiceCustomers

