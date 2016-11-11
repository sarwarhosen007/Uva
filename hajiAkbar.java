import java.util.*;
import java.lang.*;
import java.io.*;


class hajiAkbar 
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
	  int k = 1;
       while(sc.hasNext()){
		   String s = sc.next();
		   if(s.equals("*")){
			   break;
		   }
		   if(s.equals("Hajj")){
			   System.out.println("Case "+(k++) + ":" + " Hajj-e-Akbar");
		   }else{
			   System.out.println("Case " + (k++) + ":" + " Hajj-e-Asghar");
		   }
	   }  
 	    
		  	  
  
	}
}