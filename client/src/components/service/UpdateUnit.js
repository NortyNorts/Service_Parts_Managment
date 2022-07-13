import React,{useState} from "react";
import UnitServices from "../../services/UnitsServices";
import { useHistory } from "react-router-dom";

const UpdateUnit = ({currentUnit, currentCustomer, currentUnitParts})=>{

    const [hoursRun, setHoursRun] = useState("")
    const [expectedRunHoursPerYear, setExpectedRunHoursPerYear] = useState("")
    const [dateInstalled, setDateInstalled] = useState("")

    const history = useHistory();

    const handleHoursRunChange = (event) =>{
        setHoursRun(event.target.value)
    };

    const handleExpectedRunHoursPerYearChange =(event) =>{
        setExpectedRunHoursPerYear(event.target.value)
    };

    const handleDateInstalledChange =(event) =>{
        setDateInstalled(event.target.value)
    };


    const handleUpdateFormSubmit = (event) => {
        event.preventDefault();

        const updatedUnitObject = {
            id: currentUnit.id,
            unitType: currentUnit.unitType,
            serialNumber: currentUnit.serialNumber,
            hoursRun: hoursRun,
            dateInstalled: dateInstalled,
            expectedRunHoursPerYear: expectedRunHoursPerYear,
            nextServiceDate: currentCustomer.nextServiceDate,
            customer: currentCustomer,
            nextServiceHours: currentUnit.nextServiceHours,
            unitParts: currentUnitParts,
            increasedRunHours: hoursRun - currentUnit.hoursRun
          }
        setHoursRun("");
        setExpectedRunHoursPerYear("")
        setDateInstalled("")
        UnitServices.serviceUnit(updatedUnitObject)
        history.goBack()
        history.goBack()
    }

    return(
        <>
            <h1>Update Unit</h1>

            <form onSubmit={handleUpdateFormSubmit}>

                <div className="field">
                    <label htmlFor="hoursRun"></label>
                    <input 
                        type="number" 
                        placeholder='Total Running Hours'
                        value={hoursRun}
                        onChange={handleHoursRunChange}
                        required
                    />
                </div>

                <div className="field">
                    <label htmlFor="expectedRunningHoursPerYear"></label>
                    <input 
                        type="number" 
                        placeholder="Expected Running Hours"
                        value={expectedRunHoursPerYear}
                        onChange={handleExpectedRunHoursPerYearChange}
                        required
                    />
                </div>

                <div className="field">
                    <label htmlFor="dateInstalled">Date Installed: </label>
                    <input 
                        type="date" 
                        value={dateInstalled}
                        onChange={handleDateInstalledChange}
                        required
                    />
                </div>

                <input type="submit" value={"Update Unit"}/>

            </form>

        </>
    )
}

export default UpdateUnit