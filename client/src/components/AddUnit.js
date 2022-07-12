import React, {useState} from "react";
import '../css/form.css'
import UnitServices from "../services/UnitsServices";

const AddUnit = ({currentCustomer})=>{
    
    const [unitType, setUnitType] = useState("")
    const [serialNumber, setSerialNumber] = useState("")
    const [hoursRun, setHoursRun] = useState("")
    const [dateInstalled, setDateInstalled] = useState("")
    const [expectedRunHoursPerYear, setExpectedRunHoursPerYear] = useState("")
    // const [nextServiceDate, setNextServiceDate] = useState("")


    const handleUnitTypeChange = (event) =>{
        setUnitType(event.target.value)
    };

    const handleSerialNumberChange = (event) =>{
        setSerialNumber(event.target.value)
    };

    const handleHoursRunChange = (event) =>{
        setHoursRun(event.target.value)
    };

    const handleDateInstalledChange = (event) =>{
        setDateInstalled(event.target.value)
    };

    const handleExpectedRunHoursPerYearChange = (event) =>{
        setExpectedRunHoursPerYear(event.target.value)
    };

    // const handleNextServiceDateChange = (event) =>{
    //     setNextServiceDate(event.target.value)
    // };

    const handleCustomerSubmit = (event) => {
        event.preventDefault();
        const serialNumberToSubmit = serialNumber.trim();

        if (!serialNumberToSubmit){
          return
        }
        const newUnitObject = {
            unitType: unitType,
            serialNumber: serialNumberToSubmit,
            hoursRun: hoursRun,
            dateInstalled: dateInstalled,
            expectedRunHoursPerYear: expectedRunHoursPerYear,
            nextServiceDate: currentCustomer.nextServiceDate,
            customer: currentCustomer,
            nextServiceHours: (expectedRunHoursPerYear/currentCustomer.engineerVisitsPerYear),
            unitParts: [],
            increasedRunHours: 0

          }
        setUnitType("");
        setSerialNumber("");
        setHoursRun("");
        setDateInstalled("");
        setExpectedRunHoursPerYear("");
        UnitServices.addUnit(newUnitObject)
    }

    return(
        <>
            <h1>Add Unit</h1>

            <form onSubmit={handleCustomerSubmit}>

                <div className="dropdown">
                    <p>Select Unit Type</p>
                    <select 
                        placeholder="Search.."
                        value={unitType}
                        onChange={handleUnitTypeChange}
                        required
                    >
                        <option>RS5-10Kg</option>
                        <option>RS16-20Kg</option>
                        <option>RS24-30kg</option>
                        <option>RS40kg</option>
                        <option>RS50kg</option>
                        <option>RS60kg</option>
                        <option>RS80kg</option>
                    </select>
                </div>

                <div className="field">
                    <label htmlFor="serialNumber"></label>
                    <input 
                        type="text" 
                        placeholder="Serial Number"
                        value={serialNumber}
                        onChange={handleSerialNumberChange}
                        required
                    />
                </div>

                <div className="field">
                    <label htmlFor="hoursRun"></label>
                    <input 
                        type="number" 
                        placeholder="Total Unit Running Hours"
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
                    <label htmlFor="dateInstalled">Date Installed</label>
                    <input 
                        type="date" 
                        value={dateInstalled}
                        onChange={handleDateInstalledChange}
                        required
                    />
                </div>

                <input type="submit" value={"Add Unit"}/>

            </form>

        </>
    )
}

export default AddUnit