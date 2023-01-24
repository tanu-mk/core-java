package tetra;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 7, urlPatterns = "/wish")
public class BakeryServlet extends HttpServlet {
	
	public BakeryServlet() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet in Bakery");
	}

}
