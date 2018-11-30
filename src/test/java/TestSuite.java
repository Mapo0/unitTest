import calculate.CalculateTest;
import methods.Methods;
import methods.MethodsTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Suite;

@RunWith(JUnitPlatform.class)
@Suite.SuiteClasses({CalculateTest.class , MethodsTest.class})
public class TestSuite {
}
