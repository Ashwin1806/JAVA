package assignment;

public class MyThread2 implements Runnable
{
	public void run()
	{
		for(char i='A';i<'K';i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) 
	{
		MyThread2 ref=new MyThread2();
		Thread t1=new Thread(ref);
		Thread t2=new Thread(ref);
		t1.start();
		t2.start();
	}

}
