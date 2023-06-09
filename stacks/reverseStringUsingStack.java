import java.io.*;
import java.util.*;
 class Sol {
   
       
       
        String s = sc.next();
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        s = "";
        while(!st.empty()){
            s+= (st.pop());
        }
        System.out.println(s);
       
        // Time Complexity: O(N)  Only one traversal to push and pop so O(n)+O(n)==O(n).
// Auxiliary Space: O(N) Extra for Stack.
       
    
}

/* Java program to reverse
String using Stack */


// stack
class Stack {
	int size;
	int top;
	char[] a;

	// function to check if stack is empty
	boolean isEmpty() { return (top < 0); }

	Stack(int n)
	{
		top = -1;
		size = n;
		a = new char[size];
	}

	// function to push element in Stack
	boolean push(char x)
	{
		if (top >= size) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a[++top] = x;
			return true;
		}
	}

	// function to pop element from stack
	char pop()
	{
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			char x = a[top--];
			return x;
		}
	}
}

// Driver code
class Main {
	// function to reverse the string
	public static void reverse(StringBuffer str)
	{
		// Create a stack of capacity
		// equal to length of string
		int n = str.length();
		Stack obj = new Stack(n);

		// Push all characters of string
		// to stack
		int i;
		for (i = 0; i < n; i++)
			obj.push(str.charAt(i));

		// Pop all characters of string
		// and put them back to str
		for (i = 0; i < n; i++) {
			char ch = obj.pop();
			str.setCharAt(i, ch);
		}
	}

	// driver function
	public static void main(String args[])
	{
		// create a new string
		StringBuffer s = new StringBuffer("GeeksQuiz");

		// call reverse method
		reverse(s);

		// print the reversed string
		System.out.println("Reversed string is " + s);
	}
}
