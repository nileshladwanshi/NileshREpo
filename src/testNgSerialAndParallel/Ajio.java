package testNgSerialAndParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ajio {
  @Test
  public void ajio() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.ajio.com/");
  }
}
