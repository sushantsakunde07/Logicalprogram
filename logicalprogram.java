package day6;
import java.util.*;
public class logicalprogram {
public static void main(String args[]){  
	 int n1=0,n2=1,n3,i,count=0;   
	 Scanner scan =new Scanner(System.in);
     System.out.println("Enter a number till Fibonacci Series");
	 count =scan.nextInt();
	 scan.close();
	 System.out.print(n1+" "+n2); 
	 for(i=2;i<count;++i) 
	 {  
	  n3=n1+n2;  
	  System.out.print(" "+n3);  
	  n1=n2;  
	  n2=n3;  
	 }  
}}
		


