package com.sathish.flight.controller;

import java.io.IOException;    

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sathish.flight.dao.FlightDao;
import com.sathish.flight.model.Flight;
import com.sathish.registration.dao.UserRegistrationDao;
import com.sathish.registration.model.UserRegistration;

@WebServlet("/flight")
public class FlightServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private FlightDao flightDao;

    public void init() {
        flightDao = new FlightDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    	
        String flightname = request.getParameter("flightname");
        String flightdate = request.getParameter("flightdate");
        String flightfrom = request.getParameter("flightfrom");

        String flightto = request.getParameter("flightto");
        String flighttime = request.getParameter("flighttime");
       

        
        Flight f = new Flight();
        
        f.setName(flightname);
        f.setDate(flightdate);
        f.setFrom(flightfrom);

        f.setTo(flightto);
        f.setTime(flighttime);
        
        
        try {
        	
            flightDao.flight(f);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("booking.jsp");
    }
}

