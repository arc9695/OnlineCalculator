package Assessment;

import com.sun.jdi.Value;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

public class Calculator {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/");
        driver.manage().window().maximize();
                                    //MULTIPLICATION

        driver.findElement(By.xpath("//span[text()='4']")).click();
        driver.findElement(By.xpath("//span[text()='2']")).click();
        driver.findElement(By.xpath("//span[text()='3']")).click();
        driver.findElement(By.xpath("//span[text()='×']")).click();
        driver.findElement(By.xpath("//span[text()='5']")).click();
        driver.findElement(By.xpath("//span[text()='2']")).click();
        driver.findElement(By.xpath("//span[text()='5']")).click();
        driver.findElement(By.xpath("//span[text()='=']")).click();



         //DIVISION

        driver.findElement(By.xpath("//span[text()='AC']")).click();
       driver.findElement(By.xpath("//span[text()='4']")).click();
       driver.findElement(By.xpath("//span[text()='0']")).click();
       driver.findElement(By.xpath("//span[text()='0']")).click();
       driver.findElement(By.xpath("//span[text()='0']")).click();
       driver.findElement(By.xpath("//span[text()='/']")).click();
       driver.findElement(By.xpath("//span[text()='2']")).click();
       driver.findElement(By.xpath("//span[text()='0']")).click();
       driver.findElement(By.xpath("//span[text()='0']")).click();
       driver.findElement(By.xpath("//span[text()='=']")).click();

        //ADDITION



        driver.findElement(By.xpath("//span[text()='AC']")).click();
        driver.findElement(By.xpath("//Span[text()='±']")).click();
        driver.findElement(By.xpath("//span[text()='2']")).click();
        driver.findElement(By.xpath("//span[text()='3']")).click();
        driver.findElement(By.xpath("//span[text()='4']")).click();
        driver.findElement(By.xpath("//span[text()='2']")).click();
        driver.findElement(By.xpath("//span[text()='3']")).click();
        driver.findElement(By.xpath("//span[text()='4']")).click();
        driver.findElement(By.xpath("//span[text()='+']")).click();
        driver.findElement(By.xpath("//span[text()='3']")).click();
        driver.findElement(By.xpath("//span[text()='4']")).click();
        driver.findElement(By.xpath("//span[text()='5']")).click();
        driver.findElement(By.xpath("//span[text()='3']")).click();
        driver.findElement(By.xpath("//span[text()='4']")).click();
        driver.findElement(By.xpath("//span[text()='5']")).click();
        driver.findElement(By.xpath("//span[text()='=']")).click();


        //SUBTRACTION


        driver.findElement(By.xpath("//span[text()='AC']")).click();
        driver.findElement(By.xpath("//span[text()='2']")).click();
        driver.findElement(By.xpath("//span[text()='3']")).click();
        driver.findElement(By.xpath("//span[text()='4']")).click();
        driver.findElement(By.xpath("//span[text()='8']")).click();
        driver.findElement(By.xpath("//span[text()='2']")).click();
        driver.findElement(By.xpath("//span[text()='3']")).click();

        driver.findElement(By.xpath("//span[text()='–']")).click();
        driver.findElement(By.xpath("//span[text()='±']")).click();
        driver.findElement(By.xpath("//span[text()='2']")).click();
        driver.findElement(By.xpath("//span[text()='3']")).click();
        driver.findElement(By.xpath("//span[text()='0']")).click();
        driver.findElement(By.xpath("//span[text()='9']")).click();
        driver.findElement(By.xpath("//span[text()='4']")).click();
        driver.findElement(By.xpath("//span[text()='8']")).click();
        driver.findElement(By.xpath("//span[text()='2']")).click();
        driver.findElement(By.xpath("//span[text()='3']")).click();

        String res1 = driver.findElement(By.xpath("//div[@id='scihistory']/div[1]")).getText();
        System.out.println("ADDITION-"+res1);
        String res2 = driver.findElement(By.xpath("//div[@id='scihistory']/div[2]")).getText();
        System.out.println("DIVISION-"+res2);
        String res3 = driver.findElement(By.xpath("//div[@id='scihistory']/div[3]")).getText();
        System.out.println("MULTIPLICATION-"+res3);
        String res4 =driver.findElement(By.id("sciOutPut")).getText();
        System.out.println("SUTRACTION ="+res4);







    }

}
