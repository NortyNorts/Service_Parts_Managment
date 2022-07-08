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
            </Link>
                <p>{customer.siteName}</p> 
                <p>{customer.siteAddress}</p>
                <p>{customer.sitePostCode}</p>
                <p>Visits per year: {customer.engineerVisitsPerYear}</p>
        </>
    )
}

export default ContractsCustomerListItem