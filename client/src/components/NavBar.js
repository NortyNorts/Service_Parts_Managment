import { Link } from "react-router-dom"

const NavBar = ({}) => {

    return (
        <>

            <nav className = "navbar" id="navbar">

                <Link to='/'> Home </Link>

                <Link to='/contracts'> Contracts </Link>

                <Link to='/service'> Service </Link>

            </nav>
        </>

    )

}

export default NavBar