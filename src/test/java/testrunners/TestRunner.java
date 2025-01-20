package testrunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.util.stream.Stream;

//@RunWith(Cucumber.class)
//
@CucumberOptions(features = "src/test/resources/feature",
        glue = {},
        plugin = {"pretty", "html:target/cucumber/report.html"})
public class TestRunner {
    static String[] defaultOptions = {"--glue", "src/test/java/stepdefinations"};

    public static void main(String[] args) {
        Stream<String> cucumberOptions = Stream.concat(Stream.of(defaultOptions), Stream.of(args));
        io.cucumber.core.cli.Main.main(cucumberOptions.toArray(String[]::new));
    }
}

