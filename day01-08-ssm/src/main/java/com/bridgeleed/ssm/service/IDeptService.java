package com.bridgeleed.ssm.service;

import java.util.List;

import com.bridgeleed.ssm.bean.Dept;

public interface IDeptService {
	 void addDept(Dept dept);
	 List<Dept> findAll();
	

}
