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
		dept.setDeptName("���¾�");
		dept.setDeptLoc("��������");
		//���÷���
		deptdao.insertDept(dept);
		//�ر�����
	   ac.close();
		
	}
	
	@Test
	
	public void testAddService(){
		Dept dept = new Dept();
		dept.setDeptName("��Ŀ��");
		dept.setDeptLoc("�ձ�");
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application-service.xml","application-dao.xml");
		IDeptService deptService = ac.getBean("deptService",DeptService.class);
		deptService.addDept(dept);
		ac.close();
		
		
		
	}

}
