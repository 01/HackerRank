/**************DAY 23: BST Level-Order Traversal  *****************/
/*https://www.hackerrank.com/challenges/30-binary-trees*/

public class Solution {
    static void levelOrder(Node root) {
        // Write your code here
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node head = queue.poll();

            if (head == null) {
                continue;
            }

            System.out.print(head.data + " ");
            queue.offer(head.left);
            queue.offer(head.right);
        }
        
        System.out.println();
    }