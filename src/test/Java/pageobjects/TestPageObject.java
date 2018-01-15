package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestPageObject {


    String windowPath = "/AXApplication[@AXTitle='Calculator']/AXWindow[0]";
    String resultGroupPath = windowPath + "/AXGroup[0]";
    String basicGroupPath = windowPath + "/AXGroup[1]";
    String scientificGroupPath = windowPath + "/AXGroup[2]";
    String programmerGroupPath = windowPath + "/AXGroup[1]";
    String number_zero = basicGroupPath + "/AXButton[@AXDescription='zero']";
    String number_one = basicGroupPath + "/AXButton[@AXDescription='one']";
    String number_two = basicGroupPath + "/AXButton[@AXDescription='two']";
    String number_three = basicGroupPath + "/AXButton[@AXDescription='three']";
    String number_four = basicGroupPath + "/AXButton[@AXDescription='four']";
    String number_five = basicGroupPath + "/AXButton[@AXDescription='five']";
    String number_six = basicGroupPath + "/AXButton[@AXDescription='six']";
    String number_seven = basicGroupPath + "/AXButton[@AXDescription='seven']";
    String number_eight = basicGroupPath + "/AXButton[@AXDescription='eight']";
    String number_nine = basicGroupPath + "/AXButton[@AXDescription='nine']";


    String button_clear = basicGroupPath + "/AXButton[@AXDescription='clear']";
    String button_plus = basicGroupPath + "/AXButton[@AXDescription='add']";
    String button_equals = basicGroupPath + "/AXButton[@AXDescription='equals']";

    String button_negate = basicGroupPath + "/AXButton[@AXDescription='negate']";

    String button_delete = basicGroupPath + "/AXButton[@AXDescription='subtract']";

    String button_multiply = basicGroupPath + "/AXButton[@AXDescription='multiply']";

    String button_devide = basicGroupPath + "/AXButton[@AXDescription='divide']";
    String button_point = basicGroupPath + "/AXButton[@AXDescription='point']";


    String resultBox = resultGroupPath + "/AXStaticText[@AXDescription='main display']";


    public String numberToXpath(int number) {
        String numberXpath = null;
        switch (number) {
            case 0:
                return numberXpath = number_zero;

            case 1:
                return numberXpath = number_one;

            case 2:
                return numberXpath = number_two;

            case 3:
                return numberXpath = number_three;

            case 4:
                return numberXpath = number_four;

            case 5:
                return numberXpath = number_five;

            case 6:
                return numberXpath = number_six;

            case 7:
                return numberXpath = number_seven;

            case 8:
                return numberXpath = number_eight;

            case 9:
                return numberXpath = number_nine;

            case '+':

                return numberXpath = button_plus;

            case '-':
                return numberXpath = button_plus;


            case '*':
                return numberXpath = button_plus;


            case '/':
                return numberXpath = button_plus;

            case '=':
                return numberXpath = button_equals;


        }
        return numberXpath;
    }


    public void clickOnElement(String number, WebDriver driver) {


        char[] charArray = number.toCharArray();

        boolean bool = false;


        for (Character c : charArray) {


            if (Character.toString(c).contains("-")) {
                bool = true;


            } else if (Character.toString(c).contains(".")) {
                System.out.println("inside point");
                driver.findElement(By.xpath(button_point)).click();


            } else {

                driver.findElement(By.xpath(numberToXpath(Character.getNumericValue(c)))).click();
            }


        }


        if (bool) {
            driver.findElement(By.xpath(button_negate)).click();


        }


    }


    public void clickOnAddButton(WebDriver driver) {
        driver.findElement(By.xpath(button_plus)).click();
    }

    public void clickOnNegativeButton(WebDriver driver) {
        driver.findElement(By.xpath(button_plus)).click();
    }


    public void clickOnEqualButton(WebDriver driver) {
        driver.findElement(By.xpath(button_equals)).click();
    }

    public void clickOnDeleteButton(WebDriver driver) {
        driver.findElement(By.xpath(button_delete)).click();
    }

    public void clickOnMultiplyButton(WebDriver driver) {
        driver.findElement(By.xpath(button_multiply)).click();
    }

    public void clickOnDevideButton(WebDriver driver) {
        driver.findElement(By.xpath(button_devide)).click();
    }



    public String getResult(WebDriver driver) {
        return driver.findElement(By.xpath(resultBox)).getText();
    }

}
