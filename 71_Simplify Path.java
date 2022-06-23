class Solution {
    public String simplifyPath(String path) {        
        String[] arr = path.split("/");
        Stack<String> st= new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].length()>0)
            {
                if(arr[i].equals(".."))
                {
                    if(st.size()>0)
                        st.pop();
                }
                else if(arr[i].equals("."))
                    continue;
                else
                    st.push(arr[i]);
            }
        }
        String res="";
        while(!st.isEmpty())
        {
            if(st.size()==1)
               res=st.pop()+res;
            else
                res="/"+st.pop()+res;
        }           
        return "/"+res;      
    }
}
