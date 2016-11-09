import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
      int t = sc.nextInt();
	  for(int i = 0; i<t; i++){		    
		   String[] c_array = sc.next().split("/");
		   String[] b_array = sc.next().split("/");
		    
		   int cdd = Integer.parseInt(c_array[0]);		   
		   int cmm = Integer.parseInt(c_array[1]);		   
		   int cyy = Integer.parseInt(c_array[2]);
		   
		   int bdd = Integer.parseInt(b_array[0]);		   
		   int bmm = Integer.parseInt(b_array[1]);		   
		   int byy = Integer.parseInt(b_array[2]);
   
		   if(cdd < bdd){
			   bmm+=1;
		   }
		   if(cmm < bmm){
			   byy+= 1;
		   }
		   int age = cyy-byy;
		   if(age<0){
			   System.out.println("Case #"+ (i+1)+":" + " Invalid birth date");
		   }else if(age > 130){
			   System.out.println("Case #"+ (i+1)+":" + " Check birth date");
		   }else{
			   System.out.println("Case #"+ (i+1)+ ": " + age);
		   }
		   
		    

            		  		   
		 
	  }
	 
	}
}