package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("empDAO")
public class EmployeeDAO {
  private static final String GET_EMPS_COUNT="SELECT COUNT(*) FROM EMP";
  
  @Autowired
  private DataSource ds; //HAS-A property
  
  //method with persistence logic
  public int getEmpsCount()throws Exception{
	  //get pooled jdbc con object
	  Connection con=ds.getConnection();
	  //create PreparedStatement object having SQL query
	  PreparedStatement ps=con.prepareStatement(GET_EMPS_COUNT);
	  //execute the QUERY
	  ResultSet rs=ps.executeQuery();
	  //process the resultSet
	  rs.next();
	  int count=rs.getInt(1);
	  //close jdbc objects
	  rs.close();
	  ps.close();
	  con.close();
	  return count;
  }
}
