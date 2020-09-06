package com.RunnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(	plugin = {"pretty"},
					glue = {"com.StepDefinition"},
					features = "src/test/resources/features")

public class TestRunner_Class {

}
