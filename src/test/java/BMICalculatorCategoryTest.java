import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;

public class BMICalculatorCategoryTest extends BaseTest {

    @Test
    public void checkNormalCategoryTest(){

        driver.get("https://healthunify.com/bmicalculator/");
        WebElement weightInput = driver.findElement(By.name("wg"));
        weightInput.sendKeys("60");
        WebElement heightInput = driver.findElement(By.name("ht"));
        heightInput.sendKeys("170");
        WebElement calculateButton = driver.findElement(By.name("cc"));
        calculateButton.click();
        WebElement categoryInput = driver.findElement(By.name("desc"));
        String actualCategory = categoryInput.getAttribute("value");
        assertEquals(actualCategory, "Your category is Normal", "Category should be normal");
        WebElement siInput = driver.findElement(By.name("si"));
        String actualSI = siInput.getAttribute("value");
        String expectedSI = "20.76";
        assertEquals(actualSI, expectedSI, "SI should be " + expectedSI);
    }
    @Test
    public void checkStarvationCategoryTest(){
        driver.get("https://healthunify.com/bmicalculator/");
        WebElement weightInput = driver.findElement(By.name("wg"));
        weightInput.sendKeys("50");
        WebElement heightInput = driver.findElement(By.name("ht"));
        heightInput.sendKeys("200");
        WebElement calculateButton = driver.findElement(By.name("cc"));
        calculateButton.click();
        WebElement categoryInput = driver.findElement(By.name("desc"));
        String actualCategory = categoryInput.getAttribute("value");
        assertEquals(actualCategory, "Your category is Starvation", "Category should be Starvation");
        WebElement siInput = driver.findElement(By.name("si"));
        String actualSI = siInput.getAttribute("value");
        String expectedSI = "12.5";
        assertEquals(actualSI, expectedSI, "SI should be " + expectedSI);
    }
    @Test
    public void checkUnderweightCategoryTest(){
        driver.get("https://healthunify.com/bmicalculator/");
        WebElement weightInput = driver.findElement(By.name("wg"));
        weightInput.sendKeys("61");
        WebElement heightInput = driver.findElement(By.name("ht"));
        heightInput.sendKeys("200");
        WebElement calculateButton = driver.findElement(By.name("cc"));
        calculateButton.click();
        WebElement categoryInput = driver.findElement(By.name("desc"));
        String actualCategory = categoryInput.getAttribute("value");
        assertEquals(actualCategory, "Your category is Underweight", "Category should be Underweight");
        WebElement siInput = driver.findElement(By.name("si"));
        String actualSI = siInput.getAttribute("value");
        String expectedSI = "15.25";
        assertEquals(actualSI, expectedSI, "SI should be " + expectedSI);
    }
    @Test
    public void checkOverweightCategoryTest(){
        driver.get("https://healthunify.com/bmicalculator/");
        WebElement weightInput = driver.findElement(By.name("wg"));
        weightInput.sendKeys("85");
        WebElement heightInput = driver.findElement(By.name("ht"));
        heightInput.sendKeys("180");
        WebElement calculateButton = driver.findElement(By.name("cc"));
        calculateButton.click();
        WebElement categoryInput = driver.findElement(By.name("desc"));
        String actualCategory = categoryInput.getAttribute("value");
        assertEquals(actualCategory, "Your category is Overweight", "Category should be Overweight");
        WebElement siInput = driver.findElement(By.name("si"));
        String actualSI = siInput.getAttribute("value");
        String expectedSI = "26.23";
        assertEquals(actualSI, expectedSI, "SI should be " + expectedSI);
    }

    @Test
    public void checkObeseCategoryTest(){
        driver.get("https://healthunify.com/bmicalculator/");
        WebElement weightInput = driver.findElement(By.name("wg"));
        weightInput.sendKeys("100");
        WebElement heightInput = driver.findElement(By.name("ht"));
        heightInput.sendKeys("180");
        WebElement calculateButton = driver.findElement(By.name("cc"));
        calculateButton.click();
        WebElement categoryInput = driver.findElement(By.name("desc"));
        String actualCategory = categoryInput.getAttribute("value");
        assertEquals(actualCategory, "Your category is Obese", "Category should be Obese");
        WebElement siInput = driver.findElement(By.name("si"));
        String actualSI = siInput.getAttribute("value");
        String expectedSI = "30.86";
        assertEquals(actualSI, expectedSI, "SI should be " + expectedSI);
    }
}
