package starter.steps;

import net.serenitybdd.annotations.Shared;

public class FirstLevelStep {

    @Shared
    private SecondLevelStep secondLevelStep;

    /**
     * Has NO step annotation -- will fail if exceptions happens in secondLevelStep
     */
    public void work(String a, String operator, String b) {
        secondLevelStep.doActualWork();
    }
}
