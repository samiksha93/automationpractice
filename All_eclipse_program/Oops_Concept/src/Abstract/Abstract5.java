package Abstract;

abstract class RBIBank {
	abstract double getRateOfInterestForHomeLoan();
	final void loan() {
		System.out.println("As per RBI loan..");
	}
}
class SBI101 extends RBIBank {
	double getRateOfInterestForHomeLoan() {
		return 6.45;
	}
}
class PNB extends RBIBank {
	double getRateOfInterestForHomeLoan() {
		return 7.5;
	}
}
public class Abstract5 {

	public static void main(String[] args) {
		SBI101 objcet1= new SBI101();
		System.out.println(objcet1.getRateOfInterestForHomeLoan());
		objcet1.loan();
		
		PNB object2 = new PNB();
		System.out.println(object2.getRateOfInterestForHomeLoan());
		object2.loan();
		
		RBIBank b1 = new SBI101();
		System.out.println("RBI reference but object of SBI, Rate of Interest is: " + b1.getRateOfInterestForHomeLoan() + " %");
		b1.loan();
		
		RBIBank b2 = new PNB();
		System.out.println("RBI reference but object of PNB, Rate of Interest is: " + b2.getRateOfInterestForHomeLoan() + " %");
		b2.loan();
	}

}
