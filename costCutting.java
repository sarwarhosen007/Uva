 
import java.util.*;
import java.lang.*;
import java.io.*;


class costCutting
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
      int t = sc.nextInt();
	  int[] array = new int[3];
	  for(int k = 0; k<t; k++){		   
             for(int j = 0; j<3; j++){
				 array[j] = sc.nextInt();
			 }	   
	  
	  for (int i = 0; i<3; i++)
      {
        for (int j = 0; j<3; j++)
        {
            if (array[i] < array[j])
            {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
     }
	 System.out.println("Case "+ (k+1) + ": " + array[1]);
	 
	  }
	   
	 
	}
}