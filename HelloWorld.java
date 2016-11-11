import java.util.*;
import java.lang.*;
import java.io.*;


class HelloWorld 
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
        int k = 1;
        while(sc.hasNext()){			 
			int m = sc.nextInt();
			if(m < 0){
				break;
			}
			int n = 1;
			int  c = 0,t = 0;
            while(n > 0){
				t = n;
				if(t == m){
					break;
				}else if(t > m){
					break;
				}else{
					n = n + t;
					c++;
				}
 			}
		    System.out.println("Case "+(k++) +": "+ c);
            
		}
		  	  
  
	}
}