class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String nums : tokens) {

            if (!nums.equals("+") &&
                !nums.equals("-") &&
                !nums.equals("*") &&
                !nums.equals("/")) {

                stack.push(Integer.parseInt(nums));
            }

            else {

                int b = stack.pop();
                int a = stack.pop();

                switch (nums) {

                    case "+":
                        stack.push(a + b);
                        break;

                    case "-":
                        stack.push(a - b);
                        break;

                    case "*":
                        stack.push(a * b);
                        break;

                    case "/":
                        stack.push(a / b);
                        break;
                }
            }
        }

        return stack.pop();
    }
}