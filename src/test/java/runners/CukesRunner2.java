package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "step_definitions",
        features = "src/main/resources/features",
        tags = "@login",
        dryRun = false,
        plugin = "json:target/cucumber2.json"

)
public class CukesRunner2 {
}
