package dacPre1;

import java.util.*;

public class Cricket_demo {

	public static void main(String[] args) {

			Map<Integer,String>mymap=new HashMap<Integer,String>();
			mymap.put(1,"Sachin");
			mymap.put(2,"Dhoni");
			mymap.put(3,"Kohli");
			mymap.put(4,"Rohit sharma");
			mymap.put(5,"Pandya");
			System.out.println("*******Map********");
			Set<?>set=mymap.entrySet();
			Iterator<?>iterator=set.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			System.out.println("*******GetFunction********");
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Rank 1to 5");
			int i=scanner.nextInt();
			System.out.println(mymap.get(i));
			
	}

}
