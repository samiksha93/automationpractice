package Object_class;
class Samiksha {
	int a=10;
	static void print(){
		System.out.println("Hii I'm samiksha method");
	}
	void Compare() {
		System.out.println("Hii this is compare non static method");	
	}
	public int hashCode() {
		return 1001;
	}
	public boolean equals(Object obj) {//Object obj=p2=new Print();//auto up casting
		Samiksha p=(Samiksha)obj;//explicit downcasting
		return (this.a==p.a);
			  //10 == 10
	}	
}
class Ashish{
	
	 void print() {
		System.out.println("Hii I'm Ashish method");
	}
	 public String toString()
	    {
	        return "BasicCoreJava";
	    }
	 
}
public class to_String_hashcode {

	public static void main(String[] args) {
		Samiksha.print();
		Ashish A=new Ashish();
		A.print();
		System.out.println("***********************************");
		System.out.println("This is toString() method body of class A"+A.toString());
		System.out.println("This is hashCode() method body of class A"+A.hashCode());
		System.err.println("this is ERROR message");
		Samiksha S= new Samiksha();
		S.Compare();
		System.out.println("***********************************");
		System.out.println(S.toString());
		System.out.println(S.hashCode());
		System.out.println("***********************************");
		Samiksha S1= new Samiksha();
		
		System.out.println(S.equals(S1));
		Samiksha S2=S1;
		System.out.println(S1.equals(S2));
		}

}
