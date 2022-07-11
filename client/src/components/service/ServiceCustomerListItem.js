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
                <p>{customer.companyName}</p>
                <p>{customer.siteName}</p> 
                <p>{customer.siteAddress}</p>
                <p>{customer.sitePostCode}</p>
                <p>Visits per year: {customer.engineerVisitsPerYear}</p>
                <p>Next service date: {customer.nextServiceDate}</p>
                <p>{customer.serviceState}</p>
            </Link>
        </>
    )
}

export default ServiceCustomerListItem