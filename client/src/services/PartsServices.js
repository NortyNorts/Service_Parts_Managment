const baseURL = 'http://localhost:8080/parts';

const PartsServices = {
    
    getUnits() {
        return fetch(baseURL + '/unit/{id}')
            .then(res => res.json());
    },

    getUnitParts(){
        return
    }

}

export default PartsServices;