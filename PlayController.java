package homework3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.GameBean;


@WebServlet("/homework3/PlayController")
public class PlayController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int location= Integer.parseInt(request.getParameter("location"));
		
		GameBean game = (GameBean) getServletContext().getAttribute("game");
		//call setMove on GameBean
		game.setMove(location);
		response.sendRedirect("GameController");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
