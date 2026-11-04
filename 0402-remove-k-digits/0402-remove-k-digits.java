class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for(char c : num.toCharArray()){
            while(k>0 && !stack.isEmpty() && stack.peek() > c){
                stack.pop();
                k--;
            }
            stack.push(c);
        }
         while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {
            ans.append(stack.remove(0));
        }

        int i = 0;

        while (i < ans.length() && ans.charAt(i) == '0') {
            i++;
        }

        String result = ans.substring(i);

        return result.isEmpty() ? "0" : result;
    
    }
}