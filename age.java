import java.util.*;
import java.lang.*;
import java.io.*;

class age
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		 while(sc.hasNext()){
			  long num = sc.nextLong();
			  if(num == 0){
				  break;
			  }
			  int[] arr = new int[1000000];
			  for(int i = 0; i<num; i++){
				  arr[i] = sc.nextInt();
			  }
			  
			  for(int i=0; i<num; i++){
 					  
				  for(int j = 0; j<num; j++){
					  if(arr[i] < arr[j]){
						  int temp = arr[i];
						  arr[i] = arr[j];
						  arr[j] = temp;
					  }
 				  } 
			  }
			  for(int i = 0; i<num; i++){
				  System.out.print(arr[i]);
				  System.out.print(" ");
			  }
			  System.out.println();
			  
		 }
		 
	}
}