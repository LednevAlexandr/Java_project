import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		double a = PrintNum();
		System.out.println(a);
	}
	public static float PrintNum(){
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Введите дробное число: ");
                float num = in.nextFloat();
                return num;
            } catch(RuntimeException e) {
                        Scanner in = new Scanner(System.in);
                        System.out.print("Введите дробное число: ");
                        float num = in.nextFloat();
                        return num;
                    }
                }
                
	}
	
