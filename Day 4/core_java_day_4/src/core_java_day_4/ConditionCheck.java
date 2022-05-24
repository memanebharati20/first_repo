package core_java_day_4;

public class ConditionCheck {
public static void main(String[] args) {
	int salary=20000;
		
	if(salary>80000) {
	 System.out.println("salary is greater than 80k");	
	}
	
	else if(salary>60000) {
		System.out.println("salary is greater than 60k");
	}
	
	else if(salary>40000) {
		System.out.println("slary greater than 40k");
	}
	else {
		System.out.println("your salary is too low");
	}
}
}
