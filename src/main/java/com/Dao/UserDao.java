package com.Dao;

public class UserDao {

	static UserDao userDao = null;
	
	public void add() {
		System.out.println("Add");
		
	}
	
	public static UserDao getUserDao() {
		if(userDao == null)
			userDao = new UserDao();
		return userDao;
	}
	
	
}
