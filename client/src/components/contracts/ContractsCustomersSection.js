import React from "react"
import { Link } from "react-router-dom"
import ContractsCustomerList from "./ContractsCustomerList"
import '../../css/main.css'

const ContractsCustomersSection = ({customers, changeCustomer})=>{


    return(
        <>
            <div className="link-button">
                    <li>
                        <Link to ='/addcustomer' style={{ color: 'inherit', textDecoration: 'inherit'}}>Add Customer</Link>
                    </li>
            </div>
            <div className="search">
            <ContractsCustomerList customers={customers} changeCustomer={changeCustomer}/>
            </div>
        </>
    )
}

export default ContractsCustomersSection
