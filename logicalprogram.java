package day6;
import java.util.*;
public class logicalprogram {
public static void main(String args[]){  
	 int m=0,flag=0;      
	 int n=0;
	 System.out.println("Enter a number");
	 Scanner sc= new Scanner(System.in);
	 n=sc.nextInt();
	 sc.close();   
	 m=n/2;      
	 if(n==0||n==1)
     {  
	  System.out.println(n+" is not prime number");      
	  }
	 else{  
	 for(int i=2;i<=m;i++){      
	 if(n%i==0){      
	     System.out.println(n+" is not prime number");      
	     flag=1;      
	     break;      
	     }      
	     }      
	 if(flag==0)  { System.out.println(n+" is prime number"); }  
} 
}    
}   
		


