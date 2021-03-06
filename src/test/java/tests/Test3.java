package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"E:\\testing\\selenium\\automationchallege.com\\src\\test\\resources\\feature\\automationchallenge.feature"},
				snippets= SnippetType.UNDERSCORE,
				glue= {"classpath:glue"},
				tags= {"@tag3"},
				plugin= {"pretty","html:target\\result3"})
public class Test3 
{

}
