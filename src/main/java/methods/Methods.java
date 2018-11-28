package methods;

public class Methods {
    public String summStr (){
        String str1 = "asd";
        String str2 = "vac";
        str1 += str2;
       return str1;
    }
    public int factorial (){
        int a=1;
        for (int i=1 ; i<=5; i++){
           a=a*i;
        }
        return a;
    }

}
