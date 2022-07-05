package week3.Day2.Assignments;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Week 3 Day2 Assignment - sample Program for List
public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Driver and Browser Setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// 1. Launch the URL https://www.ajio.com/
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");

		// 2. In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		// 3. To the left of the screen under " Gender" click the "Men"
		driver.findElement(
				By.xpath("//label[contains(@class,'facet-linkname facet-linkname-genderfilter facet-linkname-Men')]"))
				.click();
		Thread.sleep(2000);

		// 4. Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[contains(@class,'Fashion Bags')]")).click();

		// 5. Print the count of the items Found.
		String itemsFound = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("The Count of The Items Found : " + itemsFound);

		// 6. Get the list of brand of the products displayed in the page and print the
		// list
		System.out.println(" *** The Brand Details in The Page *** ");
		List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println(" Total Number of the Brands in the Page : " + brand.size());

		// Add the List to Set to remove Duplicates
		Set<String> s = new HashSet<String>();
		for (WebElement loop : brand) {
			s.add(loop.getText());
		}

		System.out.println(" Total Number of Brands in the Page Without Duplicates : " + s.size());
		System.out.println(" The Brand Name Present in the Page : " + s);

		// 7. Get the list of names of the bags and print
		System.out.println(" *** The Bag Details in The Page *** ");
		List<WebElement> bagname = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println(" Total Number of the Bags in List : " + bagname.size());

		Set<String> s1 = new HashSet<String>();
		for (WebElement e : bagname) {
			s1.add(e.getText());
		}
		System.out.println(" Total Number of Bags in Set Without Duplicates : " + s1.size());
		System.out.println(" The Bag Names present in the Page : " + s1);
	}
}
