package day6;
import java.util.*;
public class logicalprogram {
public static void main(String args[]){  
	long number, sum=0;  
	Scanner sc=new Scanner(System.in);         
	System.out.print("Enter the number: ");  
	number=sc.nextLong(); 
	sc.close();
	int i=1;  
	while(i <= number/2)  
	{  
	if(number % i == 0)  
	{  
	sum = sum + i;  
	}  
	i++;  
	}   
	if(sum==number)  
	{    
	System.out.println(number+" is a perfect number.");  
	} 
	else   
	System.out.println(number+" is not a perfect number.");   
	}  
	}  
		


