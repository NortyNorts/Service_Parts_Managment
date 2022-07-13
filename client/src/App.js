import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import React, {useEffect, useState} from 'react'
import Home from './components/Home';
import NavBar from './components/NavBar';
import Contracts from './containers/Contracts';
import Service from './containers/Service';
import UnitServices from './services/UnitsServices';
import ContractsCustomerDetails from './components/contracts/ContractsCustomerDetails';
import AddCustomer from './components/AddCustomer';
import ServiceCustomerDetails from './components/service/ServiceCustomerDetails';
import ContractsCustomersSection from './components/contracts/ContractsCustomersSection';
import CustomersServices from './services/CustomersServices';
import ServiceUnitDetails from './components/service/ServiceUnitDetails';
import ContractsUnitDetails from './components/contracts/ContractsUnitDetails';
import AddUnit from './components/AddUnit';
import NextServiceParts from './components/service/NextServiceParts';
import PartsServices from './services/PartsServices';
import NextServicePartsUnit from './components/service/NextServicePartsUnit';
import ChangeParts from './components/service/ChangeParts';
import UpdateUnit from './components/service/UpdateUnit';
import UnitPartsForecast from './components/contracts/UnitPartsForecast';
import UpdateCustomer from './components/UpdateCustomer';

function App() {

  const [customers, setCustomers] = useState([])
  const [currentCustomer, setCurrentCustomer] = useState(null)
  const [currentUnit, setCurentUnit] = useState(null)
  const [currentUserParts, setCurrentUserParts] = useState([])
  const [currentUnitParts, setCurentUnitParts] = useState([])
  
  
  const [units, setUnits] = useState([])
  

  useEffect(()=>{
    CustomersServices.getCustomers()
    .then(customers => setCustomers(customers));
    UnitServices.getUnits()
    .then(units=> setUnits(units));
  }, [customers]);

  

  const changePartFunction = (chosenCustomer)=>{
    PartsServices.getPartsByCustomer(chosenCustomer.id)
    .then(parts=> setCurrentUserParts(parts));
  }

  const changeCustomer = function(chosenCustomer){
    setCurrentCustomer(chosenCustomer)
    PartsServices.getPartsByCustomer(chosenCustomer.id)
    .then(parts=> setCurrentUserParts(parts));
  }

  const changeUnit = function(selectedUnit){
    setCurentUnit(selectedUnit)
    getServiceParts(selectedUnit.id)
  }
    
  const getServiceParts = function(id){
    PartsServices.getUnitParts(id)
    .then(parts=> setCurentUnitParts(parts))
  }

  return (
    <>
    

      <Router>

        <NavBar/>

        <Switch>

          <Route exact path="/"> 
            <Home/>
          </Route>

          <Route exact path="/contracts">
            <Contracts />
          </Route>

          <Route exact path="/service">
            <Service
              customers={customers}
              changeCustomer={changeCustomer}
              changeUnit={changeUnit}
            />
          </Route>

          <Route exact path="/unitpartsforecast">
            <UnitPartsForecast
              currentCustomer={currentCustomer}
              currentUnit={currentUnit}
            />
          </Route>

          <Route exact path ="/addcustomer">
              <AddCustomer 
                changeCustomer={changeCustomer}
              />
          </Route>

                    <Route exact path ="/updatecustomer">
              <UpdateCustomer
                currentCustomer={currentCustomer}
              />
          </Route>

          <Route exact path ="/addunit">
              <AddUnit
                currentCustomer={currentCustomer}
              />
          </Route>

          <Route exact path ="/updateunit">
              <UpdateUnit
                currentCustomer={currentCustomer}
                currentUnit={currentUnit}
                currentUnitParts={currentUnitParts}
              />
          </Route>

          <Route exact path ="/changeparts">
              <ChangeParts
                currentCustomer={currentCustomer}
                currentUserParts={currentUserParts}
                changePartFunction={changePartFunction}
              />
          </Route>

          <Route exact path ="/nextserviceparts">
              <NextServiceParts
                currentUserParts={currentUserParts}
              />
          </Route>

          <Route exact path ="/nextservicepartsunit">
              <NextServicePartsUnit
                currentUnitParts={currentUnitParts}
              />
          </Route>

          <Route exact path ="/contractscustomerssection">
            <ContractsCustomersSection
              customers={customers}
              changeCustomer={changeCustomer}
            />
          </Route>

          <Route exact path ="/contractscustomerdetails">
            <ContractsCustomerDetails
              currentCustomer={currentCustomer}
              changeUnit={changeUnit}
            />
          </Route>

          <Route exact path ="/servicecustomerdetails">
            <ServiceCustomerDetails
              currentCustomer={currentCustomer}
              changeUnit={changeUnit}
              changePartFunction={changePartFunction}
              changeCustomer={changeCustomer}
            />
          </Route>

          <Route exact path="/serviceunitdetails">
            <ServiceUnitDetails
              currentUnit={currentUnit}
              currentUnitParts={currentUnitParts}
            />
          </Route>

          <Route exact path="/contractsunitdetails">
            <ContractsUnitDetails
              currentUnit={currentUnit}
              currentUnitParts={currentUnitParts}
            />
          </Route>

        </Switch>

      </Router>

    </>
  );
}

export default App;
