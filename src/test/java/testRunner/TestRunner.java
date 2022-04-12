package testRunner;
        import io.cucumber.junit.Cucumber;
        import io.cucumber.junit.CucumberOptions;
        import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty" ,"html:target/cucumber"},
        features="src/test/resources/Features/YoutubeVideo.feature",
        glue={"stepDefinations"}
        //monochrome = true
)
public class TestRunner {
}
