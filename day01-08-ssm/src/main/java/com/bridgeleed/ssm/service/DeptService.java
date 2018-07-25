package com.bridgeleed.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bridgeleed.ssm.bean.Dept;
import com.bridgeleed.ssm.dao.DeptDao;
//��һ��Ҳ��Ҫ����
@Service
public class DeptService implements IDeptService {
	@Resource
	private DeptDao deptDao;

	public void addDept(Dept dept) {
		deptDao.insertDept(dept);
		System.out.println("����addDept");
		
	}
	
	public List<Dept> findAll(){
		List<Dept> depts = deptDao.selectAll();
		return depts;
		
	}

}
