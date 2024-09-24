package com.demo.project.service;


import java.util.List;

import com.demo.project.dto.DemoProjectDTO;
import com.demo.project.dto.DemoProjectRequest;
import com.demo.project.dto.DemoProjectResponse;

public interface IDemoProjectService  {

	public DemoProjectResponse addData(DemoProjectRequest request);
	public List<DemoProjectDTO> getAllDetails();
	public DemoProjectResponse deleteData(DemoProjectRequest request);
}
