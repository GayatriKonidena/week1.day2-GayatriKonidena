package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal=new Calculator();
		int sum=cal.addNumbers(2, 3, 4);
		System.out.println("Sum of three numbers is "+sum);
		
		int diff=cal.subNumbers(10, 3);
		System.out.println("Difference between two numbers is "+diff);
		
		double mul=cal.multiplication(6,7);
		System.out.println("Multiplication result is "+mul);
		
		float div=cal.division(12, 2);
		System.out.println("Division result is "+div);

	}

}
