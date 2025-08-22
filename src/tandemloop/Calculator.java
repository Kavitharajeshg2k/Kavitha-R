package tandemloop;

import java.util.Scanner;

class CalculatorOp {
	    double a;
	    double b;
	    String operation;

	    
	    CalculatorOp(double a, double b, String operation) {
	        this.a = a;
	        this.b = b;
	        this.operation = operation;
	    }

	   
	    public double calculate() {
	        switch (operation) {
	            case "add":
	                return a + b;
	            case "sub":
	                return a - b;
	            case "mul":
	                return a * b;
	            case "div":
	                if (b != 0)
	                    return a / b;
	                else {
	                    System.out.println(" Divide by zero!");
	                    return 0;
	                }
	            default:
	                System.out.println("Wrong operation!");
	                return 0;
	        }
	    }
	}

	public class Calculator {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	      
	        System.out.print("Enter first number: ");
	        double a = sc.nextDouble();

	        System.out.print("Enter second number: ");
	        double b = sc.nextDouble();

	        System.out.print("Enter operation : ");
	        String operation = sc.next();  
	        
	        CalculatorOp calc = new CalculatorOp(a, b, operation);

	        
	        double result = calc.calculate();

	     
	        System.out.println("Result: " + result);

	    }
	}




         
