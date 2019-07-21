package sampl12;

import java.util.Arrays;

public class emp1 {
	private int i;
	void emp1()
	{
		int a=100/0;
	}
	final void get()
	{
		try
		{
		emp1();
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	
public static void main(String[] args)
{
	int[] m={4,2,8,1,6,5};
	Arrays.sort(m);
	System.out.println(Arrays.toString(m));

}          
}

 

