package assignment;

public class MyThread4 implements Runnable
{
public  void run()
{
synchronized(this)
{
	for(int i=0;i<10;i++)
	{
		System.out.println(Thread.currentThread()+"\t"+"Exec:"+"\t"+i);
	}
}
}
	public static void main(String[] args) {
		MyThread4 th=new MyThread4();
		Thread t1=new Thread(th);
		Thread t2=new Thread(th);
		t1.start();
		t2.start();
	}

}
