package assignment;

public class MyThread1 extends Thread
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
		MyThread1 t1=new MyThread1();
		MyThread1 t2=new MyThread1();
		t1.start();
		t2.start();
	}

}
