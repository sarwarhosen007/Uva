import java.util.*;
import java.lang.*;
import java.io.*;


class automatic
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
	  int t = sc.nextInt();
	  for(int i = 0; i<t; i++){
		  int n = sc.nextInt();
		  int ans = Math.abs((((((n*567)/9)+7492)*235)/47)-498);
		  String s = Integer.toString(ans);
		  int len = s.length();
		  int x = Character.getNumericValue(s.charAt(len-2));
		   
		   if(x==1){
			  System.out.println(x); 
		   }else if(x==2){
			  System.out.println(x); 
		   }else if(x==3){
			  System.out.println(x); 
		   }else if(x==4){
			  System.out.println(x); 
		   }else if(x==5){
			  System.out.println(x); 
		   }else if(x==6){
			  System.out.println(x); 
		   }else if(x==7){
			  System.out.println(x); 
		   }else if(x==8){
			  System.out.println(x); 
		   }else if(x==9){
			  System.out.println(x); 
		   }
		   else{
			  System.out.println("0");  
		   }
		  
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
         
 	    
	}
}