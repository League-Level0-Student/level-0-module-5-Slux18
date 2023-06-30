 package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {

	//GOAL: MAKE A CALCULATOR
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter a number");
		String input2 = JOptionPane.showInputDialog("Enter another number");
		int number1 = Integer.parseInt(input1);
		int number2 = Integer.parseInt(input2);
		int task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" }, null);

		// 3) Call the correct method depending on what option the user chooses
		//System.out.println(task);
		int result=0;
		if(task==3) {
			result=add(number1,number2);
		}
		else if(task==2) {
			result=subtract(number1,number2);
		}
		else if(task==1) {
			result=multiply(number1,number2);
		}else if(task==0) {
			result=divide(number1,number2);
		}
		String message=result(result);
		JOptionPane.showMessageDialog(null, message);
		//if(task==)
		// 4) Call the result() method and put the answer in a pop-up
	}
	
	// 1) Make 4 static methods (add, subtract, multiply, divide)
	//		They should each take 2 numbers as parameters
	//		and return the answer.
	 static int add(int v1,int v2) {
		 int sum =v1+v2;
				System.out.println(sum);
				return sum;
	 }
	 static int divide(int v1, int v2) {
		 int divide=v1/v2;
		 System.out.println(divide);
		 return divide;
	 }
	 static int subtract(int v1, int v2) {
		 int subtract=v1-v2;
		 System.out.println(subtract);
		 return subtract;
	 }
	 static int multiply(int v1, int v2) {
		 int multiply=v1*v2;
		 System.out.println(multiply);
		 return multiply;
	 }
	 static String result(int v1) {
		 return "your awnser is " + v1;
	 }
	
	// 2) Make a static method called " result" that takes a number
	//		as a parameter and returns the number in a string
	//		EX: "Your answer is " + number;

	
}
