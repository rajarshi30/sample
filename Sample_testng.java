package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testngbasis{
webdriver driver;
@Beforemethod
public void setup()
{system.setproperty("webdriver.chrome.driver","C:/Users/RAJARSHI/Downloads/chromedr
iver_win32/chromedriver.exe");
driver=new Chromedriver()
driver.manage().timeouts().implicitlywait(20,timeunit.seconds);
driver.manage().window().maximize();
driver.mamage().deleteallcookies();
driver.get("http://www.freecrm.com");
}
@Test(priority=1)
public void verifypagetitletest()
{String title=driver.gettitle();
system.out.println("the page title is:" + title);
Assert.assertEquals(title,"#1 Free CRM software in the cloud");

@Test(priority=2)
public void verifylogogtest()
{boolean flag=driver.findelement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/div")).isDisplayed();
Assert.assertTRUE(flag);}

@Aftermethod
public void teardown()
{driver.quit();
}
