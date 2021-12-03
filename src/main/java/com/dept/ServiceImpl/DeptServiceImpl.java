package com.dept.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dept.Entity.Department;
import com.dept.Repository.DeptRepository;
import com.dept.Service.DeptService;

@Service
public class DeptServiceImpl implements DeptService{

	private final DeptRepository repo;
	@Autowired
	public DeptServiceImpl(DeptRepository repo) {
		this.repo = repo;
	}
	@Override
	public Department saveDept(Department dept) {
		repo.save(dept);
		return dept;
	}

	@Override
	public Department getDept(Long deptId) {
		Department dept = repo.findById(deptId).get();
		return dept;
	}

}
