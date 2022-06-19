

public class zad_004 {
    public static void main(String[] args) {
        System.out.println(polind("abaa"));
    }
    
    public static boolean polind(String s) {
        //1) Напишите метод, который принимает на вход строку (String) и определяет является 
        //ли строка палиндромом (возвращает boolean значение)
        for (int i = 0;i < s.length()/2;++i){
            if (s.charAt(i) != s.charAt((s.length()-1)-i)) {
                return false;
            }
            
        }
        return true;
    }
}
