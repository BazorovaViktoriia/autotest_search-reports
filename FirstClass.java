
import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class FirstClass {

        public static ChromeDriver driver;

        @BeforeClass
        public static void setup() {
            System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

        @Test
        public void discussionTest() {
            driver.get("http://www.tourism.ru/");
            WebElement input = driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td[1]/table[1]/tbody/tr[3]/td[1]"));
            input.click();
            driver.quit();

        }

        @AfterClass
        public static void tearDown() {
            driver.quit();
        }

    }

