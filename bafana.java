import java.util.*;
import java.lang.*;
import java.io.*;


class bafana
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
	    for(int k = 1; k<=t; k++){
			 int n = sc.nextInt();
			 int f = sc.nextInt();
			 int m = sc.nextInt();
			 
			 if(m==n){
				 System.out.println("Case " + k +": "+ f);	
			 }else if(m>n){
				 int temp = m%n;
				 if(temp == 0){				 
				  System.out.println("Case " + k +": "+ f);				  
				 }else if(temp < f){
					 int t2 = temp+f;
					 if(t2>n){
						 System.out.println("Case " + k +": "+ (t2-n));						 
					 }else{
						System.out.println("Case " + k +": "+ t2);						  
					 }
				 }
				 else{
					 int t3 = temp+f;
					 if(t3>n){
						System.out.println("Case " + k +": "+ (t3-n));  
					 }else{
						System.out.println("Case " + k +": "+ t3); 
					 }
					   
				 } 
			 }else{
				 int t1 = n-m;
				 if(t1<f){
					System.out.println("Case " + k +": "+ (f-t1));					
				 }else if(t1>f){
					System.out.println("Case " + k +": "+ (n-t1+f)); 
				 }
				 else{
					System.out.println("Case " + k +": "+ (n));   
				 }
			 }
			 
			  
		}
 
         
 	    
	}
}