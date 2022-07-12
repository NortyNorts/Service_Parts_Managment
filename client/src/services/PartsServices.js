const baseURL = 'http://localhost:8080/parts';

const PartsServices = {
    
    getPartsByCustomer(currentCustomer) {
        return fetch(baseURL + '/unit/customer/' + currentCustomer)
            .then(res => res.json());
    },

    getUnitParts(currentUnit){
        return fetch(baseURL + '/unit/' + currentUnit)
            .then(res => res.json());
            
    },

    changePart(partId){
        return fetch(baseURL + '/changepart/' + partId,{
        method:'POST',
        body: JSON.stringify(),
        headers:{'Content-Type':'application/json'}
        })
        // .then(res => res.json());
      },
}

export default PartsServices;