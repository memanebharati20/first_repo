package core_java_day_4;

public class IfElseStatment {
public static void main(String[] args) {
	int num1=60;
	int num2=10;
	//if else
	if(num1>50) {
		System.out.println("num1 is greater than 50");
	}
	else {
		System.out.println("else part of statement");
	}
	// nested if else
	if(num1>50){
		// nested if block
		if(num2>20){
			System.out.println("inner if block");
		}else {
			System.out.println("inner else block");
		}
	}else {
		System.out.println("outer else block");
	}
	
	
	// if else 
	
	
}
}
