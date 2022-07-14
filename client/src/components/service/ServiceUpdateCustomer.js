import React, {useState} from "react";
import CustomersServices from "../../services/CustomersServices";
import { useHistory } from "react-router-dom";
import '../../css/form.css'

const ServiceUpdateCustomer = ({currentCustomer})=>{

    const history = useHistory();

    const [nextServiceDate, setNextServiceDate] = useState("yyyy/mm/dd")


    const handleNextServiceDateChange = (event) =>{
        setNextServiceDate(event.target.value)
    }

    const handleCustomerSubmit = (event) => {
        event.preventDefault();

        const newCustomerObject = {
            id: currentCustomer.id,
            companyName: currentCustomer.companyName,
            siteName: currentCustomer.siteName,
            siteAddress: currentCustomer.siteAddress,
            sitePostCode: currentCustomer.sitePostCode,
            engineerVisitsPerYear: currentCustomer.engineerVisitsPerYear,
            nextServiceDate: nextServiceDate,
            units: currentCustomer.units
          }
        setNextServiceDate("yyyy/mm/dd")
        CustomersServices.addCustomer(newCustomerObject);
        console.log(newCustomerObject)
        history.goBack();
        history.goBack();
    }

    return(
        <>

            <br/>
            <br/>
            <br/>

            <div className="divform">
            <form onSubmit={handleCustomerSubmit}>

                <div>
                    <label htmlFor="nextServiceDate"></label>
                    <input 
                        type="date"
                        onChange={handleNextServiceDateChange}
                        required
                        />
                </div>


                <input type="submit" value={"Change Service Date"}/>

            </form>
            </div>

        </>
    )
}

export default ServiceUpdateCustomer