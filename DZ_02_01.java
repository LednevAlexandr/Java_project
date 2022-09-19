import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		double a = PrintNum();
		System.out.println(a);
	}
	public static double PrintNum(){
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Введите дробное число: ");
                double num = in.nextDouble();
                return num;
            } catch(InputMismatchException e) {
                    Scanner in = new Scanner(System.in);
                    System.out.print("Введите дробное число: ");
                    double num = in.nextDouble();
                    return num;
                }
                
	}
	
}
