import java.util.Stack;

public class ValidParentheses {
    //     public boolean isValid(String s) {
//         boolean res = true;
//         char[] arr = s.toCharArray();
//         Stack<Character> st = new Stack();
//         for(char c: arr){
//             if(c=='('||c=='{'||c=='['){
//                 st.push(c);
//                 continue;
//             }
//             if(c==')'){
//                 if(st.isEmpty())return false;
//                 char tmp = st.pop();
//                 if(tmp=='('){
//                     continue;
//                 }else{
//                     return false;
//                 }
//             }
//             if(c==']'){
//                 if(st.isEmpty())return false;
//                 char tmp = st.pop();
//                 if(tmp=='['){
//                     continue;
//                 }else{
//                     return false;
//                 }
//             }
//             if(c=='}'){
//                 if(st.isEmpty())return false;
//                 char tmp = st.pop();
//                 if(tmp=='{'){
//                     continue;
//                 }else{
//                     return false;
//                 }
//             }

//         }
//         if(st.isEmpty())return res;
//         return false;

    //     }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c: s.toCharArray()){
            if(c=='(')stack.push(')');
            else if(c=='[')stack.push(']');
            else if(c=='{')stack.push('}');
            else if(stack.isEmpty()||c!=stack.pop())return false;
        }
        return stack.isEmpty();
    }
}
