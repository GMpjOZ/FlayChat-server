package cn.flaychat.servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.flaychat.model.User;
import cn.flaychat.service.UserOperation;
import cn.flaychat.util.GsonUtil;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		
		int  id=Integer.parseInt(request.getParameter("id"));
		String password=request.getParameter("password");
		UserOperation uo=new UserOperation();
		User u=uo.login(id, password);
		if(u==null){
			GsonUtil.packGson(null, 200,"用户名或密码不正确", response);
			
		}
		else {
			GsonUtil.packGson(null, 200,"登录成功", response);
			
		}
	}

}
