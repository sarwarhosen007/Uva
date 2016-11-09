import java.util.*;
import java.lang.*;
import java.io.*;


class oddSum
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
      int t = sc.nextInt();
	  for(int i = 0; i<t; i++){
		  int n =  sc.nextInt();
		  int m =  sc.nextInt();
		  int sum = 0;
		  for(int j = n; j<=m; j++){
			 if(j % 2 != 0){
				 sum = sum + j;
			 }  
		  } 
 
          System.out.println("Case "+ (i+1) + ": " + sum);		  
 		  
		  
 
	  }
	 
	}
}