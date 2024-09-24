package com.demo.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.project.dto.DemoProjectDTO;
import com.demo.project.dto.DemoProjectRequest;
import com.demo.project.dto.DemoProjectResponse;
import com.demo.project.repository.IDemoProjectRepository;

@Service
public class DemoProjectServiceImpl implements IDemoProjectService 
{
	@Autowired
	private IDemoProjectRepository demoProjectRepository; 
	
	@Override
	public DemoProjectResponse addData(DemoProjectRequest request) {
		
		DemoProjectDTO demoProject = new DemoProjectDTO();
		demoProject.setAge(request.getAge());
		demoProject.setGender(request.getGender());
		demoProject.setMobileNo(request.getMobileNo());
		demoProject.setName(request.getName());
		
		DemoProjectDTO data =demoProjectRepository.save(demoProject);
		
		DemoProjectResponse response = new DemoProjectResponse();

		if(data.getId() != null)
		{
			response.setId(data.getId());
			response.setResponse("Succesfully Data Added!!!!");
		}
		else
		{
			response.setResponse("Sorry Error Occured!!!!");
		}
		
		return response;
	}

	@Override
	public List<DemoProjectDTO> getAllDetails() 
	{
		List<DemoProjectDTO> dataList = demoProjectRepository.findAll();
		return dataList;
	}

	@Override
	public DemoProjectResponse deleteData(DemoProjectRequest request) {
		DemoProjectResponse response = new DemoProjectResponse();
		try 
		{
			demoProjectRepository.deleteById(request.getId());
			response.setResponse("Data Succesfully Deleted!!!!");
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			response.setResponse("Sorry Error Occured!!!!");
		}
		
		return response;
	}

}
