/**
 * prog
 */
public class prog {

    public static void main(String[] args) {
        System.out.println(zipp("aafff"));
    }
    public static String zipp(String input) {
        String res = "";
        int count = 1; 
        for(int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i-1)) {
                count += 1;
            }
            else {
                String cnt = Integer.toString(count);
                res += input.charAt(i-1) + cnt;
    
                count = 1;
            }
        }
        res += input.charAt(input.length()-1) + Integer.toString(count);
        return res;
    }
}