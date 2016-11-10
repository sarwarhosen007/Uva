import java.util.*;
import java.lang.*;
import java.io.*;


class Average
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
	     int t = sc.nextInt();
		 int[] arr = new int[1000];
		  for(int i = 0; i<t; i++){
 		     int N = sc.nextInt();
			 for(int j = 0; j<N; j++){
				 arr[j] = sc.nextInt();
				  
			 }
			 int sum = 0;
			 for(int j = 0; j<N; j++){
				 sum = sum + arr[j];
				  
			 }
			 double ave = sum/N;
			 int c = 0;
			 for(int j = 0; j<N; j++){
				 if(arr[j] > ave){
					 c++;
				 }
			 }
            double av = (100.0*c)/N;
             
            System.out.printf("%.3f", av);
             System.out.print("%");			
            System.out.println();			
	  }  
	 
	}
}