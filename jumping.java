import java.util.*;
import java.lang.*;
import java.io.*;

class jumping
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		  int t = sc.nextInt();
		   
		  for(int i = 0; i<t; i++){
			  int n = sc.nextInt();
			  int[] arr = new int[50];
			  for(int j = 0; j<n; j++){
				 arr[j] = sc.nextInt();				 
			  }
			  int low = 0,high = 0,nothing = 1;
			  for(int j =0; j<n; j++){
			     if(arr[j] < arr[j+1]){					 
					 high++;
				 }else if(arr[j] > arr[j+1]){
					  low++;
				 }else{
					 nothing = 0;
				 }
			  }
			  System.out.print("Case " +(i+1)+ ": ");
			  System.out.print(high);
			  System.out.print(" ");
			  if(low > 0){
				 
                System.out.print((low-1));				
			  }else{
				 System.out.print(low);
			  }
			  System.out.println();
		  }
	}
}