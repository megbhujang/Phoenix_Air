package com.sathish.registration.dao;

import java.sql.Connection;   
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sathish.registration.model.UserRegistration;
 

public class UserRegistrationDao {

    public int userRegistration(UserRegistration userRegistration) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO reg" +
            "  (name, contact, emailid, address, password) VALUES " +
            " (?, ?, ?, ?, ?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/airlines?useSSL=false", "root", "megana12");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
        	preparedStatement.setInt(1, 0);
        	preparedStatement.setString(2, userRegistration.getName());
            preparedStatement.setString(3, userRegistration.getContact());
            preparedStatement.setString(4, userRegistration.getEmailid());
            preparedStatement.setString(5, userRegistration.getAddress());
            preparedStatement.setString(6, userRegistration.getPassword());
           

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
