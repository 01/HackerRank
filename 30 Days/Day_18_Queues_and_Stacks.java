public class Solution {
     
        Queue<Character> queue = new LinkedList<>();
        Deque<Character> stack = new ArrayDeque<>();
        
        public void pushCharacter(char ch) {
            stack.push(ch);
        }
        
        public char popCharacter() {
            return stack.pop();
        }
        
        public void enqueueCharacter(char ch) {
            queue.add(ch);
        }
        
        public char dequeueCharacter() {
            return queue.remove();
        }
    