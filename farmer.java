import java.util.*;
import java.lang.*;
import java.io.*;


class farmer
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
			 int f = sc.nextInt();
			 long sum = 0;
			 for(int j = 0; j<f; j++){
				 long s = sc.nextLong();
			     long a = sc.nextLong();
			     long e = sc.nextLong();
				 sum = sum + (s*e);
			 }
			System.out.println(sum);
		}		
 	    
	}
}