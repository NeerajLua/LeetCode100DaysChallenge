class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
            stack.push(0);
            }
            else{
                    int innerScore = stack.pop();
                    int outerScore = stack.pop();
                    int newScore   = outerScore + Math.max( 2 * innerScore, 1);
                    stack.push(newScore);
                        }
                    }
                    return stack.pop();
                }
            }
        
