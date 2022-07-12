import React from "react"
import {Link} from 'react-router-dom'
import '../../css/servicecustomerlist.css';

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
        <div className="servicecustomerdetails">
            <Link to ='/servicecustomerdetails' onClick={()=>handleOnClick(customer)}>
                <p>{customer.companyName}</p>
                <p>{customer.siteName}</p> 
                <p>{customer.siteAddress}</p>
                <p>{customer.sitePostCode}</p>
                <p>Visits per year: {customer.engineerVisitsPerYear}</p>
                <p>Next service date: {customer.nextServiceDate}</p>
                <p>{customer.serviceState}</p>
            </Link>
        </div>
        </>
    )
}

export default ServiceCustomerListItem