import java.util.*;
import java.lang.*;
import java.io.*;


class radio 
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
         long n = sc.nextLong();
		 int k = sc.nextInt();
		 
		 long[] arr = new long[100000];
		 long[] arrS = new long[100000];

		 for(int i = 0; i<n; i++){
			 arr[i] = sc.nextLong();
		 }
		 
		long min = arr[0];
        for(int i= 0; i<n; i++){
			 if(arr[i] < min){
				 min = arr[i];
			 }
 		}      
        long max = arrS[0];
        for(int i= 0; i<n; i++){
			 if(arr[i] > max){
				 max = arr[i];
			 }
 		}
		int c = 0;
       for(long i = min; i<=max; i++){
		   c++;
	   }	 
       int t = 1,temp = 0;
	   
	   int q = (2*k) + 1;
   	   while(t > 0){
		   if(c > q){
			   temp++;
			   c = c - q;
		   }else{
			   temp++;
			   break;
		   }
		   t++;
	   }
	  System.out.print(temp); 
  
	}
}