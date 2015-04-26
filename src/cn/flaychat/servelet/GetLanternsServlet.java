package cn.flaychat.servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.flaychat.model.Lanterns;
import cn.flaychat.service.LanternsServer;
import cn.flaychat.service.LocationServer;
import cn.flaychat.util.GsonUtil;

/**
 * Servlet implementation class GetLanternsServlet
 */
@WebServlet("/GetLanternsServlet")
public class GetLanternsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	 private LanternsServer lans=(LanternsServer) ac.getBean("lanternsServer"); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetLanternsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Lanterns lan=lans.getLanterns();
		GsonUtil.packGson(lan, 200,"请求成功", response);
		System.out.println(lan);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
