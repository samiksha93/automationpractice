package Day23_Broken_link;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Example2 extends SeleniumUtility {
	@Test
	public void Broken_link() {
		setUp("chrome", "https://demoqa.com/broken");
		List<WebElement> url = driver.findElements(By.tagName("a"));
		System.out.println(" a tag count :" + url.size());
		for (int i = 0; i <= url.size(); i++) {
			String url1 = url.get(i).getAttribute("href");
			verifylinks(url1);
		}
		driver.quit();
	}

	private void verifylinks(String linkUrl) {
		try {
		URL url =new URL(linkUrl);
		HttpURLConnection httpurlconnection = (HttpURLConnection)url.openConnection();
		httpurlconnection.setConnectTimeout(5000);
		httpurlconnection.connect();
		System.out.println("Get http response code :"+httpurlconnection.getResponseCode());
		 if(httpurlconnection.getResponseCode()>=400)
         {
         	System.out.println(linkUrl+" - "+httpurlconnection.getResponseMessage()+"is a broken link");
         }           
         //Fetching and Printing the response code obtained
         else{
             System.out.println(linkUrl+" - "+httpurlconnection.getResponseMessage());
         }
		}catch(Exception e){
			
		}
	}
}