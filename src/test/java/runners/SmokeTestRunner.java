package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "step_definitions",
        features = "src/main/resources/features",
        tags = "@smoke",
        dryRun = false,
        plugin = "json:target/cucumber3.json"
)
public class SmokeTestRunner {
}
