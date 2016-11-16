import java.util.*;
import java.lang.*;
import java.io.*;

class digitCounting
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
          int t = sc.nextInt();
		  for(int i = 0; i<t; i++){
			  int num = sc.nextInt();
			  int a= 0,b =0,c=0,d = 0,e = 0,f = 0,g = 0,h = 0,k = 0,l = 0;
			  for(int j = 0; j<=num; j++){
					  int temp = j;					   
					  while(temp != 0){
						  int im = temp%10;
						    
						  if(im == 0){
							  a++;
						  }else if(im == 1){
							  b++;
						  }else if(im == 2){
							  c++;
						  }else if(im == 3){
							  d++;
						  }else if(im == 4){
							  e++;
						  }else if(im == 5){
							  f++;
						  }else if(im == 6){
							  g++;
						  }else if(im == 7){
							  h++;
						  }else if(im == 8){
							  k++;
						  }else{
							  l++;
						  }
						  temp = temp/10;
					  }
					  
					 
					  
			    }
				System.out.println(a + " " + b + " "+ c + " " + d + " "+e+" "+f+" " + g +" "+h+" "+k+" "+l );
			  }
			  
		  }
		 
	}
