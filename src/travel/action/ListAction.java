package travel.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import travel.dao.UsersDAO;

public class ListAction implements TravelActionImp {
	@Override
	public void execute(HttpServletRequest req) {
//		UsersDAO dao = UsersDAO.getInstance();
//		System.out.println(dao.searchAll().get(0).getName());
	}

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {

	}

}
