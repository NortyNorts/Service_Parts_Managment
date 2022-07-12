import React from "react"
import {Link} from 'react-router-dom'
import '../../css/servicecustomerlist.css';

const ServiceCustomerListItem = ({customer, changeCustomer, changeUnit})=>{


    const handleOnClick = function(value){
        const chosenCustomer = value
        onCustomerSelect(chosenCustomer)
    }


    const onCustomerSelect = function(selectedCustomer){
        changeCustomer(selectedCustomer)
        changeUnit(selectedCustomer.units[1])
    }

    return(
        // <>
        // <div className="servicecustomerdetails">
        //     <Link to ='/servicecustomerdetails' onClick={()=>handleOnClick(customer)}>
        //         <p>{customer.companyName}</p>
        //         <p>{customer.siteName}</p> 
        //         <p>{customer.siteAddress}</p>
        //         <p>{customer.sitePostCode}</p>
        //         <p>Visits per year: {customer.engineerVisitsPerYear}</p>
        //         <p>Next service date: {customer.nextServiceDate}</p>
        //         <p>{customer.serviceState}</p>
        //     </Link>
        // </div>
        // </>

        <>
        <div className="servicecustomerlistitem">
            <Link to ='/servicecustomerdetails' onClick={()=>handleOnClick(customer)}>
                <h3>{customer.companyName}</h3>
                <p>{customer.siteName}</p> 
                <p>{customer.siteAddress}</p>
                <p>{customer.sitePostCode}</p>
                <p>Next service date: {customer.nextServiceDate}</p>
                <p>Visits per year: {customer.engineerVisitsPerYear}</p>
                <p>{customer.serviceState}</p>
            </Link>
        </div>
        </>
    )
}

export default ServiceCustomerListItem