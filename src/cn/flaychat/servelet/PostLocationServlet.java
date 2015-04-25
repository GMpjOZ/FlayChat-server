package cn.flaychat.servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.flaychat.service.LocationServer;

/**
 * Servlet implementation class PostLocationServlet
 */
@WebServlet("/PostLocationServlet")
public class PostLocationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostLocationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	double latitude=Integer.parseInt(request.getParameter("latitude"));
	double longitude=Integer.parseInt(request.getParameter("longitude"));
	int id=Integer.parseInt(request.getParameter("id"));
	LocationServer ls=new LocationServer();
	ls.saveLocation(latitude, longitude, id);
	
	
	}

}
