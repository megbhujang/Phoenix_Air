package com.sathish.enquiry.dao;

import java.sql.Connection;   
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sathish.enquiry.model.Enquiry;
 

public class EnquiryDao {

    public int enquiry(Enquiry enquiry) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO enquiry" +
            "  (eid, edate, etitle, etype, edesc, agent_email, user_email) VALUES " +
            " (0, ?, ?, ?, ?, ?, ?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/airlines?useSSL=false", "root", "megana12");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
        	preparedStatement.setInt(1, 0);
        	preparedStatement.setString(2, enquiry.getEdate());
            preparedStatement.setString(3, enquiry.getEtitle());
            preparedStatement.setString(4, enquiry.getEtype());
            preparedStatement.setString(5, enquiry.getEdesc());
            preparedStatement.setString(6, enquiry.getAgentemail());
            preparedStatement.setString(6, enquiry.getUseremail());


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
