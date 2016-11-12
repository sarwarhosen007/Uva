import java.util.*;
import java.lang.*;
import java.io.*;


class egypt
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
 
        while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int max = 0;
			if(a == 0 && b == 0 && c == 0){
				break;
			}
			if(a==b && a==c){
				System.out.println("wrong");
			}else{
				if(a>b && a>c){
					max = a;
					if(Math.pow(max,2) == (Math.pow(b,2)+(Math.pow(c,2)))){
					  System.out.println("right");
					}else{
						System.out.println("wrong");
					}
				}else if(b>a && b>c){
					max = b;
					if(Math.pow(max,2) == (Math.pow(a,2)+(Math.pow(c,2)))){
					  System.out.println("right");
					}else{
						System.out.println("wrong");
					}
					 
				}else{
					max = c;
					if(Math.pow(max,2) == (Math.pow(a,2)+(Math.pow(b,2)))){
					  System.out.println("right");
					}else{
						System.out.println("wrong");
					}
				}
				 
			}
			  		
		}
         
 	    
	}
}