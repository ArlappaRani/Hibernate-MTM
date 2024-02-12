package com.hibernate.mtm.HibernateProjectMTM;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;


@Entity
public class Employee2 {
	@Id
	int emp_Id;
	String emp_Name;
	String emp_Team;
	
	@ManyToMany
	List<Technology> tech;

	public Employee2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee2(int emp_Id, String emp_Name, String emp_Team, List<Technology> tech) {
		super();
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.emp_Team = emp_Team;
		this.tech = tech;
	}

	public int getEmp_Id() {
		return emp_Id;
	}

	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}

	public String getEmp_Name() {
		return emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}

	public String getEmp_Team() {
		return emp_Team;
	}

	public void setEmp_Team(String emp_Team) {
		this.emp_Team = emp_Team;
	}

	public List<Technology> getTech() {
		return tech;
	}

	public void setTech(List<Technology> tech) {
		this.tech = tech;
	}
	

	
	
	
	
	
	
	

}
