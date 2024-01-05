package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\selenium project\\selenium project\\NewProject\\src\\test\\java\\feature", 
        glue = "stepdefinitions"
		)
public class Runner {

}
