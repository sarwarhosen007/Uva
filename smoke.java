import java.util.*;
import java.lang.*;
import java.io.*;

class smoke
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		 while(sc.hasNext()){
			 int n = sc.nextInt();
			 int k = sc.nextInt();
			 int c =0;
			 int t = n;			  
			 while(n >= k){
				 n = (n-k)+1;
				 c++;
			 }
			 System.out.println(t+c);
		 }
	}
}