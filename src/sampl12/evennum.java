package sampl12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class evennum {
	
	public static String validateEvenLength(String s10)
	{
		String s1=s10;
		String[] s2=	s1.split("\\s");
		//System.out.println("the words in string "+s2.length);
		ArrayList<Integer> s=new ArrayList();
		for(String s4:s2)
		{
			if(s4.length()%2==0)
			s.add(s4.length());
		}
		Collections.sort(s);
		//System.out.println(s);
		if(s.size()!=0)
		{
		//System.out.println(s.get(s.size()-1));
		for(String s6:s2)
		{
			if(s6.length()==s.get(s.size()-1))
					{
				return s6;
					}
		}
		}
		else
		{
		return "not found even length string or no sentence";
		}
		return "not found even length string";
	}
	public static void main(String[] args)
	{
	System.out.println(validateEvenLength(" "));	
	}

}
