package com.sathish.login.web;

import java.io.IOException ;  

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sathish.login.bean.LoginBean;
import com.sathish.login.database.LoginDao;


/**
 * @email sathish
 */

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginDao loginDao;

	public void init() {
		loginDao = new LoginDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		LoginBean loginBean = new LoginBean();
		loginBean.setEmailid(emailid);
		loginBean.setPassword(password);

		try {
			if (loginDao.validate(loginBean)) {
				//HttpSession session = request.getSession();
				// session.setAttribute("username",username);
				response.sendRedirect("demo.html");
			} else {
				HttpSession session = request.getSession();
				//session.setAttribute("user", username);
				response.sendRedirect("error.jsp");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
