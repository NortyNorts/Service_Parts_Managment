import React from "react"
import {Link} from 'react-router-dom'

const ContractsCustomerListItem = ({customer, changeCustomer})=>{


    const handleOnClick = function(value){
        const chosenCustomer = value
        onCustomerSelect(chosenCustomer)
    }

    

    const onCustomerSelect = function(selectedCustomer){
        changeCustomer(selectedCustomer)
    }

    return(
        <>
        <div className="bluebox2">
            <Link to ='/contractscustomerdetails' onClick={()=>handleOnClick(customer)} className = "removeUnderline" style={{ color: 'inherit', textDecoration: 'inherit'}}>
                <h2>{customer.companyName}</h2>
                <h3>{customer.siteName}</h3>
                <h4>{customer.siteAddress}</h4>
                <h4>{customer.sitePostCode}</h4>
            </Link>
        </div>

        <b></b>
        <b></b>
        <b></b>        
        </>
    )
}

export default ContractsCustomerListItem