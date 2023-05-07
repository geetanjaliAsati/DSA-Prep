import java.io.*;
import java.util.*;
public class Main {
    static boolean match(char a, char b){
        if(a=='(' && b==')'){
            return true;
        }
        if(a=='[' && b==']'){
            return true;
        }
        if(a=='{' && b=='}'){
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<Character>();
        int flag = 1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }
            else{
                if(st.empty()){
                    flag = 0;
                    break;
                }
                else if(match(st.peek(),s.charAt(i))){
                    st.pop();
                }
                else{
                    flag = 0;
                    break;
                }
            }
        }
        if(!st.empty()){
            flag = 0;
        }
        System.out.println(flag);
        
    }
}

public boolean isValid(String s) {
	Stack<Character> stack = new Stack<Character>();
	for (char c : s.toCharArray()) {
		if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
	}
	return stack.isEmpty();
}