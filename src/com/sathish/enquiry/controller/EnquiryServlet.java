package com.sathish.enquiry.controller;

import java.io.IOException;   

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sathish.enquiry.dao.EnquiryDao;
import com.sathish.enquiry.model.Enquiry;



/**
 * @author  Sathish
 */

@WebServlet("/enquiry")
public class EnquiryServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private EnquiryDao enquiryDao;

    public void init() {
        enquiryDao = new EnquiryDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String edate = request.getParameter("edate");
        String etitle = request.getParameter("etitle");
        String etype = request.getParameter("etype");

        String edesc = request.getParameter("edesc");
        String agent_email = request.getParameter("agent_email");
        String user_email = request.getParameter("user_email");


        
        Enquiry e1 = new Enquiry();
        
        e1.setEdate(edate);
        e1.setEtitle(etitle);
        e1.setEtype(etype);

        e1.setEdesc(edesc);
        e1.setAgentemail(agent_email);
        e1.setUseremail(user_email);

        
        try {
        	
            enquiryDao.enquiry(e1);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("userdetails.jsp");
    }
}