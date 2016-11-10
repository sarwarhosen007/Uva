import java.util.*;
import java.lang.*;
import java.io.*;


class flipSort
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
	  while(sc.hasNext()){
		  int s = sc.nextInt();
		  int d = sc.nextInt();
		  //System.out.println(s);
		  int c = 1;
           		  
		   while(s != d){
			   int f = s;
			   while(f != 1){
			   if(f % 2 ==0){
				   f = f/2;
				   c++;

			   }else{
				   f = 3*f + 1;
				   c++;
			   }			   
		     }
		     s++;
		  System.out.println(c);
		  	  
   }
	  }  
	 
	}
}