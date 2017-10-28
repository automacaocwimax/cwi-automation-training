package br.com.cwi.automation_training.tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", tags = "@treinamento",
	  glue = {""}, monochrome = true, dryRun = false)
public class treinamento {

}
