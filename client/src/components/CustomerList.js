import React, {useState, useEffect} from "react"
import Customer from "./Customer"


const CustomerList = ({customers, setCustomer})=>{

    const customersArray = customers.map((customer, index)=>{
        return <option value={index} customer={customer} key={index}>{customer.companyName}</option>
    })


    return(
        <>
            <select>
                {customersArray}
            </select>
        </>
    )

}

export default CustomerList