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
            <Link to ='/contractscustomerdetails' onClick={()=>handleOnClick(customer)}>
                <h3>{customer.companyName}</h3>
                <p>{customer.siteName}</p> 
                <p>{customer.siteAddress}</p>
                <p>{customer.sitePostCode}</p>
                <p>Next service date: {customer.nextServiceDate}</p>
                <p>Visits per year: {customer.engineerVisitsPerYear}</p>
            </Link>
        </>
    )
}

export default ContractsCustomerListItem