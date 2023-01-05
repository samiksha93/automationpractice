package Day18_TestNG;

import org.testng.annotations.Test;

public class TestNG_example1 {
		  @Test(priority=1)
		  public void logintest() {
			  System.out.println("Hii this is login test"); }
		  @Test(priority=2)
		  public void createtaask() {
			  System.out.println("Hii this is createtask test");
		  }
		  @Test(priority=3)
		  public void logout() {
			  System.out.println("hii this is logout test");
		  }
		  public class Sample1 {
				int age=25;
				void display() {
					System.out.println("I am display...");
				}
		@Test
		 public void testCase1() {
			 System.out.println("I am test case1....");
			System.out.println("age: "+age);
		display();
			  }
			}
  }

