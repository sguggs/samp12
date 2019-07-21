package sampl12;

public class Samp21 implements Runnable {
	public void run()
	{
		for(int i = 0; i < 1000; i++)
        {
            System.out.println(i+" * "+(i+1)+" = " + i * (i+1));
        }
	}

}
