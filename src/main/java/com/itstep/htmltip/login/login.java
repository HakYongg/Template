package com.itstep.htmltip.login;

import java.io.Serializable;

public class login implements Serializable {
    /**
     * 
     */
	/* private static final long serialVersionUID = 1 L; */
	
    public static String username;
    private static String password;

    public static String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    static String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}