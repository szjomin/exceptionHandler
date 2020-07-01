package com.jm.utils;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.jm.entity.ResponseInfo;

@ControllerAdvice
public class ExceptionAdvice {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public ResponseInfo defaultErrorHandler(HttpServletRequest request, Exception e) throws Exception {
		ResponseInfo r = new ResponseInfo();		
		return  r.error(e.getMessage());
	}

	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseInfo handlerNoFoundException(Exception e) {
		logger.error(e.getMessage(), e);
		return ResponseInfo.error("404", "路径不存在,请检查路径是否存在");
	}
	
}
