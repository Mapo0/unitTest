package calculate;

import com.sun.org.apache.xpath.internal.operations.Operation;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateTest {
//    @Mock
//    private Calculate calculate;

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
//    @Test
//    void  getIntOperation(){
//        Calculate getOperation = new getOperation('+',"сложение");
//        Mockito.when(calculate.getOperation('+')).thenReturn(true);
//        Assert.assertEquals(expected, actual);
//    }

}