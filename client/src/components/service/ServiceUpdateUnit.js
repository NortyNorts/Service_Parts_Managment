import React,{useState} from "react";
import UnitServices from "../../services/UnitsServices";
import { useHistory } from "react-router-dom";
import '../../css/form.css'

const ServiceUpdateUnit = ({currentUnit, currentCustomer, currentUnitParts})=>{

    const [hoursRun, setHoursRun] = useState("")

    const history = useHistory();

    const handleHoursRunChange = (event) =>{
        setHoursRun(event.target.value)
    };

    const handleUpdateFormSubmit = (event) => {
        event.preventDefault();

        const updatedUnitObject = {
            id: currentUnit.id,
            unitType: currentUnit.unitType,
            serialNumber: currentUnit.serialNumber,
            hoursRun: hoursRun,
            dateInstalled: currentUnit.dateInstalled,
            expectedRunHoursPerYear: currentUnit.expectedRunHoursPerYear,
            nextServiceDate: currentCustomer.nextServiceDate,
            customer: currentCustomer,
            nextServiceHours: currentUnit.nextServiceHours,
            unitParts: currentUnitParts,
            increasedRunHours: hoursRun - currentUnit.hoursRun
          }
        setHoursRun("");
        UnitServices.serviceUnit(updatedUnitObject)
        history.goBack()
        history.goBack()
        history.goBack()
    }

    return(
        <>
            <br/>
            <br/>

            <form className="divform" onSubmit={handleUpdateFormSubmit}>

                <div className="field">
                    <label htmlFor="hoursRun"></label>
                    <input 
                        type="number" 
                        placeholder={currentUnit.hoursRun}
                        value={hoursRun}
                        onChange={handleHoursRunChange}
                        required
                    />
                </div>

                <input type="submit" value={"Update Unit"}/>

            </form>
        </>
    )
}

export default ServiceUpdateUnit