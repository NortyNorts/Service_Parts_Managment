import React from "react"
import { Link } from "react-router-dom"
import ContractsCustomerList from "./ContractsCustomerList"

const ContractsCustomersSection = ({customers, changeCustomer})=>{


    return(
        <>
            <div className="button-link">
                <Link to ='/addcustomer'> <h1> Add Customer </h1></Link>
            </div>
            <div className="search">
            <ContractsCustomerList customers={customers} changeCustomer={changeCustomer}/>
            </div>
        </>
    )
}

export default ContractsCustomersSection
