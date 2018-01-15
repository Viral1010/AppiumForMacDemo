Feature: Calculator Testcases

Scenario Outline: To Verify Addition with the Various data
		Given I am open Calculator app or clear date
		When I enter <firstNumber>
		And I click on Addition
		And I enter <secondNumber>
		Then <result> should be displayed


    Examples:
			| firstNumber  | secondNumber | result |
			| 12          | 10          | 22      |
            | -12         | 15          | 3       |
			| 12.10       | 10          | 22.1    |


Scenario Outline: To Verify subtract with the Various data
		Given I am open Calculator app or clear date
		When I enter <firstNumber>
		And I click on subtract
		And I enter <secondNumber>
		Then <result> should be displayed

    Examples:
			| firstNumber  | secondNumber | result |
			| 12           | 10          | 2    |



Scenario Outline: To Verify multiply with the Various data
		Given I am open Calculator app or clear date
		When I enter <firstNumber>
		And I click on multiply
		And I enter <secondNumber>
		Then <result> should be displayed

    Examples:
			| firstNumber  | secondNumber | result |
			| 5            | 3            | 15    |



Scenario Outline: To Verify devide with the Various data
		Given I am open Calculator app or clear date
		When I enter <firstNumber>
		And I click on devide
		And I enter <secondNumber>
		Then <result> should be displayed

    Examples:
			| firstNumber  | secondNumber | result |
			| 12           | 4            | 3    |
