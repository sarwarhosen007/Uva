import java.util.*;
import java.lang.*;
import java.io.*;


class TrainSwaping
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
	    for(int k = 1; k<=t; k++){
			 int n = sc.nextInt();
			 int[]arr = new int[n];
			 for(int i = 0 ; i<n; i++){
				 arr[i] = sc.nextInt();
			 }
			 int c = 0;
			 for(int i = 0; i<n; i++){
				 for(int j = i+1; j<n; j++){
					 if(arr[i] > arr[j]){
						 c++;
					 }
				 }
			 }
			 System.out.println("Optimal train swapping takes "+ c +" swaps.");
		}
 
         
 	    
	}
}