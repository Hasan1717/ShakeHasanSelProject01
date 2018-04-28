package aStart;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class test extends CommonAPI {
    @Test
    public void newTest(){
        driver.findElement(By.xpath("//*[@id='navSavings']/span[2]")).click();
    }
}
