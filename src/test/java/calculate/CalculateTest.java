package calculate;

import javafx.scene.layout.Priority;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateTest {

    Calculate calculate = new Calculate();
    @Test
    void multiplication() {
        int result =calculate.calculate(2,0,'*') ;
        assertEquals(result, 0);
    }

    @Ignore
    void division() {
        int result =calculate.calculate(2,0,'/') ;
        assertEquals(result, 0);
    }

    @Test
    void add() {
        int result =calculate.calculate(2,4,'+') ;
        assertEquals(result, 6);
    }

    @Test
    void subtraction() {
        int result =calculate.calculate(5,3,'-') ;
        assertEquals(result, 2);
    }


}