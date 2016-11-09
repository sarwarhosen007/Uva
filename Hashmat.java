import java.util.*;
import java.lang.*;
import java.io.*;
 

class Main
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);	  
      while(sc.hasNext()){		  
		 long num1 = sc.nextLong();
		 long  num2 = sc.nextLong();		  
		 
		 if(num1<num2){
			 System.out.println(num2-num1);
		 }else{
			System.out.println(num1-num2); 
		 }
	  } 
	}
}