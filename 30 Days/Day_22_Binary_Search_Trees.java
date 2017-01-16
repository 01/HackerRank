/**************DAY 22: Binary Search Trees *****************/
/*https://www.hackerrank.com/challenges/30-binary-search-trees*/

public static int getHeight(Node root) {
        // Write your code here
        if (root == null) {
            return -1;
        }
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }