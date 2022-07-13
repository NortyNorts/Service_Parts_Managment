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
        console.log(selectedCustomer.units)
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
            <Link to ='/servicecustomerdetails' onClick={()=>handleOnClick(customer)} className="removeUnderline">
                <div className="servicecustomerlistitem">
                    <h3>{customer.companyName}</h3>
                    
                    <p>{customer.siteName}</p> 
                    <p>{customer.siteAddress}</p>
                    <p>{customer.sitePostCode}</p>
                    <p>Next service date: {customer.nextServiceDate}</p>
                    <p>Visits per year: {customer.engineerVisitsPerYear}</p>
                    <p>{customer.serviceState}</p>
                </div>
            </Link>
        </>
    )
}

export default ServiceCustomerListItem