package com.simplilearn.calculator;

import java.util.Scanner;

public class ArithmaticCal {
	
	public static void main(String []args){
        int a,b,operation;
        float result=0;
        
        Scanner sc=new Scanner(System.in); 
         
        System.out.print("Enter first number: ");
        a=sc.nextInt();
        System.out.print("Enter second number: ");
        b=sc.nextInt();
        System.out.print("\n1: Addition.\n2: Subtraction.");
        System.out.print("\n3: Multiplication.\n4: Division.");
        
         
        System.out.print("\nOperation : ");
        operation=sc.nextInt();
         
        switch(operation)
        {
            case 1:
                result=(a+b); 
                break;
            case 2:
                result=(a-b); 
                break;
            case 3:
                result=(a*b); 
                break;
            case 4:
                result=(a/b); break;
            
            default:
                System.out.println("An Invalid operation!!!\n");
        }
        if(operation>=1 && operation<=4)
           System.out.println("Result is: " + result);
         
    }

}
