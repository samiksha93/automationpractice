package day11_CssAttribute_validation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XY_coordinate_assignment {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//to enter required application URL use get() 
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement first_name = driver.findElement(By.cssSelector("input[placeholder=\"First Name\"]"));
		Point FNPosition =first_name.getLocation();
		int FN_X_Cord =FNPosition.getX();
		int FN_Y_Cord =FNPosition.getY();
		System.out.println("First name x_cord: "+FN_X_Cord);
		System.out.println("First name y_cord: "+FN_Y_Cord);
		
		WebElement last_name = driver.findElement(By.cssSelector("input[placeholder=\"Last Name\"]"));
		Point LNPosition = last_name.getLocation();
		int LN_X_Cord =LNPosition.getX();
		int LN_Y_Cord =LNPosition.getY();
		System.out.println("Last name x_cord: "+LN_X_Cord);
		System.out.println("Last name y_cord: "+LN_Y_Cord);
		
		System.out.println("firstname field is right side to the last name field: "+(FN_X_Cord<LN_X_Cord));
		System.out.println("******************************************");
		
		WebElement address = driver.findElement(By.cssSelector("textarea[ng-model=\"Adress\"]"));
		Point addressPosition =address.getLocation();
		int address_X_Cord =addressPosition.getX();
		int address_Y_Cord =addressPosition.getY();
		
		WebElement email = driver.findElement(By.cssSelector("input[type=\"email\"]"));
		Point emailPosition =email.getLocation();
		int email_X_Cord =emailPosition.getX();
		int email_Y_Cord =emailPosition.getY();
		
		
		WebElement phone = driver.findElement(By.cssSelector("input[ng-model=\"Phone\"]"));
		Point phonePosition =phone.getLocation();
		int phone_X_Cord =phonePosition.getX();
		int phone_Y_Cord =phonePosition.getY();
		
		List<WebElement> gender = driver.findElements(By.cssSelector("input[name=\"radiooptions\"]"));
		
		WebElement hobbies_cricket = driver.findElement(By.id("checkbox1"));
		Point hobbies_cricketPosition =hobbies_cricket.getLocation();
		int hobbies_cricket_X_Cord =hobbies_cricketPosition.getX();
		int hobbies_cricket_Y_Cord =hobbies_cricketPosition.getY();
		
		
		WebElement hobbies_movies = driver.findElement(By.id("checkbox2"));
		Point hobbies_moviesPosition =hobbies_movies.getLocation();
		int hobbies_movies_X_Cord =hobbies_moviesPosition.getX();
		int hobbies_movies_Y_Cord =hobbies_moviesPosition.getY();
		
		WebElement hobbies_hockey = driver.findElement(By.id("checkbox3"));
		Point hobbies_hockeyPosition =hobbies_hockey.getLocation();
		int hobbies_hockey_X_Cord =hobbies_hockeyPosition.getX();
		int hobbies_hockey_Y_Cord =hobbies_hockeyPosition.getY();
		
		WebElement language = driver.findElement(By.id("msdd"));
		Point languagePosition =language.getLocation();
		int language_X_Cord =languagePosition.getX();
		int language_Y_Cord =languagePosition.getY();
		
		driver.close();
		
		
		
		
		
				
						
		

	}

}
