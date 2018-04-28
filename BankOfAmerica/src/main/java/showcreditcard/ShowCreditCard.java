package showcreditcard;

import base.CommonAPI;
import org.openqa.selenium.By;

public class ShowCreditCard extends CommonAPI {
    public void showCreditCards(){
        // driver.findElement(By.cssSelector(".title")).click();
        driver.findElement(By.xpath("//*[@id='navSavings']/span[2]")).click();
    }
}
