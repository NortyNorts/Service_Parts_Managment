
const baseURL = 'http://localhost:8080/units';

const UnitServices = {
    
    getUnits() {
        return fetch(baseURL)
            .then(res => res.json());
    },

    getUnitParts(){
        return
    },

    addUnit(){
        return
    }

}

export default UnitServices;