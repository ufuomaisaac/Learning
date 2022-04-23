import java.util.Stack;

public class leetcode {
    public static void main(String[] args){
        String str = "}";
        boolean b = isValid1(str);
    }
    public  boolean isValid(String s) {
        if (s.length() % 2 != 0){
            return false;
        }
        char [] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char i : ch){
            if (i == '[' || i == '{' || i == '('){
                stack.push(i);
            } else if (i == ']' && !stack.empty() && stack.peek() == '['){
                stack.pop();
            } else if (i == '}' && !stack.empty() && stack.peek() == '{'){
                stack.pop();
            } else if (i == ')' && !stack.empty() && stack.peek() == '('){
                stack.pop();
            } else if (i == '}' || i == ']' || i == ')' && stack.empty()){
                return false;
            }
        }
        return stack.empty();
    }
    public static boolean isValid1(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch =='(' || ch == '[' || ch =='{'){
                st.push(ch);
            }
            else if(st.isEmpty()==true){
                return false;
            }
            else if(ch==')' && st.pop()!='('){
                return false;
            }
            else if(ch==']' && st.pop()!='['){
                return false;
            }
            else if(ch=='}' && st.pop()!='{'){
                return false;
            }
        }
        return st.isEmpty();
    }
}
