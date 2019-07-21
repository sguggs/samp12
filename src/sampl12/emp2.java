package sampl12;

import java.util.ArrayList;
import java.util.Arrays;

public class emp2  {
	
static boolean isboolean(int n)
{
	if(n==0)
		return false;
	if(n==1)
		return false;
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			return false;
		}
	}
	return true;
}
	public static void main(String[] args) {
		int[] a= {1,3,6,5,4,0,0,3,0,6};
		int last=0;
		for(int i=a.length-1;i>=0;i--)
		{
			
			if(last==0)
				last=i;
			if(a[i]>0)
				a[last--]=a[i];
		}
		while(last>=0)
			a[last--]=0;
		System.out.println(Arrays.toString(a));
	}
	
}

