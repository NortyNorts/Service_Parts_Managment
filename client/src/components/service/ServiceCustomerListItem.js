import React from "react"
import {Link} from 'react-router-dom'

const ServiceCustomerListItem = ({customer, changeCustomer})=>{


    const handleOnClick = function(value){
        const chosenCustomer = value
        onCustomerSelect(chosenCustomer)
    }


    const onCustomerSelect = function(selectedCustomer){
        changeCustomer(selectedCustomer)
    }

    return(
        <>
            <Link to ='/servicecustomerdetails' onClick={()=>handleOnClick(customer)}>
                <h3>{customer.companyName}</h3>
                <p>{customer.siteName}</p> 
                <p>{customer.siteAddress}</p>
                <p>{customer.sitePostCode}</p>
                <p>Visits per year: {customer.engineerVisitsPerYear}</p>
                <h4>{customer.serviceState}</h4>
            </Link>
        </>
    )
}

export default ServiceCustomerListItem