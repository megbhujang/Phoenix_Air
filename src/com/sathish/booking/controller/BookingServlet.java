package com.sathish.booking.controller;

import java.io.IOException;   

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sathish.booking.dao.BookingDao;
import com.sathish.booking.model.Booking;

@WebServlet("/flight")
public class BookingServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private BookingDao bookingDao;

    public void init() {
        bookingDao = new BookingDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    	
        String bookingname = request.getParameter("bookingname");
        String bookingtype = request.getParameter("bookingtype");
        String bookingclass = request.getParameter("bookingclass");
       

        
        Booking b = new Booking();
        
        b.setName(bookingname);
        b.setType(bookingtype);
        b.setBClass(bookingclass);

        
        try {
        	
            bookingDao.booking(b);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("passenger.html");
    }
}

