import React from "react"

const Customer = ({customer})=>{

console.log(customer)

    return(
        <>
            <li>
                Company name: {customer.companyName} 
                Site name: {customer.siteName} 
                Site address: {customer.siteAddress} 
                Engineer visits per year: {customer.engineerVisitsPerYear}
            </li>
        </>
    )
}

export default Customer