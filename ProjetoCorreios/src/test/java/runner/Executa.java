package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "steps" , tags ="@tag" , dryRun = false,
monochrome = false , snippets = SnippetType.CAMELCASE , plugin = {"pretty","html:target/cucumber-report.html"}

)
public class Executa {

}
