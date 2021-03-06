package ru.real.selenium;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.JavascriptExecutor;


import java.io.File;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;


public class OrderTest {
    private static JavascriptExecutor js;
    private static WebDriver driver;
    private static Map<String, Object> vars;

    @Test
    public void test() throws InterruptedException {
        driver.get("https://cw68965.tmweb.ru/");
        driver.manage().window().setSize(new Dimension(1019, 1031));
        driver.findElement(By.cssSelector(".wp-block-columns:nth-child(1) > .wp-block-column:nth-child(4) .wp-block-button__link")).click();
        driver.findElement(By.cssSelector(".post-475 > .button")).click();

        Thread.sleep(500);

        driver.findElement(By.cssSelector(".cart-contents")).click();

        driver.findElement(By.cssSelector(".checkout-button")).click();

        driver.findElement(By.id("billing_first_name")).sendKeys("test");
        driver.findElement(By.id("billing_last_name")).sendKeys("test");
        driver.findElement(By.id("billing_address_1")).sendKeys("test");
        driver.findElement(By.id("billing_city")).sendKeys("test");
        driver.findElement(By.id("billing_state")).sendKeys("test");
        driver.findElement(By.id("billing_postcode")).sendKeys("123456");
        driver.findElement(By.id("billing_postcode")).sendKeys("123456");
        driver.findElement(By.id("billing_postcode")).sendKeys("123456");

        Thread.sleep(1000);

        driver.findElement(By.id("place_order")).click();

        Thread.sleep(5000);

    }

    @BeforeAll
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "src" + File.separator + "main" + File.separator + "resources" + File.separator +"chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
