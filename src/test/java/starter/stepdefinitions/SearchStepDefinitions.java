package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Shared;
import net.serenitybdd.screenplay.Actor;
import starter.steps.FirstLevelStep;

public class SearchStepDefinitions {

    @Shared
    FirstLevelStep firstLevelStep;

    @Given("{actor} is failing")
    public void justSteps(Actor actor) {
        firstLevelStep.work("b", "operator2222", "something something1");
    }
}
