package methods;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {
    static String str1;
    static String str2;
    static String resstrs;

    Methods methods = new Methods();

    @BeforeAll
    static void takeStr() {
        str1 = "sad";
        str2 = "boy";
        resstrs = "sadboy";


    }

    @Test
    void notNull() {
        assertNotNull(methods.summStr(str1, str2));
    }

    @Test
    void empty() {
        assertFalse(str1.equals(""));
        assertFalse(str2.equals(""));

    }

    @Test
    void nonLatin() {
        String str = methods.summStr(str1, str2);
        assertTrue(str.matches("^[a-zA-Z0-9]+$"));
    }


    @Test
    void summStr() {
        assertEquals(resstrs, methods.summStr(str1, str2));
    }

    @Test
    void factorial() {
        int actional = methods.factorial();
        int result = 120;
        assertEquals(result, actional);
    }

    @Ignore
    //@Test
    void timeOut() {
       assertTimeout(Duration.ofMillis(2), () -> {
            methods.factorial();
        });
    }
}