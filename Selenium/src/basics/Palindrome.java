package basics;

import java.util.Iterator;

public class Palindrome 
{

	public static void main(String[] args) {
	
		
		String str="kkan";
		
		str=str.toLowerCase();
		
	    boolean flag=false;
	    
	    int i,j;
	    i=0;j=str.length()-1;
	    while(i<j)
	    {
	    	if(str.charAt(i)==str.charAt(j))
	    	{
	    		flag=true;
	    	}
	    	else
	    	{
	    		flag=false;
	    	}
	    	i++;
	    	j--;
	    }
	    
//	    String rev="";
//	    
//	    for (int i = str.length()-1; i >= 0; i--) 
//	    {
//			rev=rev+str.charAt(i);
//		}
//		
//		if(str.equals(rev))
//		{
//			System.out.println("Palindrome");
//		}
//		else
//		{
//			System.out.println("Not a Palindrome");
//		}
	}
	
}
