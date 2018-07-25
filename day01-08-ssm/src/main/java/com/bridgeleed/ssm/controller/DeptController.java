package com.bridgeleed.ssm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bridgeleed.ssm.bean.Dept;
import com.bridgeleed.ssm.service.IDeptService;

@Controller
@RequestMapping("/dept")
public class DeptController {
	@Resource
	private IDeptService deptService;
	
	@RequestMapping("/showAddDept.do")
	public String showLogin(){
		return "addDept";
	}
	
	//添加部门信息
	@RequestMapping("/addDept.do")
	public String addDept(String deptName,String deptLoc,HttpSession session){
		Dept dept = new Dept();
		dept.setDeptName(deptName);
		dept.setDeptLoc(deptLoc);
		//调用业务层的方法
		deptService.addDept(dept);
		session.setAttribute("dept", dept);
		return "index";
	}
	
	@RequestMapping("/showAll.do")
	public String showAll(HttpSession session){
		List<Dept> depts = deptService.findAll();
		session.setAttribute("depts", depts);
		return "showAll";
	}
	
	
	

}
