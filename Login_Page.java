package Page;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{
	WebDriver driver;
	public Login_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//button[contains(text(),'OK')]")
	WebElement ok;
	public void Ok_Button()
	{
		ok.click();
	}
	
	@FindBy (xpath="//a[contains(text(),' LOGIN ')]")
	WebElement lgn;
	public void Login_Button()
	{
		lgn.click();
	}
	
	@FindBy (xpath="//input[@id=\"9455790\"]")
	WebElement usn;
	public void UserName_TB()
	{
		usn.sendKeys("prassyvenkat");
	}
	
	@FindBy (xpath="//input[@id=\"4368940\"]")
	WebElement pas;
	public void Password_TB()
	{
		pas.sendKeys("Exception07");
	}
	
	@FindBy (xpath="//*[@id=\"nlpImgContainer\"]/div[11]/div/div/div/div/img")
	WebElement img;
	public void Captcha() throws IOException, InterruptedException
	{
	File src = img.getScreenshotAs(OutputType.FILE);
	String path ="C:\\Users\\Prasanna.V\\eclipse-workspace\\IRCTC\\Captcha_Image\\captcha.png";
	FileHandler.copy(src, new File(path));
	Thread.sleep(2000);
	}
}
