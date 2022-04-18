package testrunners;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = {
        "src/test/java/features/search.feature", "src/test/java/features/searchShoes.feature" }, glue = {"steps", "steps2"})
 
public class CucumberRunnerTest {
 
}