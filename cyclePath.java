import java.util.*;
import java.lang.*;
import java.io.*;
 

class  cyclePath
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
      int num1 = sc.nextInt();
	  int num2 = sc.nextInt();
	  int c = 1;
	  for(int num = num1; num<=num2; num++){
      
	  while(num != 0){
		  
		  if(num == 1){
			  break;
		  }else{
			  if(num % 2 != 0){
				  num = num *3 + 1;
			  }else{
				  num = num /2;
			  }
		  }
		   c++;
		  //System.out.println(num);
		   
	  }	 
	  
       
	}
	System.out.println(c);
	
	}
}