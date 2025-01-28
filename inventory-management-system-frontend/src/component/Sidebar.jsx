import React from "react";
import { Link } from "react-router-dom";

import ApiService from "../service/ApiService";


const logout = () => {
    ApiService.logout();
};

const Sidebar = () => {
    const isAuth = ApiService.isAuthenticated();
    const isAdmin = ApiService.isAdmin();

    return (
        <div className="sidebar">
            <h1 className="inventory-management-system">Inventory Management System</h1>
            <ul className="nav-links">
                {isAuth && (
                    <li>
                        <Link to={`/dashboard`}>Dashboard</Link>
                    </li>
                )}
                {isAuth && (
                    <li>
                        <Link to={`/category`}>Category</Link>
                    </li>
                )}
                {isAuth && (
                    <li>
                        <Link to={`/product`}>Product</Link>
                    </li>
                )}
                {isAuth && (
                    <li>
                        <Link to={`/supplier`}>Supplier</Link>
                    </li>
                )}
                {isAuth && (
                    <li>
                        <Link to={`/purchase`}>Purchase</Link>
                    </li>
                )}
                {isAuth && (
                    <li>
                        <Link onClick={logout} to="/logout">Logout</Link>
                    </li>
                )}
            </ul>
        </div>
    );
};

export default Sidebar;
