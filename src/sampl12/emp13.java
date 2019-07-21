package sampl12;

import java.util.Arrays;

public class emp13 {
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
	String s1="hello",s2="world";
	s1=s1+s2;
	s2=s1.substring(0,s1.length()-s2.length());
	s1=s1.substring(s2.length());
	System.out.println(s2+"  "+s1);

}          
}

 

