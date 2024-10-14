package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Shared;
import net.serenitybdd.screenplay.Actor;
import starter.steps.FirstLevelStepWithStepAnnotation;

public class SearchStepDefinitionsWithAnnotations {

    @Shared
    private FirstLevelStepWithStepAnnotation firstLevelStepWithStepAnnotation;

    @Given("{actor} not failing, with @Step annotation")
    public void justStepsWithAnnotation(Actor actor) {
        firstLevelStepWithStepAnnotation.work("a", "operator2", "something something");
    }
}
