package aStart;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class start extends CommonAPI {
   @Test
    public void astart(){
       driver.findElement(By.cssSelector("#navHomeLoans > span:nth-child(2)")).click();
       driver.findElement(By.cssSelector("#signIn")).click();
       driver.findElement(By.cssSelector("#navHomeLoans > span:nth-child(2)")).click();
       driver.findElement(By.cssSelector("#NAV_BUSINESS_INSTITUTIONS")).click();
       driver.findElement(By.cssSelector("#navSavings > span:nth-child(2)")).click();
       driver.findElement(By.cssSelector("div.product:nth-child(3) > div:nth-child(2) > picture:nth-child(1) > img:nth-child(3)")).click();
       driver.findElement(By.cssSelector("div.product:nth-child(4) > div:nth-child(2) > picture:nth-child(1) > img:nth-child(3)")).click();
       driver.findElement(By.cssSelector("#NAV_EN_ES")).click();
       driver.findElement(By.xpath("//*[@id=\"passcode1\"]")).click();
       driver.findElement(By.xpath("//*[@id=\"mortgages\"]")).click();
       driver.findElement(By.xpath("//*[@id=\"refinance\"]")).click();
       driver.findElement(By.xpath("//*[@id=\"homeEquity\"]")).click();
       driver.findElement(By.xpath("//*[@id=\"findAHome\"]")).click();
       driver.findElement(By.xpath("//*[@id=\"firstTimeHomeBuyer\"]")).click();
       driver.findElement(By.xpath("//*[@id=\"autoLoanRates\"]")).click();
       driver.findElement(By.xpath("//*[@id=\"autoApplyNow\"]")).click();
       driver.findElement(By.xpath("//*[@id=\"checkAutoStatus\"]")).click();
       driver.findElement(By.xpath("//*[@id=\"scheduleApptAutoLoans\"]")).click();
       driver.findElement(By.xpath("//*[@id=\"bmhCredit\"]/span")).click();
       driver.findElement(By.xpath("//*[@id=\"bmhDebt\"]/span")).click();
       driver.findElement(By.xpath("//*[@id=\"bmhSaving\"]/span")).click();
       driver.findElement(By.xpath("//*[@id=\"bmhHomeOwnership\"]/span")).click();
       driver.findElement(By.xpath("//*[@id=\"bmhAuto\"]")).click();
       driver.findElement(By.xpath("//*[@id=\"bmhAuto\"]/span")).click();
       driver.findElement(By.xpath("//*[@id=\"bmhRetirement\"]/span")).click();
      






   }
}
