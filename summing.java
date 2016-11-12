import java.util.*;
import java.lang.*;
import java.io.*;


class summing
{   
   public int rec(int num){
	      int sum = 0;
	     if(num < 10){
			 return num;
		 } else{
			 
			  while(num != 0){
				  int temp = num%10;
				  sum = sum + temp;
				  num = num/10;
			  }
			  return rec(sum);
		 }   
   }
   
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
       while(sc.hasNext()){
		 int n = sc.nextInt();
		 if(n == 0){
			 break;
		 }
		 summing ob = new summing();
		 int res = ob.rec(n);
		 System.out.println(res);
		 
	   }  
 	    
	}
}