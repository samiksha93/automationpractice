package Wrapper_class;

public class Boxing {

	public static void main(String[] args) {
		int age=25;
		System.out.println("age : "+age);
		Integer age1=age;// autoboxing  convert integer type to object //implicit boxing
		System.out.println("age1 : "+age1);
		Integer obj1= new Integer(age); // explicit boxing 
		System.out.println("obj1 : "+obj1);
		
		char char1= 'a';
		Character char2 = char1; //implicit boxing 
		Character char4 = new Character(char1); //explicit boxing
		System.out.println(char1+"  "+char2+"  "+char4);
		
		System.out.println(char1==char4); // True 
	
	}

}
