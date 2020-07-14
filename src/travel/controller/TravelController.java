package travel.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import travel.action.ListAction;

@WebServlet("/travelscan/*")
public class TravelController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doProcess(req, res);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doProcess(req, res);
	}

	protected void doProcess(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String uri = req.getRequestURI();
		// System.out.println(uri);
		String action = uri.substring(uri.lastIndexOf("/") + 1);
		if (action.equals("*")) {
			action = "main.do";
		}
		String next = "";

		if (action.equals("main.do")) {
			next = "/pages/main.jsp";
		}

		if (!next.equals("")) {
			RequestDispatcher dis = req.getRequestDispatcher(next);
			dis.forward(req, res);
		}
	}

}
