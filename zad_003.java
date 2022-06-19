import java.util.Arrays;
public class zad_003 {
    public static void main(String[] args) {
        defangIPaddr("10.10.10");
 }
public static void defangIPaddr(String address) {
    String new_address = address.replace(".","[.]");
    System.out.println(new_address);
                }
    }
