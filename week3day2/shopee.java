package week3.day2;


import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class shopee {

    public static void main(String[] args) {
        // Setup Chrome browser
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);



           // Open automationexercise portal
            driver.get("https://automationexercise.com/");
            driver.manage().window().maximize();
            //click on the product
            driver.findElement(By.xpath("//a[@href='/products']")).click();
            driver.get("https://automationexercise.com/category_products/6");

            // ---------- LIST ALL BRANDS ----------
            System.out.println("----- List of Brands -----");
            List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brands_products']//a"));
            for (WebElement brand : brands) {
                String brandName = brand.getText().trim();
                System.out.println(brandName);
            }

            // ---------- LIST ALL MEN'S JEANS PRODUCTS ----------
            System.out.println("\n----- List of Men's Jeans Products -----");
            List<WebElement> products = driver.findElements(By.xpath("//div[@class='productinfo text-center']/p"));
            for (WebElement product : products) {
                System.out.println(product.getText());
            }
            
            
    }
    
}

           