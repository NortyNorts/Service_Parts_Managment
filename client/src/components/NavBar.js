import React from "react";
import { Link } from "react-router-dom"
import { useHistory } from "react-router-dom";

const NavBar = ({}) => {

    const history = useHistory();

    const handleBackClick = ()=> {
        history.goBack()
    }

    return (
        <>

            <nav className = "navbar" id="navbar">

                <Link to='/'> Home </Link>

                <Link to='/contracts'> Contracts </Link>

                <Link to='/service'> Service </Link>

                <button onClick={handleBackClick}>Back</button>

            </nav>
        </>

    )

}

export default NavBar