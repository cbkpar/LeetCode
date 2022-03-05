class Solution {
    public boolean isValid(String s) {
        int sz = s.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < sz; i++) {
            if (stack.isEmpty()) {
                stack.add(s.charAt(i));
            } else {
                if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                    stack.add(s.charAt(i));
                }
                if (s.charAt(i) == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if (s.charAt(i) == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if (s.charAt(i) == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.size() == 0 ? true : false;
    }
}
