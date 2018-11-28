package methods;

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
        assertNotNull(methods.summStr(str1,str2));
    }

    @org.junit.jupiter.api.Test
    void empty(){
        assertFalse(str1.equals(""));
        assertFalse(str2.equals(""));

    }
    @org.junit.jupiter.api.Test
    void nonLatin(){
        String str = methods.summStr(str1,str2);
        assertTrue(str.matches("^[a-zA-Z0-9]+$"));
    }



    @org.junit.jupiter.api.Test
    void summStr()  {
        assertEquals(resstrs,methods.summStr(str1,str2));
    }

    @org.junit.jupiter.api.Test
    void factorial() {
        int factorial = methods.factorial();
        int result = 120;
        assertEquals(result,factorial);
    }
}