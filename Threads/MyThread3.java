/*3) create 3 threads in such a way that while one thread is executing, 2 threads cannot interfere.
they should display output "Exec  0" to "Exec 5".*/
package assignment;

public class MyThread3 extends Thread 
{
	public synchronized void run()
{
	for(int i=0;i<6;i++)
	{
		System.out.println(Thread.currentThread()+"\t"+"Exec:"+"\t"+i);
	}
}

public static void main(String[] args) {
	MyThread3 t1=new MyThread3();
	MyThread3 t2=new MyThread3();
	MyThread3 t3=new MyThread3();
	t1.start();
	t2.start();
	t3.start();
}
	}


