const baseURL = 'http://localhost:8080/customers';

const CustomersServices = {
    
  getCustomers() {
      return fetch(baseURL)
        .then(res => res.json());
    },

  addCustomer(newCustomer){
    return fetch(baseURL,{
    method:'POST',
    body: JSON.stringify(newCustomer),
    headers:{'Content-Type':'application/json'}
    })
    .then(res => res.json());
  },

  deleteCustomer(customer){
    return fetch(baseURL + '/deletecustomer/' + customer.id,{
      method:'POST',
      body: JSON.stringify(),
      headers:{'Content-Type':'application/json'}
    })
    .then(res => res.json());
  }

}

export default CustomersServices;