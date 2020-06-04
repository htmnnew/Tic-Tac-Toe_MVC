package homework3;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.GameBean;

@WebServlet("/homework3/NewGameController")
public class NewGameController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//find and delete the game bean in servlet context
		if(this.getServletContext().getAttribute("game") != null) {
			this.getServletContext().removeAttribute("game");
			
			GameBean game = new GameBean();
			
			
			ServletContext context = this.getServletContext();		
			context.setAttribute("game", game);
		}
		
		//create new game bean and store it in servlet context
		
		response.sendRedirect("GameController");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
