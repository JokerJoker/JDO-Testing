package dazuihouzi;

import java.io.IOException;
import java.util.Date;
import javax.jdo.PersistenceManager;
import javax.servlet.http.*;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@SuppressWarnings("serial")
public class DazuihouziServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
			resp.setContentType("text/plain");
			Key key = KeyFactory.createKey(Customer.class.getSimpleName(),"jokerlee");
	        Customer c = new Customer();
	        c.setKey(key);
	        c.setFirstName("lee");
	        c.setLastName("joker");
	        Date d = new Date();
	        c.setHireDate(d);
	        c.setEmail("joker@jokerjewel.com");
			PersistenceManager pm = PMF.get().getPersistenceManager();
	        try {
	            pm.makePersistent(c);
	            resp.getWriter().println("writing data...");
	        } finally {
	            pm.close();
	        }
			resp.getWriter().println("done!");
	}
}