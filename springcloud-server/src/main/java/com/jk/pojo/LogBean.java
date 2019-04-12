/** 
 * <pre>项目名称:ssm-muser-wdd 
 * 文件名称:LogBean.java 
 * 包名:com.jk.wdd.pojo 
 * 创建日期:2019年1月23日上午10:04:06 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.pojo;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

@Document(collection="t_logs")
public class LogBean {
	@Field("id")
	private String id; //id
	@Field("userId")
	private Integer userId;  //用户id
	@Field("userName")
	private String  userName;//用户名字
	@Field("ip")
	private String ip;  // ip地址
	@Field("className")
	private String className; // 累名字
	@Field("method")
	private String method;  //方法名
	@Field("requestParam")
	private String requestParam; //入参数值
	@Field("responseResult")
	private String responseResult;//出餐数值
	@Field("createDate")
	private Date createDate;  //监控时间
	@Field("stsDate")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date  stsDate;//
	@Field("endDate")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date  endDate;//



	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getRequestParam() {
		return requestParam;
	}
	public void setRequestParam(String requestParam) {
		this.requestParam = requestParam;
	}
	public String getResponseResult() {
		return responseResult;
	}
	public void setResponseResult(String responseResult) {
		this.responseResult = responseResult;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getStsDate() {
		return stsDate;
	}
	public void setStsDate(Date stsDate) {
		this.stsDate = stsDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	/* (non-Javadoc)    
	 * @see java.lang.Object#toString()    
	 */
	@Override
	public String toString() {
		return "LogBean [id=" + id + ", userId=" + userId + ", userName=" + userName + ", ip=" + ip + ", className="
				+ className + ", method=" + method + ", requestParam=" + requestParam + ", responseResult="
				+ responseResult + ", createDate=" + createDate + ", stsDate=" + stsDate + ", endDate=" + endDate + "]";
	}
	   
	/**    
	 * <pre>创建一个新的实例 LogBean.    
	 *    </pre>    
	 */
	public LogBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	   
	/**    
	 * <pre>创建一个新的实例 LogBean.    
	 *    
	 * @param id
	 * @param userId
	 * @param userName
	 * @param ip
	 * @param className
	 * @param method
	 * @param requestParam
	 * @param responseResult
	 * @param createDate
	 * @param stsDate
	 * @param endDate</pre>    
	 */
	public LogBean(String id, Integer userId, String userName, String ip, String className, String method,
                   String requestParam, String responseResult, Date createDate, Date stsDate, Date endDate) {
		super();
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.ip = ip;
		this.className = className;
		this.method = method;
		this.requestParam = requestParam;
		this.responseResult = responseResult;
		this.createDate = createDate;
		this.stsDate = stsDate;
		this.endDate = endDate;
	}
	
	
	
	
	
}
