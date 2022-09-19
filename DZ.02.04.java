import java.util.Scanner;
public class Main {
    
public static void main(String[] args) throws Exception {
     Scanner sc = new Scanner(System.in);
     System.out.print("Введите значение: ");
     String st = sc.nextLine();
     if (st.isEmpty()){
         throw new Exception("Пустую строку вводить нельзя");
     }
}
    
}
