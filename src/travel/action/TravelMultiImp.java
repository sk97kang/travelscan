package travel.action;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;

public interface TravelMultiImp {
	public MultipartRequest executeMulti(HttpServletRequest req);
}
