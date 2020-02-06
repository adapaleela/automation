package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"E:\\testing\\selenium\\automationchallege.com\\src\\test\\resources\\feature\\automationchallenge.feature"},
				snippets= SnippetType.UNDERSCORE,
				glue= {"classpath:glue"},
				tags= {"@tag4"},
				plugin= {"pretty","html:target\\result4"})
public class Test4 
{
	
}
