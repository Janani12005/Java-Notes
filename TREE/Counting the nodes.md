## Implementation of counting and sum of the nodes in the Binary tree

````java[]

class TreeNodes{
    int value;
    TreeNodes left;
    TreeNodes right;
    TreeNodes (int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
class BinaryTree{
    TreeNodes root;
    public int countNodes(TreeNodes node){
        if(node==null){
            return 0 ;
        }
        return 1+countNodes(node.left)+ countNodes(node.right);
    }
}
public class Main{
    public static void main(String[]args){
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNodes(1);
        tree.root.left = new TreeNodes(2);
        tree.root.right= new TreeNodes(3);
        tree.root.left.left = new TreeNodes(4);
        tree.root.left.right = new TreeNodes(5);
         int nodeCount = tree.countNodes(tree.root);
         System.out.println("No : nodes :" + nodeCount);
    }
}

````
