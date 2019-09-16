/*3)create a package called "course"
In this package create three classes
a) Dac    with methods  term1()  and term2()
b) PreDac with  method  cet()
c) Basic   with method  finalTest()

Now write application called  "VitaApp" in which call all the methods  of the above mentioned classes.*/

package Assignment;

class Course {

}

class Dac extends Course {
	void term1() {
		System.out.println("Prepare For DAC term 1 Exam by October");
	}

	void term2() {
		System.out.println("Prepare For DAC term 2 Exam by October");
	}
}

class PreDac extends Course {
	void cet() {
		System.out.println("Prepare For PreDac CET by December");
	}
}

class Basic extends Course {
	void FinalTest() {
		System.out.println("Prepare For Final Test Exam of BASIC");
	}
}

public class VitaApp {
	public static void Perform(Course ref) {
		if (ref instanceof Dac) {
			Dac dac = (Dac) ref;
			dac.term1();
			dac.term2();
		}
		if (ref instanceof PreDac) {
			PreDac Pdac = (PreDac) ref;
			Pdac.cet();

		}
		if (ref instanceof Basic) {
			Basic base = (Basic) ref;
			base.FinalTest();

		}
	}

	public static void main(String[] args) {
		Perform(new Dac());
		Perform(new PreDac());
		Perform(new Basic());
	}

}
