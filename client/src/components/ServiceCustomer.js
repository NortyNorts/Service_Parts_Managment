import React from "react"
import {Link} from 'react-router-dom'

const ServiceCustomer = ({customer, changeCustomer})=>{


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
                Company name: {customer.companyName} 
                Site name: {customer.siteName} 
                Site address: {customer.siteAddress} 
                Engineer visits per year: {customer.engineerVisitsPerYear}
            </Link>
        </>
    )
}

export default ServiceCustomer