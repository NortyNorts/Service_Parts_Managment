import React from "react"
import ContractsCustomerList from "./ContractsCustomerList"

const ContractsCustomersSection = ({customers, changeCustomer})=>{


    return(
        <>
            <ContractsCustomerList customers={customers} changeCustomer={changeCustomer}/>
        </>
    )
}

export default ContractsCustomersSection
