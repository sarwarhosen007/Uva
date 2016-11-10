import java.util.*;
import java.lang.*;
import java.io.*;


class flipSort
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
 
	  int[] array = new int[1001];
	  while(sc.hasNext()){
		  int N = sc.nextInt();
		  for(int i = 1; i<=N; i++){
			  array[i] = sc.nextInt();
		  }
	  
	  int c = 0;
	   for (int i = 1; i<=N; i++)
      {
        for (int j = i+1; j<=N; j++)
        {
            if (array[i] > array[j])
            {
				c++;
                
            }
        }
     } 
	 System.out.println("Minimum exchange operations : " + c);
	  
   }
	   
	 
	}
}