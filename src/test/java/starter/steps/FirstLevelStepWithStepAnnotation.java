package starter.steps;

import net.serenitybdd.annotations.Shared;
import net.serenitybdd.annotations.Step;

public class FirstLevelStepWithStepAnnotation {

    @Shared
    private SecondLevelStepWithStepAnnotation secondLevelStepWithStepAnnotation;

    /**
     * Has step annotation -- will not fail if exceptions happens in secondLevelStep
     */
    @Step("Do work {0} {1} {2}")
    public void work(String a, String operator, String b) {
        secondLevelStepWithStepAnnotation.doActualWork();
    }
}
