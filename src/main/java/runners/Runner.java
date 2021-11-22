package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue = "step_defs",
        tags = "@signUpTest",
        dryRun = false,
        plugin = {"json:target/report.json"}
)
public class Runner {

}
