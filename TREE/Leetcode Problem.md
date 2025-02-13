## Sum of Left Leaves

````java[]

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Main {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;  // Base case: if the root is null, no left leaves.

        int result = 0;

        // Check if the left child is a leaf node
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                result += root.left.val;  // Add the value of the left leaf
            } else {
                result += sumOfLeftLeaves(root.left);  // Recurse on the left subtree if it's not a leaf
            }
        }

        // Recurse on the right child, but we do not sum its leaves
        if (root.right != null) {
            result += sumOfLeftLeaves(root.right);
        }

        return result;  // Return the accumulated sum of left leaves
    }

    public static void main(String[] args) {
        // Example usage:
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Main solution = new Main();
        int sum = solution.sumOfLeftLeaves(root);
        System.out.println("Sum of left leaves: " + sum);  // Output should be 24 (9 + 15)
    }
}
````
