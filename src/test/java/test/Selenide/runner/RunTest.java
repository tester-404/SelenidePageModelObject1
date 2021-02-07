package test.Selenide.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources"},
      glue = {"test/Selenide/steps"}, plugin = {"pretty"})
public class RunTest {
}
