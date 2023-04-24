package com.pershing.ot9.response;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {
	
	public static ResponseEntity<Object> generateResponseJSONArray(String message, HttpStatus status, Object resObject, Integer count) {
		
		Map<String, Object> map = new HashMap<>();
		
		map.put("message", message);
		map.put("status", status.value());
		map.put("data", resObject);
		map.put("count", count);
		
		return new ResponseEntity<Object>(map, status);
		
	}
	
public static ResponseEntity<Object> generateResponseJSONObject(String message, HttpStatus status, Object resObject) {
		
		Map<String, Object> map = new HashMap<>();
		
		map.put("message", message);
		map.put("status", status.value());
		map.put("data", resObject);
		
		return new ResponseEntity<Object>(map, status);
		
	}

}
