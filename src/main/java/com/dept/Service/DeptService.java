package com.dept.Service;

import com.dept.Entity.Department;

public interface DeptService {

public Department saveDept(Department dept);
	
	public Department getDept(Long deptId);
}
