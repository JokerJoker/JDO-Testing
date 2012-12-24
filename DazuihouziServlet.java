package dazuihouzi;

import java.io.IOException;
import java.util.Date;

import javax.jdo.PersistenceManager;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class DazuihouziServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
			resp.setContentType("text/plain");
	        customer c = new customer();
	        c.setFirstName("li");
	        c.setLastName("feifei");
	        Date d = new Date();
	        c.setHireDate(d);
			PersistenceManager pm = PMF.get().getPersistenceManager();
	        try {
	            pm.makePersistent(c);
	        } finally {
	            pm.close();
	        }
			resp.getWriter().println("done!");
	}
}