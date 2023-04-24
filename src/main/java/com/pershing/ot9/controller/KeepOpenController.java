package com.pershing.ot9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pershing.ot9.entity.KeepOpen;
import com.pershing.ot9.response.ResponseHandler;
import com.pershing.ot9.service.KeepOpenService;

@RestController
@RequestMapping("/v1/ot9/")
public class KeepOpenController {
	
	@Autowired
	KeepOpenService keepOpenService;
	
	@GetMapping("keep-open/all-entities&pageNum={pageNum}&pageSize={pageSize}&direction={direction}&sortBy={sortBy}")
	public ResponseEntity<Object> getAllKeepOpen(@PathVariable String pageNum,
												 @PathVariable String pageSize, 
												 @PathVariable String direction, 
												 @PathVariable String sortBy) {
		
		return ResponseHandler.generateResponseJSONArray("Success", HttpStatus.OK, "output", 10);
		
	}
	
	
	@PostMapping("keep-open")
	public ResponseEntity<Object> saveKeepOpen(@RequestBody KeepOpen keepOpen) {
		
		return ResponseHandler.generateResponseJSONObject("Success", HttpStatus.CREATED, keepOpenService.saveKeepOpen(keepOpen));
		
	}
	
	@GetMapping("keep-open")
	public String testController() {
		return "testing API";
	}
	
}