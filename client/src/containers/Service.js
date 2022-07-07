import React from "react"
import ServiceCustomersList from "../components/service/ServiceCustomersList"

const Service = ({customers, changeCustomer, changeUnit})=>{
    return(
        <>
            <ServiceCustomersList customers={customers} changeCustomer={changeCustomer} changeUnit={changeUnit}/>
        </>
        )
}

export default Service