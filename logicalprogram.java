package day6;
import java.util.*;
public class logicalprogram {
public static void main(String args[]){  
	int number = 0, reverse = 0;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number");
	number=sc.nextInt();
	sc.close();
	while(number != 0)   
	{  
	int remainder = number % 10;  
	reverse = reverse * 10 + remainder;  
	number = number/10;  
	}  
	System.out.println("The reverse of the given number is: " + reverse);  
	}  
	}  
		


