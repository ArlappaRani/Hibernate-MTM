package com.hibernate.mtm.HibernateProjectMTM;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;


@Entity
public class Technology {
	@Id
	int tech_Id;
	String tech_Name;
	
	@ManyToMany
	List<Employee2>emp;

	public Technology() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Technology(int tech_Id, String tech_Name, List<Employee2> emp) {
		super();
		this.tech_Id = tech_Id;
		this.tech_Name = tech_Name;
		this.emp = emp;
	}

	public int getTech_Id() {
		return tech_Id;
	}

	public void setTech_Id(int tech_Id) {
		this.tech_Id = tech_Id;
	}

	public String getTech_Name() {
		return tech_Name;
	}

	public void setTech_Name(String tech_Name) {
		this.tech_Name = tech_Name;
	}

	public List<Employee2> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee2> emp) {
		this.emp = emp;
	}
	
	
	
	
	
	

}
