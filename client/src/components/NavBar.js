import React from "react";
import { Link } from "react-router-dom"
import { useHistory } from "react-router-dom";
import '../css/navbar.css'

const NavBar = ({}) => {

    const history = useHistory();

    const handleBackClick = ()=> {
        history.goBack()
    }

    return (
        <>
        <div className="header">
            <p className="title">Service Parts Management</p>

            <nav>
                <div className="main-nav">
                <ul>
                    <li><Link to='/'> Home </Link></li>

                    <li><Link to='/contracts'> Contracts </Link></li>

                    <li><Link to='/service'> Service </Link></li>

                    <button onClick={handleBackClick}>Back</button>
                </ul>
                </div>
            </nav>

        </div>
        </>

    )

}

export default NavBar