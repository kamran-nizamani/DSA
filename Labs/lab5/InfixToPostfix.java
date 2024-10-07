public class InfixToPostfix {

    
    private static int precedence(char ch) {
        if (ch == '+' || ch == '-') {
            return 1; // 
        } else if (ch == '*' || ch == '/') {
            return 2; 
        } else if (ch == '^') {
            return 3; 
        }
        return -1; 
    }

    
    public static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder(); 

        
        char[] stack = new char[expression.length()];
        int top = -1;  

        
        for (char c : expression.toCharArray()) {
            
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            
            else if (c == '(') {
                stack[++top] = c;  
            }
        
            else if (c == ')') {
                while (top != -1 && stack[top] != '(') {
                    result.append(stack[top--]);  
                }
                top--;  
            }
            
            else {
                
                while (top != -1 && precedence(c) <= precedence(stack[top])) {
                    result.append(stack[top--]); 
                }
                stack[++top] = c;  
            }
        }

        
        while (top != -1) {
            result.append(stack[top--]);  
        }

        return result.toString();
    }

    
    public static void main(String[] args) {
        String infixExpression = "A+B*C+D/H";  
        String postfixExpression = infixToPostfix(infixExpression);  
        System.out.println("Postfix expression: " + postfixExpression);  
    }
}
