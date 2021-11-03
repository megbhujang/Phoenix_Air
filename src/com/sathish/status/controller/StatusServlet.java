package com.sathish.status.controller;

import java.io.IOException;  
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sathish.status.dao.StatusDao;
import com.sathish.status.model.Status;


@WebServlet("/checkstatus")
public class StatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StatusDao statusDao;
	
	public void init() {
		statusDao = new StatusDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			listStatus(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	private void listStatus(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		String flightdate = request.getParameter("flightdate");
	System.out.println(flightdate);
		Status status=new Status(flightdate);
		List<Status> listFlights = statusDao.selectAllFlight(status);
		
		System.out.println(listFlights);
		request.setAttribute("listFlights", listFlights);
		RequestDispatcher dispatcher = request.getRequestDispatcher("flightstatus.jsp");
		dispatcher.forward(request, response);
	}

}