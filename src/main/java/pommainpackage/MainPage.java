package pommainpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private WebDriver driver;
    private By personalAccount = By.xpath("//p[text()='Личный Кабинет']");
    private By buttonEnterMainPage = By.xpath("//button[text()='Войти в аккаунт']");
    private By textMainPage = By.xpath("//h1[text()='Соберите бургер']");
    private By bunsLink = By.xpath("//span[contains(text(), 'Булки')]");
    private By saucesLink = By.xpath("//span[contains(text(), 'Соусы')]");
    private By fillingsLink = By.xpath("//span[contains(text(), 'Начинки')]");
    private By bunsText = By.xpath("//h2[contains(text(), 'Булки')]");
    private By saucesText = By.xpath("//h2[contains(text(), 'Соусы')]");
    private By fillingsText = By.xpath("//h2[contains(text(), 'Начинки')]");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickPersonalAccount() {
        driver.findElement(personalAccount).click();
    }
    public void clickBunsLink() {
        driver.findElement(bunsLink).click();
    }
    public void clickSaucesLink() {
        driver.findElement(saucesLink).click();
    }
    public void clickFillingsLink() {
        driver.findElement(fillingsLink).click();
    }
    public void checkVisibilityBunsText() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Булки')]")));
        assert driver.findElement(bunsText).isDisplayed();
    }
    public void checkVisibilitySaucesText() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Соусы')]")));
        assert driver.findElement(saucesText).isDisplayed();
    }
    public void checkVisibilityFillingsText() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Начинки')]")));
        assert driver.findElement(fillingsText).isDisplayed();
    }
    public void clickButtonEnterMainPage() {
        driver.findElement(buttonEnterMainPage).click();
    }
    public void checkVisibilityTextMainPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Соберите бургер']")));
        assert driver.findElement(textMainPage).isDisplayed();
    }

}
