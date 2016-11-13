import java.util.*;
import java.lang.*;
import java.io.*;

class arithmatic
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			long n1 = sc.nextLong();
			long n2 = sc.nextLong();
			if(n1 == 0 && n2 == 0){
				break;
			}
			 
			int c = 0,left = 0;
			while(n1 != 0 || n2 != 0){
				int n1t = (int)n1%10;
				int n2t = (int)n2%10;
				int t = n1t + n2t + left;
				if(t > 9){
					c++;
				 left = t/10;
				  
				  
				}else{
					left = 0;
				}
				n1 = n1/10;
				n2 = n2/10;
			}
			  if(c > 1){
				System.out.println(c + " carry operations.");
			}else if(c == 1){
				System.out.println("1 carry operation.");
				 
			}else{
				System.out.println("No carry operation.");
			}  
		}
	}
}