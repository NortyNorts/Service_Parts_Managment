import React, {useState} from "react";
import CustomersServices from "../services/CustomersServices";
import { useHistory } from "react-router-dom";
import '../css/form.css'

const AddCustomer = ()=>{

    const history = useHistory();

    const [companyName, setCompanyName] = useState("")
    const [siteName, setSiteName] = useState("")
    const [address, setAddress] = useState("")
    const [postCode, setPostCode] = useState("")
    const [visitsPerYear, setVisitsPerYear] = useState("")
    const [nextServiceDate, setNextServiceDate] = useState("yyyy/mm/dd")

    const handleCompanyNameChange = (event) =>{
        setCompanyName(event.target.value)
    };

    const handleSiteNameChange = (event) =>{
        setSiteName(event.target.value)
    };

    const handleAddressChange = (event) =>{
        setAddress(event.target.value)
    };

    const handlePostCodeChange = (event) =>{
        setPostCode(event.target.value)
    };

    const handleVisitsPerYearChange = (event) =>{
        setVisitsPerYear(event.target.value)
    };

    const handleNextServiceDateChange = (event) =>{
        setNextServiceDate(event.target.value)
    }

    const handleCustomerSubmit = (event) => {
        event.preventDefault();
        const companyNameToSubmit = companyName.trim();
        const siteNameToSubmit = siteName.trim();
        const addressToSubmit = address.trim();
        const postCodeToSubmit = postCode.trim();

        if (!companyNameToSubmit){
          return
        }
        const newCustomerObject = {
            companyName: companyNameToSubmit,
            siteName: siteNameToSubmit,
            siteAddress: addressToSubmit,
            sitePostCode: postCodeToSubmit,
            engineerVisitsPerYear: visitsPerYear,
            nextServiceDate: nextServiceDate,
            serviceState: "Awaiting Service Booking"
          }
        setCompanyName("");
        setSiteName("");
        setAddress("");
        setPostCode("");
        setVisitsPerYear("");
        setNextServiceDate("yyyy/mm/dd")
        CustomersServices.addCustomer(newCustomerObject);
        history.goBack();
    }

    return(
        <>

            <div className="divform">
            <form onSubmit={handleCustomerSubmit}>

                <div className="field">
                    <label htmlFor="companyName"></label>
                    <input 
                        type="text"
                        placeholder="Company Name"
                        value={companyName}
                        onChange={handleCompanyNameChange}
                        required
                    />
                </div>

                <div className="field">
                    <label htmlFor="siteName"></label>
                    <input 
                        type="text" 
                        placeholder="Site Name"
                        value={siteName}
                        onChange={handleSiteNameChange}
                        required
                    />
                </div>

                <div className="field">
                    <label htmlFor="address"></label>
                    <input 
                        type="text" 
                        placeholder="Site Address"
                        value={address}
                        onChange={handleAddressChange}
                        required
                    />
                </div>

                <div className="field">
                    <label htmlFor="postCode"></label>
                    <input 
                        type="text"
                        placeholder="Site PostCode" 
                        value={postCode}
                        onChange={handlePostCodeChange}
                        required
                    />
                </div>

                <div className="field">
                    <label htmlFor="visitsPerYear"></label>
                    <input 
                        type="number" 
                        placeholder="Visits per year"
                        value={visitsPerYear}
                        onChange={handleVisitsPerYearChange} 
                        required
                        />
                </div>
                <h2>Next Service Date</h2>
                <div>
                    <label htmlFor="nextServiceDate"></label>
                    <input 
                        type="date"
                        onChange={handleNextServiceDateChange} 
                        required
                        />
                </div>


                <input type="submit" value={"Add Customer"}/>

            </form>
            </div>

            <br></br>
            <br></br>
            <br></br>
        </>
    )
}

export default AddCustomer