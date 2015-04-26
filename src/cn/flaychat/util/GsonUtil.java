package cn.flaychat.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import cn.flaychat.model.BaseResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;


public class GsonUtil {

	public static <T> boolean packGson(T clz,int status,String message,HttpServletResponse response){
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
	
	public static <T> boolean packGsonList(List<T> clzs,int status ,String message,HttpServletResponse response){
		
		Gson mGson=new Gson();
		PrintWriter out;
		try {
			String str=mGson.toJson(clzs);
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
