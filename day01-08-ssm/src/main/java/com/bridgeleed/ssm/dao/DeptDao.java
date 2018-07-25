package com.bridgeleed.ssm.dao;

import java.util.List;

import com.bridgeleed.ssm.bean.Dept;

public interface DeptDao {
	void insertDept(Dept dept);
	void updateDept(Dept dept);
	void deleteDept(Integer id);
	Dept selectDept(Integer id);
	List<Dept> selectAll();
	

}
