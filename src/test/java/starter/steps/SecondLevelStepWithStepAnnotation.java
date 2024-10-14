package starter.steps;

import net.serenitybdd.annotations.Step;

public class SecondLevelStepWithStepAnnotation {

    @Step("Do actual Work")
    public void doActualWork() {
        throw new RuntimeException("ohh neu");
    }
}
