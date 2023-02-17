package try_catch;

public class try_catch3 {

	public static void main(String[] args) {
		try {
			// below code do not throw any exception
			int data = 25 / 0;
			System.out.println(data);
		}
		// catch won't be executed becoz this exception is airthematic exception not arrayindexoutofboundexception
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled...");
		}
		catch (ArithmeticException e) {
			System.out.println("arithematic exception is:" +e);
		}
		// executed regardless of exception occurred or not
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
		

		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException is:");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("task 2 completed");
		} catch (Exception e) {
			System.out.println("common task completed");
		
		System.out.println("rest of the code...");
	}
		try {
			int a[] = new int[5];
			a[5] = 30 / 2;//
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");
		String s=null;
		try {  
				System.out.println(s.length());}
		catch (Exception e){
			System.out.println("null point exception:"+e);
		}
				
				
	}
}
