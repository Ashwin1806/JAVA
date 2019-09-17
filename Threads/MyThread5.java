/*5) create 2 threads
	one thread will display 1 to 50
	second thread will display 50 to 1
both the threads should start simultaneously.
(use implements method)*/

package assignment;

class Asce implements Runnable {
	public void run() {

		for (int i = 1; i < 51; i++) 
		{
			System.out.println(i);
		}
	}
}

class Desc implements Runnable {
	public void run() {

		for (int i = 50; i > 0; i--) 
		{
			System.out.println(i);
		}
	}
}

public class MyThread5 {

	public static void main(String[] args) {
		Asce a = new Asce();
		Desc d = new Desc();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(d);
		t1.start();
		t2.start();
	}

}
