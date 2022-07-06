import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import React, {useEffect, useState} from 'react'
import Home from './components/Home';
import NavBar from './components/NavBar';
import Contracts from './containers/Contracts';
import Service from './containers/Service';
import CustomersService from './services/CustomersServices';
import Customers from './components/Customers';
import ContractsCustomerDetails from './components/ContractsCustomerDetails';

function App() {

  const [customers, setCustomers] = useState([])
  const [currentCustomer, setCurrentCustomer] = useState(null)

  useEffect(()=>{
    CustomersService.getCustomers()
    .then(customers => setCustomers(customers));
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



      </Switch>

      </Router>
    </>
  );
}

export default App;
