package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jay
 */
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(linkText = "Computers")
    WebElement computersLink;

    @FindBy(linkText = "Electronics")
    WebElement electronicsLink;

    @FindBy(linkText = "Apparel")
    WebElement apparelLink;

    @FindBy(linkText = "Digital downloads")
    WebElement digitalDownloadsLink;

    @FindBy(linkText = "Books")
    WebElement booksLink;

    @FindBy(linkText = "Jewelry")
    WebElement jewelryLink;

    @FindBy(linkText = "Gift Cards")
    WebElement giftCardLink;

    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink;


    public void mouseHoverOnComputerLink() {
        mouseHoverToElement(computersLink);
        log.info("MouseHover on Computer link : " + computersLink.toString());

    }

    public void clickOnComputerLink() {
        clickOnElement(computersLink);
        log.info("Clicking on Computer link : " + computersLink.toString());
    }

    public void clickOnElectronics() {
        clickOnElement(electronicsLink);
        log.info("Clicking on Electronics link : " + electronicsLink.toString());
    }

    public void clickOnApparel() {
        clickOnElement(apparelLink);
        log.info("Clicking on Apparel link : " + apparelLink.toString());
    }

    public void clickOnDigitalDownloads() {
        clickOnElement(digitalDownloadsLink);
        log.info("Clicking on DigitalDownloads link : " + digitalDownloadsLink.toString());
    }

    public void clickOnBooks() {
        clickOnElement(booksLink);
        log.info("Clicking on Books link : " + booksLink.toString());
    }

    public void clickOnJewelry() {
        clickOnElement(jewelryLink);
        log.info("Clicking on Jewelry link : " + jewelryLink.toString());
    }

    public void clickOnGiftCards() {
        clickOnElement(giftCardLink);
        log.info("Clicking on GiftCards link : " + giftCardLink.toString());
    }


    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Clicking on Register link : " + registerLink.toString());
    }
}
