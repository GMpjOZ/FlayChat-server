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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		
		User u=new User();
		u.setId(Integer.parseInt(request.getParameter("id")));
		u.setAge(Integer.parseInt(request.getParameter("age")));
		u.setEmail(request.getParameter("email"));
		u.setName(request.getParameter("name"));
		u.setPhone_number(request.getParameter("phoneNumber"));
		u.setSex(Integer.parseInt(request.getParameter("sex")));
		UserOperation uo=new UserOperation();
		uo.register(u);
		GsonUtil.packGson(null, 200,"注册成功", response);
	}

}
