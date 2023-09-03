class Solution {
    public boolean isValid(String s) {
	Stack<Character> stack = new Stack<Character>();
	for (char c : s.toCharArray()) {
        if (c == '(' || c == '{' || c == '[') {
            stack.push(c);
        } else {
            if (stack.isEmpty() || !checkPair(stack.pop(),c)) {
                return false;
            }
        }
	}
	return stack.isEmpty();
    }
    public boolean checkPair(char popped, char c) {
        return (popped=='(' && c==')' || popped=='[' && c==']' || popped=='{' && c=='}');
    }
}
