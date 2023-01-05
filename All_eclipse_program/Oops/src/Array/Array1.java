	package Array;

public class Array1 {

	public static void main(String[] args) {

//		String[] cars;      	// datatype[] arrayname;  //declare array
//		cars=new String[4];    //  intialzation of array
		// or
//		String[] cars=new String[4]; // decleration and intialzation
		
//		cars[0]="Volvo";
//		cars[1]="BMW";
//		cars[2]="Ford";
//		cars[3]="Mazda";
		// or
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" }; 
		// Access the Elements of an Array
		System.out.println(cars[0]);//Volvo
		
		// Change an Array Element
		cars[0] = "Opel";
		System.out.println(cars[0]);//Opel
		// array element count
		System.out.println(cars.length);//4
		System.out.println("*********Normal for-loop***********");
		// iterate array elements using for loop
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		System.out.println("**************for-each loop*******************");
		// iterate array elements using for-each loop
		
//		for(datatype variable : array)
		
		for (String i : cars) {
			  System.out.println(i);
			}

	}

}
