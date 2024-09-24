package com.demo.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.project.dto.DemoProjectDTO;
@Repository
public interface IDemoProjectRepository extends JpaRepository<DemoProjectDTO, Integer>{

	
}
