package Runner;




import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Vinay Hatti\\eclipse-workspace\\CompendiumdevTask2\\src\\test\\resources\\Feature\\Contacts.feature",
        glue="Steps"

)
public class Runner {
}
