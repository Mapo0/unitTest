package methods;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {

    @org.junit.jupiter.api.Test
    void summStr()  {
        Methods methods=new Methods();
        String summstr= methods.summStr();
        String resstr = "asdvac";
        assertEquals(resstr,summstr);
    }

    @org.junit.jupiter.api.Test
    void factorial() {
        Methods methods=new Methods();
        int factorial = methods.factorial();
        int result = 120;
        assertEquals(result,factorial);
    }
}