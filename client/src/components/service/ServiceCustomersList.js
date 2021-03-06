import React, {useState} from "react"
import ServiceCustomerListItem from "./ServiceCustomerListItem"
import '../../css/main.css'


const ServiceCustomerList = ({customers, changeCustomer, changeUnit})=>{

    const [query, setQuery] = useState("")

    const filteredCustomersArray = customers.filter(customer=>{
        if (query === '') {
            return true;
          } 
          
          else if (customer.companyName.toLowerCase().includes(query.toLowerCase())) {
            return true;
          } 
          
          else if (customer.siteAddress.toLowerCase().includes(query.toLowerCase())) {
            return true;
          }

          else if (customer.sitePostCode.toLowerCase().includes(query.toLowerCase())) {
            return true;
          }

          else if (customer.siteName.toLowerCase().includes(query.toLowerCase())) {
            return true;
          } 

          else {
            return false
          }
        })
      

        const customersComponents = filteredCustomersArray.map((customer, index)=>{
            return <ServiceCustomerListItem value={index} customer={customer} changeCustomer={changeCustomer} key={index} changeUnit={changeUnit}/>
        })



    return(
        <>
            <input className="searchbar" placeholder="Customer Search" onChange={event => setQuery(event.target.value)} />
            <div className="flex">
            {customersComponents}
            </div>
        </>
    )

}

export default ServiceCustomerList