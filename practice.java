import java.util.*;
import java.lang.*;
import java.io.*;


class practice
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
	  while(sc.hasNext()){
		  long f = sc.nextLong();
		  long l = sc.nextLong();
		  int c = 1;
		   
		   
		  if(f==l){
			  long s1 = f;
			 while(s1 != 1){
			   if(s1 % 2 ==0){
				   s1 = s1/2;
				   c++;

			   }else{
				   s1 = 3*s1 + 1;
				   c++;
			   }
		    }
			System.out.println(f + " " + l + " " + c);		   
		  }else{
			    long temp = f;
				int a = 1,t = 0;
                while(f != l){
					long ft = f;
					while(ft != 1){
						if(ft % 2 == 0){
						ft= ft/2;
						a++;
						}else{
							ft = 3*ft + 1;
							a++;
						}
					}
					System.out.println(a);
				 f++;
				}
				/* if(t<a){
					t = c;
				} */
				//System.out.println(temp + " " + l + " " + a);
		    }
 
	  
        }
	   
	 
	}
}