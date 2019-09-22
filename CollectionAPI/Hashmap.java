package dacPre1;

import java.util.*;

public class Hashmap {

	public static void main(String[] args) {
		Map<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(1,"Ashwin");
		hm.put(2,"Abhishek");
		hm.put(3,"Leo");
		hm.put(4,"Tarun");
		hm.put(5,"Issac");
		hm.put(6,"Ritik");
		hm.put(7,"Shubham");
		hm.put(8,"Akshay");
		hm.put(9,"Aniket");
		hm.put(10,"Aniket");
		Set<?>s=hm.entrySet();
		Iterator<?>itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
