import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Gun01 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techno.study/");

        //  WebDriver driver1 =new EdgeDriver();
        //  driver1.get("https://www.techno.study/");
        //  WebDriver driver2 = new SafariDriver();
        //  driver2.get("https://www.techno.study/");


    }
}
