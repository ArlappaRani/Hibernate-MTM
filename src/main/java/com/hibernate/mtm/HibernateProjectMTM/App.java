package com.hibernate.mtm.HibernateProjectMTM;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
    	//creating the Employee list for grouping the Employees based on technologies are 4
    	//creating the list for storing the employees
    	
    	List<Employee2> emplist1=new ArrayList<Employee2>();
    	List<Employee2> emplist2=new ArrayList<Employee2>();
    	List<Employee2> emplist3=new ArrayList<Employee2>();
    	List<Employee2> emplist4=new ArrayList<Employee2>();
    	
    	//creating the objects of employees
    	Employee2 emp1=new Employee2();
    	Employee2 emp2=new Employee2();
    	Employee2 emp3=new Employee2();
    	Employee2 emp4=new Employee2();
    	Employee2 emp5=new Employee2();
    	
    	//adding the employees in emp list for knowing who are using specific technology
    	//Technology1 java users
    	//Adding the employee objects to emplist1
    	emplist1.add(emp1);
    	emplist1.add(emp3);
    	emplist1.add(emp5);
    	
    	//Technology 2 My SQL users
    	//Adding the employee objects to emplist2
    	emplist2.add(emp1);
    	emplist2.add(emp2);
    	emplist2.add(emp4);
    	emplist2.add(emp5);
    	
    	//Technology 3 Python users
    	//Adding the employee objects to emplist3
    	emplist3.add(emp2);
    	emplist3.add(emp4);
    	emplist3.add(emp5);
    	
    	//Technology 4 React users
    	//Adding the employee objects to emplist4
    	emplist4.add(emp1);
    	emplist4.add(emp2);
    	emplist4.add(emp3);
    	emplist4.add(emp4);
    	emplist4.add(emp5);
    	
   //Creating the Tecnolgy list for grouping the Technologies based on employees are 5
    	//creating the list for storing the technologies
    	List<Technology> techlist1=new ArrayList<Technology>();
    	List<Technology> techlist2=new ArrayList<Technology>();
    	List<Technology> techlist3=new ArrayList<Technology>();
    	List<Technology> techlist4=new ArrayList<Technology>();
    	List<Technology> techlist5=new ArrayList<Technology>();
    	
    	
    	//creating the objects of technologies
    	
    	Technology tech1=new Technology();
    	Technology tech2=new Technology();
    	Technology tech3=new Technology();
    	Technology tech4=new Technology();
    	
    	//how many technologies are teaching  first employee
    	//Adding the Technology object to techlist1
    	techlist1.add(tech1);
    	techlist1.add(tech2);
    	techlist1.add(tech4);
    	
    	//how many technologies are teaching  second employee
    	//Adding the Technology object to techlist2
    	techlist2.add(tech2);
    	techlist2.add(tech3);
    	techlist2.add(tech4);
    	
    	//how many technologies are teaching  third employee
    	//Adding the Technology object to techlist3
    	techlist3.add(tech1);
        techlist3.add(tech4);
    	
    	//how many technologies are teaching fourth employee
      //Adding the Technology object to techlist4
    	techlist4.add(tech2);
    	techlist4.add(tech3);
    	techlist4.add(tech4);
    	
    	//how many technologies are teaching fifth employee
    	//Adding the Technology object to techlist5
    	techlist5.add(tech1);
    	techlist5.add(tech2);
    	techlist5.add(tech3);
    	techlist5.add(tech4);
    	
    	//setting the data for employee1 object
    	emp1.setEmp_Id(11);
    	emp1.setEmp_Name("Prakash");
    	emp1.setEmp_Team("Team-A");
    	emp1.setTech(techlist1);
    	
    	//setting the data for employee2 object
    	emp2.setEmp_Id(12);
    	emp2.setEmp_Name("Praveen");
    	emp2.setEmp_Team("Team-B");
    	emp2.setTech(techlist2);
    	
    	//setting the data for employee3 object
    	emp3.setEmp_Id(13);
    	emp3.setEmp_Name("Pooja");
    	emp3.setEmp_Team("Team-C");
    	emp3.setTech(techlist3);
    	
    	//setting the data for employee4 object
    	emp4.setEmp_Id(14);
    	emp4.setEmp_Name("Priya");
    	emp4.setEmp_Team("Team-A");
    	emp4.setTech(techlist4);
    	
    	//setting the data for employee5 object
    	emp5.setEmp_Id(15);
    	emp5.setEmp_Name("Prateek");
    	emp5.setEmp_Team("Team-B");
    	emp5.setTech(techlist5);
    	
    	
    	//setting the data for technology1 object
    	tech1.setTech_Id(123);
    	tech1.setTech_Name("Java");
    	tech1.setEmp(emplist1);
    	
    	//setting the data for technology2 object
    	tech2.setTech_Id(124);
    	tech2.setTech_Name("MYSQL");
    	tech2.setEmp(emplist2);
    	
    	//setting the data for technology3 object
    	tech3.setTech_Id(125);
    	tech3.setTech_Name("Python");
    	tech3.setEmp(emplist3);
    	
    	//setting the data for technology4 object
    	tech4.setTech_Id(126);
    	tech4.setTech_Name("React");
    	tech4.setEmp(emplist4);
    	
    	//creating configuration
    	Configuration  cfg=new Configuration().configure();
    	//creating the session factory
    	SessionFactory factory=cfg.buildSessionFactory();
    	//opening the session
    	Session session=factory.openSession();
    	//creating the transaction
    	Transaction trans=session.beginTransaction();
    	
         session.save(emp1);
    	 session.save(emp2);
    	 session.save(emp3);
    	 session.save(emp4);
    	 session.save(emp5);
    	 session.save(tech1);
       	 session.save(tech2);
    	 session.save(tech3);
    	 session.save(tech4);
    	
    	trans.commit();
    }
}
