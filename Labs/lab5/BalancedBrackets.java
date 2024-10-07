public class BalancedBrackets {

    public static void main(String[] args) {
        String input = "[{(a+b]+c}-1)";

        if (isBalanced(input)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }

    public static boolean isBalanced(String expression) {
    
        char[] stack = new char[expression.length()];
        int top = -1; 

    
        for (char ch : expression.toCharArray()) {

            
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch;  
            }
            
            
            else if (ch == ')' || ch == '}' || ch == ']') {
                
                if (top == -1 || !matches(stack[top--], ch)) {
                    return false;
                }
            }
        }


        return top == -1;
    }

    
    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
