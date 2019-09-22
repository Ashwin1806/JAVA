package dacPre1;

import java.io.*;
import java.util.*;

class Employee implements Serializable
{
	private int empid;
	private String empname;
	private String desig;
	 private double basic;
	public Employee(int empid, String empname, String desig, double basic) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.desig = desig;
		this.basic = basic;
	}
	 public void disp()
	 {
		 System.out.println(empid+"\t"+empname+"\t"+desig+"\t"+basic);
	 }
	 public String toString()
	 {
		 return empid+"\t"+empname+"\t"+desig+"\t"+basic;
	 }

}

public class EmpList {

	public static void main(String[] args) 
	{
	Employee e1=new Employee(1,"Ashwin","Manager",80000.45);
	Employee e2=new Employee(2,"Abhishek","Engineer",60000.45);
	Employee e3=new Employee(3,"Ritik","Engineer",50000.45);
	Employee e4=new Employee(4,"Shubham","Lead",65000.45);
	System.out.println("**********Function*************");
	e1.disp();
	e2.disp();
	e3.disp();
	e4.disp();
	System.out.println("**********ArrayListFile*************");
	List<Employee>empList=new ArrayList<Employee>();
	empList.add(e1);
	empList.add(e2);
	empList.add(e3);
	empList.add(e4);
	try (FileOutputStream fos=new FileOutputStream("D:\\Cdac Preparation\\DBMS\\Employee.txt")){
		try(ObjectOutputStream oos=new ObjectOutputStream(fos)){
			oos.writeObject(empList);
			}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	try (FileInputStream fis=new FileInputStream("D:\\Cdac Preparation\\DBMS\\Employee.txt")){
		try(ObjectInputStream ois=new ObjectInputStream(fis)){
			List<Employee>ref=(List<Employee>)ois.readObject();
			Iterator<Employee>itr=ref.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
				
			}
			System.out.println("*********FunctionInFile*********");
			while(itr.hasNext())
			{
				itr.next().disp();
			}
							
			}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	}

}
