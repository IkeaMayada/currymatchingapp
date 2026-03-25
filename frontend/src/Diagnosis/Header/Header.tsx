import React from 'react';
import {Link} from 'react-router-dom';



function Header() {
    return (
        <header>
            <Link to="/">
            <img src="/curryLogo.svg" alt="カレーMBTI" width = "172px" height = "96px"/>
            </Link>
            <p>
                あなたのカレーMBTIは?
            </p>
        </header>
    );
}

export default Header;