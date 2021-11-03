package com.sathish.registration.controller;

import java.io.IOException;   

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sathish.registration.dao.UserRegistrationDao;
import com.sathish.registration.model.UserRegistration;



/**
 * @author  Sathish
 */

@WebServlet("/register")
public class UserRegistrationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserRegistrationDao userRegistrationDao;

    public void init() {
        userRegistrationDao = new UserRegistrationDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String name = request.getParameter("name");
        String contact = request.getParameter("contact");
        String emailid = request.getParameter("emailid");

        String address = request.getParameter("address");
        String password = request.getParameter("password");
       

        
        UserRegistration userReg = new UserRegistration();
        
        userReg.setName(name);
        userReg.setContact(contact);
        userReg.setEmailid(emailid);

        userReg.setAddress(address);
        userReg.setPassword(password);
        
        
        try {
        	
            userRegistrationDao.userRegistration(userReg);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("userdetails.jsp");
    }
}