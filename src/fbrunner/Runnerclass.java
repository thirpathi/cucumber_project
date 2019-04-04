package fbrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "fbfolder"  , glue = "stepDefinations")
 



public class Runnerclass {

}
