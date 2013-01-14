package dazuihouzi;

import java.io.IOException;
import java.util.Date;

import javax.jdo.PersistenceManager;
import javax.servlet.http.*;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@SuppressWarnings("serial")
public class ReadServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
			resp.setContentType("text/plain");
			PersistenceManager pm = PMF.get().getPersistenceManager();
	        try {
				Customer li = pm.getObjectById(Customer.class,"jokerlee");
				resp.getWriter().println("name: "+ li.getFirstName()+li.getLastName());
				resp.getWriter().println("email: "+ li.getEmail());
				resp.getWriter().println("hire date: "+ li.getHireDate());
	        } finally {
	            pm.close();
	        }
	        }
	}