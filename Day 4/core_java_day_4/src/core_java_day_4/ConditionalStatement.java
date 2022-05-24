package core_java_day_4;

public class ConditionalStatement {
public static void main(String[] args) {
	int num1=1;
	int num2=2;
	int num3=40;
	// if statement
    if(num1>10) {
    	System.out.println("number is greater than 10");
    }
    
    // multiple condition
    if(num1>10 && num2>20 ) {
    	System.out.println("num1 is greater than 10 and num2 is greater than 20 ");
    }
    
    
    if(num1>10 && num2>20 && num3>30 ) {
    	System.out.println("all number greater");
    }
    
   
    if(num1>10 || num2>20 || num3>30 ) {
    	System.out.println("or block of code");
    }
    
    // combition of and or operator
    if(num1>10 && num2>20 || num3>30 ) {
    	System.out.println("or block of code");
    }
    
    
}
}
