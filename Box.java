import java.util.*;
import java.lang.*;
import java.io.*;


class Box 
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
	    int[] arr = new int[100];
		int k = 1;
        while(sc.hasNext()){
			 
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
            for(int i = 0; i<n; i++){
				arr[i] = sc.nextInt();
			}
			int sum = 0;
			for(int i = 0; i<n; i++){
				sum = sum + arr[i];
			}
			int ans = sum/n;
			int res = 0,result = 0;
			for(int i = 0; i<n; i++){
				if(arr[i] < ans){
				  res = ans-arr[i];
				  result = result + res;
				}
			}
			System.out.println("Set #"+(k++));
			System.out.println("The minimum number of moves is "+ result +".");
			System.out.println();
		}
		  	  
  
	}
}