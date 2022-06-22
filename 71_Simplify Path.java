class Solution {

	public static String simplifyPath(String path){
	String[] sim = path.split("/"); 
        Stack<String> stack = new Stack<>();
        Stack<String> stack1 = new Stack<>();
        for (int i = 0; i < sim.length;i++){
            if (sim[i].equals(" ") || sim[i].equals(".")) continue;
            else if (sim[i].equals("..")){
                if (!stack.empty()){
                    stack.pop();
                }
            }
            else stack.push(sim[i]);

        }
        if (stack.empty()) return "/";
        while(!stack.empty()){
            stack1.push(stack.pop());
        }
        String s = "/";
        while(!stack1.empty()){
  
            s = s+stack1.pop();
        }
        return s;
}
}
