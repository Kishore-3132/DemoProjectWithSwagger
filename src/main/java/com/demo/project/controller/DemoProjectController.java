package com.demo.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.project.dto.DemoProjectDTO;
import com.demo.project.dto.DemoProjectRequest;
import com.demo.project.dto.DemoProjectResponse;
import com.demo.project.service.IDemoProjectService;

@CrossOrigin
@RestController
public class DemoProjectController 
{
	@Autowired
	private IDemoProjectService demoProjectService;
	
	@PostMapping("/addData")
	public ResponseEntity<DemoProjectResponse> addData(@RequestBody DemoProjectRequest request) 
	{
		DemoProjectResponse response = demoProjectService.addData(request);
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@GetMapping("/getAllDetails")
	public ResponseEntity<List<DemoProjectDTO>> getAllDetails() 
	{
		List<DemoProjectDTO> response = demoProjectService.getAllDetails();
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@PostMapping("/deleteData")
	public ResponseEntity<DemoProjectResponse> deleteData(@RequestBody DemoProjectRequest request) 
	{
		DemoProjectResponse response = demoProjectService.deleteData(request);
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
