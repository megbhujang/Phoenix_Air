package com.sathish.status.dao;

import java.sql.Connection;  
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sathish.status.model.Status;


public class StatusDao {
private String jdbcURL = "jdbc:mysql://localhost:3306/airlines?useSSL=false";
private String jdbcUsername = "root";
private String jdbcPassword = "megana12";

private static final String SELECT_ALL_FLIGHTS = "select flightname, flightfrom, flightto, flighttime from flight where flightdate=?;";

public StatusDao() {
}

protected Connection getConnection() {
Connection connection = null;
try {
Class.forName("com.mysql.jdbc.Driver");
connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (ClassNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
return connection;
}


public List<Status> selectAllFlight(Status status) {

// using try-with-resources to avoid closing resources (boiler plate code)
List<Status> flights = new ArrayList<Status>();
// Step 1: Establishing a Connection
try (Connection connection = getConnection();

// Step 2:Create a statement using connection object
PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_FLIGHTS);) {
System.out.println(preparedStatement);
preparedStatement.setString(1, status.getDate());
// Step 3: Execute the query or update query
ResultSet rs = preparedStatement.executeQuery();

// Step 4: Process the ResultSet object.
while (rs.next()) {

String flightname = rs.getString("flightname");
String flightfrom = rs.getString("flightfrom");
String flightto = rs.getString("flightto");
String flighttime = rs.getString("flighttime");

System.out.println(flightname);

flights.add(new Status(flightname, flightfrom, flightto, flighttime));

}
} catch (SQLException e) {
}

return flights;
}

}