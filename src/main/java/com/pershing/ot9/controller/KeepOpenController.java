package com.pershing.ot9.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pershing.ot9.model.KeepOpenModel;
import com.pershing.ot9.response.ResponseHandler;
import com.pershing.ot9.service.KeepOpenService;

@RestController
@RequestMapping("/v1/ot9")
public class KeepOpenController {
	
	@Autowired
	KeepOpenService keepOpenService;
	
	@GetMapping("/keep-open/all-entities&pageNum={pageNum}&pageSize={pageSize}&direction={direction}&sortBy={sortBy}")
	public ResponseEntity<Object> getAllKeepOpen(@PathVariable String pageNum,
												 @PathVariable String pageSize, 
												 @PathVariable String direction, 
												 @PathVariable String sortBy) {
		
		return ResponseHandler.generateResponseJSONArray("Success", HttpStatus.OK, "output", 10);
		
	}
	
	
	@PostMapping("/keep-open")
	public ResponseEntity<Object> saveKeepOpen(@RequestBody KeepOpenModel keepOpen) throws ParseException {
		List<String> errors = keepOpenService.validate(keepOpen);
		if(errors.size() > 0 ) {
			return ResponseHandler.generateResponseJSONObject("Invalid Data", HttpStatus.BAD_REQUEST, 
					errors 
					);
		}
		return ResponseHandler.generateResponseJSONObject("Success", HttpStatus.CREATED, 
				keepOpenService.saveKeepOpen(keepOpen) );
		
	}
	
	
	
	@GetMapping("keep-open")
	public String testController() {
		return "testing API";
	}
	
}
