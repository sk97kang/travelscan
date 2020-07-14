package travel.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface TravelActionImp {
	public void execute(HttpServletRequest req);

	public void execute(HttpServletRequest req, HttpServletResponse res);
}
