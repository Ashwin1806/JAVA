package dacPre1;

import java.io.*;
import java.util.*;

class Myclass implements Serializable
{
	private int id;
	private String name;
	public Myclass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String toString()
	{
		return id+"\t"+name;
	}
}

public class Demo1 {

	public static void main(String[] args) {
		Myclass m1=new Myclass(1,"Ashwin");
		Myclass m2=new Myclass(2,"Bablu");
		Myclass m3=new Myclass(3,"Mayur");
		Myclass m4=new Myclass(4,"Vijay");
		Myclass m5=new Myclass(5,"Pankaj");
		List<Myclass>myclass=new ArrayList<Myclass>();
		myclass.add(m1);
		myclass.add(m2);
		myclass.add(m3);
		myclass.add(m4);
		myclass.add(m5);
		try (FileOutputStream fos=new FileOutputStream("D:\\Cdac Preparation\\DBMS\\test.txt")){
			try(ObjectOutputStream oos=new ObjectOutputStream(fos)) {
				oos.writeObject(myclass);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (FileInputStream fis=new FileInputStream("D:\\Cdac Preparation\\DBMS\\test.txt")){
			try(ObjectInputStream ois=new ObjectInputStream(fis)) {
				List<Myclass>ref=(List<Myclass>)ois.readObject();
				Iterator<?>itr=ref.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
