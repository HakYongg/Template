package com.itstep.htmltip.controller;

import java.sql.Connection;

import com.itstep.htmltip.utils.ConnectionUtil;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Connection connect =	ConnectionUtil.getConnection();
	 if (connect != null) {
		 System.out.println("success");
	 } else {
		 System.out.println("failed");
	 }
	}

}
