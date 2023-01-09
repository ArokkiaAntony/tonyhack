package org.WebTable;

import java.time.Duration;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> allrows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < allrows.size(); i++) {
			WebElement currentrow = allrows.get(i);
			List<WebElement> currentrowcells = currentrow.findElements(By.tagName("td"));
			if (currentrowcells.size() > 0) {
				WebElement firstcell = currentrowcells.get(0);
				String companyname = firstcell.getText();
				if (companyname.equals("Magazzini Alimentari Riuniti")) {
					String contact = currentrowcells.get(1).getText();
					String country = currentrowcells.get(2).getText();
					System.out.println(contact);
					System.out.println(country);
				}

			}

		}
	}

}
