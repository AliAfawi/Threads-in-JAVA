package threads;


class MyThread extends Thread
{
	MyThread(String caption)
	{
		super(caption);
	}

	public void run()
	{
		for(int i = 1; i < 5; i++)
		{
			System.out.println(i+"ali "+" joma"+" afawi"+getName());
			try{
				sleep ((long)(Math.random()*5000));
			}catch (InterruptedException e){}
		}
	}
}

