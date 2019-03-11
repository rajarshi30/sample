package jenkindemo;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
public class Jnkinsdemo {
 public static void main(String[] args) throws InterruptedException, BiffException, IOException {
Map<String, Object> prefs = new HashMap<String, Object>();
prefs.put("profile.default_content_setting_values.notifications",2);
System.setProperty("webdriver.chrome.driver","C:/Users/RAJARSHI/Downloads/chromedri
ver_win32/chromedriver.exe");
ChromeOptions options = new ChromeOptions();
options.addArguments("disable-infobars");
options.setExperimentalOption("prefs",prefs);
WebDriver driver = new ChromeDriver(options);
driver.navigate().to("http://www.amazon.com");
 Select s1 = new
Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
s1.selectByVisibleText("Computers");
//
//driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("sony
//vio");
//
driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click
();
//driver.quit();
Jnkinsdemo DT = new Jnkinsdemo();
DT.readexcel();
}
public void readexcel() throws BiffException,IOException
{String FilePath = "C:\\Users\\RAJARSHI\\Downloads\\INPUT DATA.xls";
FileInputStream fs = new FileInputStream(FilePath);
Workbook wb = Workbook.getWorkbook(fs);
Sheet sh = wb.getSheet("Sheet1");
int totalrows = sh.getRows();
int totalcols = sh.getColumns();
for (int row=0;row<totalrows;row++)
{for (int col=0;col<totalcols;col++)
{System.out.println(sh.getCell(col,row).getContents());
Map<String, Object> prefs = new HashMap<String, Object>();
System.setProperty("webdriver.chrome.driver","C:/Users/RAJARSHI/Downloads/chromedri
ver_win32/chromedriver.exe");
ChromeOptions options = new ChromeOptions();
options.addArguments("disable-infobars");
options.setExperimentalOption("prefs",prefs);
WebDriver driver = new ChromeDriver(options);
driver.navigate().to("http://www.amazon.com");
//driver.navigate().to("https://vindecoder.eu/nissan");
// //*[@id="searchBar"]/div/in
Select s1 = new
Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
s1.selectByVisibleText("Computers");
driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(sh.getCell(col,row).getContents());
driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click
();
//
driver.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[1]/input")).send
Keys("5N1AT2MK0EC806909");
//
driver.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[2]/button")).cli
ck();
driver.quit();
}
}}
}
