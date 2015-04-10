package cn.flaychat.model;

public class BaseResponse {

	private int status; //系统提供的请求错误编码
	private String msg; //人为编写的错误信息
	private String data; //请求的信息
	/**
	 * @param status
	 * @param msg
	 * @param data
	 */
	public BaseResponse(int status, String msg, String data) {
		super();
		this.status = status;
		this.msg = msg;
		this.data = data;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
}
