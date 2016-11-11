import java.util.*;
import java.lang.*;
import java.io.*;


class Zapping
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
       while(sc.hasNext()){
		 int f = sc.nextInt();
		 int s = sc.nextInt();
		 if(f== -1 && s == -1){
			 break;
		 }
		 int max = 0,min = 0,ans = 0;
		  if(f>s){
			  max = f;
		  }else{
			  max = s;
		  }
		  if(s>f){
			  min = f;
		  }else{
			  min = s;
		  }
 
  		  int t = Math.abs(f - s);
		  ans = 100-max;
          if(t>=50){			 
            System.out.println(ans+min);			
		  }else if(t<50){
			 System.out.println(t);  
 		  }else{
			  System.out.println("0");
		  }
	   }  
 	    
	}
}