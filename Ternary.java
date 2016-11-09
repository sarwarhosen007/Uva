import java.util.*;
import java.lang.*;
import java.io.*;


class Ternary
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
		long n = sc.nextLong();
		if(n < 0){
			break;
		}
		if(n == 0){
		System.out.print(n);		
		}
		String s = "";
        while(n != 0){
			Long temp = n%3;
			s = s + Long.toString(temp);
			n = n/3;
		} 
		String reverse = new StringBuffer(s).reverse().toString();
        System.out.println(reverse); 
		}
	 
	}
}