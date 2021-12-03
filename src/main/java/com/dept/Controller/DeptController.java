package com.dept.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dept.Entity.Department;
import com.dept.Service.DeptService;

@RestController
@RequestMapping("dept")
public class DeptController {
	
	private final DeptService service ;
	@Autowired
	public DeptController(DeptService service) {
		this.service = service;
	}
	
	@PostMapping("/save")
	public Department saveDept(@RequestBody Department dept)
	{
		return service.saveDept(dept);
	}
	
	@GetMapping("/get/{id}")
	public Department getDept(@PathVariable("id") Long id)
	{
		return service.getDept(id);
	}

}
