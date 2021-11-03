package com.sathish.flight.dao;

import java.sql.Connection;   
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sathish.flight.model.Flight;


public class FlightDao {

    public int flight(Flight flight) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO flight" +
            "  (flightname, flightdate, flightfrom, flightto, flighttime) VALUES " +
            " (?, ?, ?, ?, ?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/airlines?useSSL=false", "root", "megana12");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, flight.getName());
            preparedStatement.setString(2, flight.getDate());
            preparedStatement.setString(3, flight.getFrom());
            preparedStatement.setString(4, flight.getTo());
            preparedStatement.setString(5, flight.getTime());
           

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return result;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}

 