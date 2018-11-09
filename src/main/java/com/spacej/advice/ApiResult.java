package com.spacej.advice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ApiResult {
	
    private int code;
   
    private String message;
    
    private Object value;
	public ApiResult() {
		super();
	}
	public ApiResult(int code, String message, Object value) {
		super();
		this.code = code;
		this.message = message;
		this.value = value;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public static ApiResult valueOf(Object body) {
		ErrorCode success = ErrorCode.SUCCESS;
		return new ApiResult(success.getCode(), success.getMsg(), body);
	}
	public static Object errorOf(ErrorCode jsonParseError, String message2) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
