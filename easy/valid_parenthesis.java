class Solution 
{
public boolean isValid(String s)
{
if (s.length() % 2 != 0) 
{
    return false; // Early return for odd-length strings
}

    Stack<Character> stack = new Stack<>();

    for (char ch : s.toCharArray()) {
        if (ch == '(' || ch == '{' || ch == '[') {
            stack.push(ch); // Push opening bracket onto stack
        } else if (stack.isEmpty()) {
            return false; // No matching opening bracket found
        } else if (ch == ')' && stack.peek() != '(' ||
                   ch == '}' && stack.peek() != '{' ||
                   ch == ']' && stack.peek() != '[') {
            return false; // Mismatched closing bracket
        } else {
            stack.pop(); // Pop matching opening bracket
        }
    }

    return stack.isEmpty(); // Valid if stack is empty at the end
}
}