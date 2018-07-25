package test;


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeleed.ssm.bean.Dept;
import com.bridgeleed.ssm.dao.DeptDao;
import com.bridgeleed.ssm.service.DeptService;
import com.bridgeleed.ssm.service.IDeptService;

public class TestDept {
	
	@Test
	public void testInsertDept(){
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application-dao.xml");
		DeptDao deptdao = ac.getBean("deptDao",DeptDao.class);
		Dept dept = new Dept();
		dept.setId(3);
		dept.setDeptName("董事局");
		dept.setDeptLoc("泛化国际");
		//调用方法
		deptdao.insertDept(dept);
		//关闭容器
	   ac.close();
		
	}
	
	@Test
	
	public void testAddService(){
		Dept dept = new Dept();
		dept.setDeptName("项目部");
		dept.setDeptLoc("日本");
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application-service.xml","application-dao.xml");
		IDeptService deptService = ac.getBean("deptService",DeptService.class);
		deptService.addDept(dept);
		ac.close();
		
		
		
	}

}
