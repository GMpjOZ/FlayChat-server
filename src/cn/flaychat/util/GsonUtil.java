package cn.flaychat.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import cn.flaychat.model.BaseResponse;

import com.google.gson.Gson;

public class GsonUtil {

	public static <T> boolean packGson(Class<T> clz,int status,String message,HttpServletResponse response){
		 		Gson mGson=new Gson();
				PrintWriter out;
				try {
					String str=mGson.toJson(clz);
					BaseResponse re=new BaseResponse(200, "success", str);
					String str2=mGson.toJson(re);
					 response.setContentType("text/html;charset=utf-8");
					out = response.getWriter();
					out.println(str2);
					System.out.println("success!");
					return true;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return false;
				}
	}
	
	
}
