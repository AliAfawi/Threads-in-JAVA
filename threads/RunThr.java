package threads;


public class RunThr
{
	public static void main(String args[])
	{

		Thread t11 = new Thread(new MyRunThread ("t1"));
		Thread t22 = new Thread(new MyRunThread ("t2"));

		t11.start();
		t22.start();
	}
}

