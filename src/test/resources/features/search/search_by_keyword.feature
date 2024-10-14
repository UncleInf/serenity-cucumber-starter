Feature: Search by keyword

  Scenario: tests fail, but marked success
    Given Sergey not failing, with @Step annotation

  Scenario: tests fail, marked failed
    Given Sergey is failing
