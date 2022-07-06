import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import React, {useEffect, useState} from 'react'
import Home from './components/Home';
import NavBar from './components/NavBar';
import Contracts from './containers/Contracts';
import Service from './containers/Service';
import CustomersService from './services/CustomersServices';
import Customers from './components/Customers';

import UnitServices from './services/UnitsServices';

import ContractsCustomerDetails from './components/ContractsCustomerDetails';
import AddCustomer from './components/AddCustomer';
import NewQuote from './components/NewQuote';
import SavedQuotes from './components/SavedQuotes';

import ServiceCustomer from './components/ServiceCustomer';
import ServiceCustomerDetails from './components/ServiceCustomerDetails';
import ServiceCustomerList from './components/ServiceCustomerList';
import ServiceCustomers from './components/ServiceCustomers';


function App() {

  const [customers, setCustomers] = useState([])
  const [currentCustomer, setCurrentCustomer] = useState(null)

  const [units, setUnits] = useState([])

  useEffect(()=>{
    CustomersService.getCustomers()
    .then(customers => setCustomers(customers));
    UnitServices.getUnits()
    .then(units=> setUnits(units));
  }, []);

  const changeCustomer = function(chosenCustomer){
    setCurrentCustomer(chosenCustomer)
  }

  return (
    <>
      <h1>
        This is the main App.js
      </h1>

      <Router>

      <NavBar/>

      <Switch>

      <Route exact path="/"> <Home/></Route>

      <Route exact path="/contracts">
        <Contracts 
        />
      </Route>

      <Route exact path="/service">
        <Service/>
      </Route>

      <Route exact path="/customers">
        <Customers
          customers={customers}
          changeCustomer={changeCustomer}
        />
      </Route>

      <Route exact path ="/contractscustomerdetails">
        <ContractsCustomerDetails
          currentCustomer={currentCustomer}
        />
      </Route>

      <Route exact path ="/servicecustomerdetails">
        <ServiceCustomerDetails
          currentCustomer={currentCustomer}
        />
      </Route>

      <Route exact path="/servicecustomers">
        <ServiceCustomer
          customers={customers}
          changeCustomer={changeCustomer}
        />
      </Route>

      <Route exact path ="/addcustomer">
          <AddCustomer/>
      </Route>

      <Route exact path ="/savedquotes">
          <SavedQuotes/>
      </Route>

      <Route exact path ="/newquote">
          <NewQuote/>
      </Route>

      


      <Route exact path="/units">
        <Unit
          units={units}
          setUnits={setUnits}
        />
      </Route>



      </Switch>

      </Router>
    </>
  );
}

export default App;
