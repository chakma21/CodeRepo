class Solution {
    public String decodeString(String s) {

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            // If it is not ']',
            // just put it into the stack
            if (c != ']') {
                stack.push(String.valueOf(c));
            }

            else {
                // Build the string inside [...]
                StringBuilder substr = new StringBuilder();

                while (!stack.peek().equals("[")) {
                    substr.insert(0, stack.pop());
                }

                // Remove '['
                stack.pop();

                // Get the number before '['
                StringBuilder k = new StringBuilder();

                while (!stack.isEmpty() &&
                       Character.isDigit(stack.peek().charAt(0))) {
                    k.insert(0, stack.pop());
                }

                // Repeat the substring k times
                int repeat = Integer.parseInt(k.toString());

                String repeated = substr.toString().repeat(repeat);

                // Put the decoded string back into stack
                stack.push(repeated);
            }
        }

        // Join everything in the stack
        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {
            ans.insert(0, stack.pop());
        }

        return ans.toString();
    }
}