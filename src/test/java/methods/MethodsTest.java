package methods;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {
   static String str1;
   static String str2;
   static String resstrs ;

    Methods methods=new Methods();
    @BeforeAll
    static void takeStr(){
        str1 = "sad";
        str2 = "boy";
        resstrs="sadboy";


    }
    @org.junit.jupiter.api.Test
    void notNull(){
        assertNotNull(methods.summStr(str1,str2),  "Проверка на null");
    }

    @org.junit.jupiter.api.Test
    void summStr()  {
        assertEquals(resstrs,methods.summStr(str1,str2));
    }

    @AfterAll
    static void end(){
        str1="";
        str2="";
        resstrs="";
    }

    @org.junit.jupiter.api.Test
    void factorial() {
        int factorial = methods.factorial();
        int result = 120;
        assertEquals(result,factorial);
    }
}