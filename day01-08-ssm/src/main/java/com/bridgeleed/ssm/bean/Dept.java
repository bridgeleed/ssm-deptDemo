package com.bridgeleed.ssm.bean;

import java.io.Serializable;

public class Dept implements Serializable {
	//实体类一般要实现序列化接口，主要是对象在打包传输的过程中防止数据紊乱
	
	private static final long serialVersionUID = 6017496771477857192L;
	private Integer id;
	private String deptName;
	private String deptLoc;
	
	//成员变量和属性的区别 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptLoc() {
		return deptLoc;
	}
	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptLoc == null) ? 0 : deptLoc.hashCode());
		result = prime * result + ((deptName == null) ? 0 : deptName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dept other = (Dept) obj;
		if (deptLoc == null) {
			if (other.deptLoc != null)
				return false;
		} else if (!deptLoc.equals(other.deptLoc))
			return false;
		if (deptName == null) {
			if (other.deptName != null)
				return false;
		} else if (!deptName.equals(other.deptName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", deptName=" + deptName + ", deptLoc=" + deptLoc + "]";
	}
	
	
	
}
