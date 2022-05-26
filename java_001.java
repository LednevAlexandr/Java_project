import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        System.out.print(pow());
    }
    public static double pow(){
        Scanner sr = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = sr.nextInt();
        System.out.println("Введите число b: ");
        int b = sr.nextInt();
        if (b == 0) return 1;
        if (b == 1) return a;
        if (b < 0){
            b = -b;
            a = 1/a;
        }
        double result = 1; 
        while (b > 0){
            if (b % 2 == 1){
                result *= a;
            }
            a = a*a;
            b = b / 2;
        }
        return result;
    }
}
