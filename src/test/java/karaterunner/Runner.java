package karaterunner;
import com.intuit.karate.junit5.Karate;

public class Runner {
    @Karate.Test
    Karate testsample()
    {
        return Karate.run("BDDtest").relativeTo(getClass());
    }
}

