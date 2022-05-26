import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        com(2,10,2,2,"");
    }
    public static void com(int a, int b, int c, int d, String s){
        if (a > b) return;
        if (a == b) {
            System.out.println(s+"k1");
            return;
        }
        com(a+c,b,c,d,s+"k1");
        com(a*d,b,c,d,s+"k2");
    }
}
   
