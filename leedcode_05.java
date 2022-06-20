public class java_05 {

}

    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of('(', ')', '{', '}', '[', ']');
        Stack<Character> mp = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                mp.push(s.charAt(i));
            } else {
                if (mp.isEmpty() || s.charAt(i) != map.get(mp.peek())) {
                    return false;
                }
                mp.pop();
            }
        }
        return mp.isEmpty();
    }

}
__________________________________________________________________________________

public boolean isValid(String s) {
    Map<Character, Character> map = Map.of('(', ')', '{', '}', '[', ']');
    Stack<Character> mp = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
        if (map.containsKey(s.charAt(i))) {
            mp.push(s.charAt(i));
        } else {
            if (mp.isEmpty() || s.charAt(i) != map.get(mp.peek())) {
                return false;
            }
            mp.pop();
        }
    }
    return mp.isEmpty();     
}
            numbers.push(Integer.parseInt(tokens[i]));
        } else {
            int num2 = numbers.pop();
            int num1 = numbers.pop();
            switch (tokens[i]) {
                case "+":
                    numbers.push(num1 + num2);
                    break;

                case "-":
                    numbers.push(num1 - num2);
                    break;

                case "*":

                    numbers.push(num1 * num2);
                    break;

                case "/":
                    numbers.push(num1 / num2);
                    break;
            }

        }
    }
    return numbers.pop();
}
public class java_06 {
    
}

