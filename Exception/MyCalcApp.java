/*2) define your exception class by name "MyArithException"
(MyArithException.java)
define class "Calculator"   (Calculator.java)
In this class define a function,which will accept an int and return double of it.
e.g int caldouble(int)
This function will check an int which is passed to it
It will throw exception if 0 is passed or negative passed
in case of 0 caller of this method should get error message
"Zero not allowed" 
in case of negative caller of this method should get error message
"negative not allowed"
In case of positive value it should simply return the double value.

Now define class "MyCalcApp" (MyCalcApp.java)
In this class you accept a number from user and pass that no. to
caldouble() method which is mentioned above.*/
package Assignment;

import java.util.Scanner;

class MyArithException extends Exception {
	MyArithException(String string) {
		super(string);
	}
}

class Calculator {
	int caldouble(int Val) throws MyArithException {
		if (Val < 0) {
			throw new MyArithException("negative not allowed");
		} else if (Val == 0) {
			throw new MyArithException("Zero not allowed");
		} else {
			return Val * Val;
		}
	}
}

public class MyCalcApp {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("Enter the Number for Square");
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		try {
			System.out.println(c.caldouble(N));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
