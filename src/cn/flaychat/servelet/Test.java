package cn.flaychat.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.flaychat.model.BaseResponse;
import cn.flaychat.model.User;
import cn.flaychat.util.Client;

import com.google.gson.Gson;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		String name=request.getParameter("name");
		String pasword=request.getParameter("pasword");
		System.out.println(name);
		//System.out.println(email);
		//request.setAttribute("name", "mpj");
		//response.sendRedirect("NewFile.jsp");
		Map<String,String> map=new HashMap();
		map.put("name", "pj");
		map.put("password", "dadadas");	
		map.put("method", "push_msg");
		map.put("apikey", "fxc7ctt2N18eY3gKAvYuDgiV");
		map.put("user_id", "970163915595405959");
		map.put("push_type", "1");
		String url="http://channel.api.duapp.com/rest/2.0/channel/channel";
		String f=Client.sendPost(url, map);
System.out.println(f);
	}
	 
}
