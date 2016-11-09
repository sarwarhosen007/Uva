import java.util.*;
import java.lang.*;
import java.io.*;
 

class uglyNumber
{
	public static void main (String[] args)  
	{
	  int c = 1;
	  int num = 2;
	  System.out.println(1);
      while(c != 11){
		
		if(num % 2 == 0 || num % 3 == 0 || num % 5 == 0){
			System.out.println(num);
			c++;
		}
       num++;		
	  } 	  
       
	}
}