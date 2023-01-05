package Property_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Example1 {

	public static void main(String[] args) throws IOException {
//property file location using absolute path 
//		String filelocation ="C:\\Users\\netware\\Desktop\\Collection_in_java\\property\\Propfile.properties";
//property fie location using relative path "." represent current working directory
//		String filelocation=".\\property\\Propfile.properties";
// using system.property
//		String filelocation=System.getProperty("user.dir")+".\\property\\Propfile.properties";
//		FileInputStream fls= new FileInputStream(filelocation );
		FileInputStream fls= new FileInputStream(".\\property\\Propfile.properties" );
		Properties prop=new Properties();
		prop.load(fls);
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("Age"));
		System.out.println(prop.getProperty("status"));
		System.out.println(prop.getProperty("height"));
		System.out.println(prop.getProperty("color"));
		prop.setProperty("surname", "rajpoot");
		prop.setProperty("hair", "black");
		System.out.println(prop.getProperty("surname"));
		System.out.println("hair");
		FileOutputStream fls1 =new FileOutputStream(".\\property\\Propfile.properties");
		prop.store(fls1, "add surname");
		fls1.flush();
		fls.close();
		System.out.println("*************closed*******************");
		
				

	}

}
