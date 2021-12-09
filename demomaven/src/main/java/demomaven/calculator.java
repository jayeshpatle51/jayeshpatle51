package demomaven;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.AppUtils;

public class calculator  extends AppUtils  {

	
	    
		@Test(priority=0)
		public static void multiplication() throws InterruptedException
		{
			
		driver.findElement(By.xpath("//td[2]/div/div[2]/span[1]")).click();
		driver.findElement(By.xpath("//td[2]/div/div[3]/span[2]")).click();
		driver.findElement(By.xpath("//td[2]/div/div[3]/span[3]")).click();
		driver.findElement(By.xpath("//td[2]/div/div[3]/span[4]")).click();
		driver.findElement(By.xpath("//td[2]/div/div[2]/span[2]")).click();
		driver.findElement(By.xpath("//td[2]/div/div[3]/span[2]")).click();
		driver.findElement(By.xpath("//td[2]/div/div[2]/span[2]")).click();
		driver.findElement(By.xpath("//td[2]/div/div[5]/span[4]")).click();
		String output=driver.findElement(By.id("sciOutPut")).getText();
		System.out.println(output);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//td[2]/div/div[5]/span[3]")).click();
		}
		
		@Test(priority=1)
		public static void division() throws InterruptedException 
		{
			
			driver.findElement(By.xpath("//td[2]/div/div[2]/span[1]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[4]/span[1]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[4]/span[1]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[4]/span[1]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[4]/span[4]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[3]/span[2]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[4]/span[1]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[4]/span[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//td[2]/div/div[5]/span[3]")).click();
			
		}
		@Test(priority=2)
		public static void Addition() throws InterruptedException
		{
			driver.findElement(By.xpath("//td[2]/div/div[2]/span[4]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[3]/span[2]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[3]/span[3]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[2]/span[1]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[3]/span[2]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[3]/span[3]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[2]/span[1]")).click();//-234234 345345
			driver.findElement(By.xpath("//td[2]/div/div[1]/span[4]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[3]/span[3]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[2]/span[1]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[2]/span[2]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[3]/span[3]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[2]/span[1]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[2]/span[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//td[2]/div/div[5]/span[3]")).click();
			
		}
		@Test(priority=3)
		public static void Subtraction() throws InterruptedException
		{
			
			driver.findElement(By.xpath("//td[2]/div/div[3]/span[2]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[3]/span[3]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[2]/span[1]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[1]/span[2]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[3]/span[2]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[3]/span[3]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[2]/span[4]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[2]/span[4]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[3]/span[2]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[3]/span[3]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[4]/span[1]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[1]/span[3]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[2]/span[1]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[1]/span[2]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[3]/span[2]")).click();
			driver.findElement(By.xpath("//td[2]/div/div[3]/span[3]")).click();
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//td[2]/div/div[5]/span[3]")).click();  //234823 -23094823


		}

	}


