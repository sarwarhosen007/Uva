import java.util.*;
import java.lang.*;
import java.io.*;


class pizza
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
       while(sc.hasNext()){
		 long n = sc.nextInt();
		 if(n<0){
			 break;
		 }
		 if(n>=0){
		 long ans = ((n*(n+1))/2)+1;
		 System.out.println(ans);
		 }
	   }  
 	    
	}
}