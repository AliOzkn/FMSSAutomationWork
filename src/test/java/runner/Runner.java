package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:cucumber-report.html"},
        features = "src/test/resources",
        glue = "stepDefinitions",
        tags = ""
)
public class Runner {
}
