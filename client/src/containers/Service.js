import React from "react"
import ServiceCustomers from "../components/service/ServiceCustomers"

const Service = ({customers, changeCustomer, changeUnit})=>{
    return(
        <>
            <ServiceCustomers customers={customers} changeCustomer={changeCustomer} changeUnit={changeUnit}/>
        </>
        )
}

export default Service