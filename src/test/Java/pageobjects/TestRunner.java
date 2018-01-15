package pageobjects;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(plugin = { "html:target/cucumber-html-report",
        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
         "junit:target/cucumber-results.xml" },
        features = { "./src/test/Java/resources" },
        glue = { "pageobjects" })
public class TestRunner {
}

