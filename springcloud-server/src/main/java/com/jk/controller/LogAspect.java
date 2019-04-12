/** 
 * <pre>项目名称:ssh-muser 
 * 文件名称:LogAspect.java 
 * 包名:com.jk.lfj.service.impl 
 * 创建日期:2019年1月25日上午11:23:29 
 * Copyright (c) 2019, All Rights Reserved.</pre> 
 */  
package com.jk.controller;



import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.jk.model.CommonUtils;

import com.jk.pojo.LogBean;
import org.aspectj.lang.JoinPoint;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;




/** 
 * <pre>项目名称：ssh-muser    
 * 类名称：LogAspect    
 * 类描述：    
 * 创建人：刘凤军
 * 创建时间：2019年1月25日 上午11:23:29    
 * @version </pre>    
 */
@Aspect
@Component
public class LogAspect {

	@Autowired
	public MongoTemplate mongoTemplate;

	@Pointcut("execution(* com.jk..*.*(..))")
	public  void  logPointcut() {}

	@AfterReturning(value="logPointcut()",returning="ftv")
	public void  Logafter(JoinPoint joinpoint,Object ftv) {
		LogBean logBean = new LogBean();
		//时间
		logBean.setCreateDate(new Date());
		//获取类名
		String name = joinpoint.getTarget().getClass().getName();
		logBean.setClassName(name);
		//方法名
		String name2 = joinpoint.getSignature().getName();
		logBean.setMethod(name2);
       //请求参数
		String argStr="";
		Object[] args = joinpoint.getArgs();
	    for (Object object : args) {
	    	argStr+=","+object.toString();
		}
	    logBean.setRequestParam(argStr);
	    //返回值
	    
	    if (ftv!=null) {
	    	  logBean.setResponseResult(ftv.toString());
		}
	
	    //回去request对象
	    ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
	    HttpServletRequest request = requestAttributes.getRequest();

	     //获取ip地址
	     String ip = CommonUtils.getIp(request);
	     logBean.setIp(ip);
		System.out.println(logBean);
	     mongoTemplate.save(logBean);
	}
	
	

	
}