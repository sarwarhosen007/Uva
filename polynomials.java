import java.util.*;
import java.lang.*;
import java.io.*;


class polynomials
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
 
        while(sc.hasNext()){
			int n = sc.nextInt();
			 
			long sum = ((long)Math.pow(n,2)*(long)Math.pow(n+1,2))/4;
			System.out.println(sum); 		
		}
         
 	    
	}
}