package com.keepthinker.dao;

import javax.sql.DataSource;

import com.keepthinker.HelloChina;

public interface CountryDAO {
	/** 
	    * This is the method to be used to initialize
	    * database resources ie. connection.
	    */
	   public void setDataSource(DataSource ds);
	   public void create(HelloChina area);
	   public void delete(int id);
	   public void update(int id,HelloChina area);
}
