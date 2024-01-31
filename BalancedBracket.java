import java.util.Stack;

public class BalancedBracket {
   public static void main(String[] args) {
    String str = "()[]{";
    System.out.println(isBalanced(str));
   }
   
   public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();

                if (
                    (c == ')' && top == '(') ||  
                    (c == ']' && top == '[') ||
                    (c == '}' && top == '{')
                ) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
   }
}
