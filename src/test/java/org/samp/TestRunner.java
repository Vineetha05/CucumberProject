package org.samp;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Vineetha Official\\New Pkg\\Cucumber\\src\\main\\resources\\signin.feature",
glue= {"com.step"},plugin= {"json:\\src\\test\\resources\\Report\\facebook.json"})

public class TestRunner {

	
}
