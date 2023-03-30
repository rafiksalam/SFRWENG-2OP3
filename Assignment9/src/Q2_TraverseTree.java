/* Assignment 9 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (60 marks)
    * Inherit from BinTree.A2_BinaryTree to implement a subclass Q2_TraverseTree that implements
    * the following tree traversal subroutines
    * 1. Implement "void printPostorder(Node node)" to realize Postorder traversal. (20 marks)
    * 2. Implement "void printInorder(Node node)" to realize Inorder traversal. (20 marks)
    * 3. Implement "void printPreorder(Node node)" to realize Preorder traversal. (20 marks)
 */

import BinTree.*;

public class Q2_TraverseTree extends BinTree.A2_BinaryTree {

    Q2_TraverseTree(int key_of_root) {
        super(key_of_root);
    }

    // Given a binary tree, print its nodes according to the "bottom-up" postorder traversal.
    void printPostorder(Node node) {

        if (node.left == null & node.right == null) {
            System.out.println(node.key);
        }
        else {

            if (node.right != null) {
                printPostorder(node.right);
            }
            if (node.left != null) {
                printPostorder(node.left);
            }
            System.out.println(node.key);
        }
    }

    // Given a binary tree, print its nodes in inorder
    void printInorder(Node node) {

        if (node.left == null & node.right == null) {
            System.out.println(node.key);
        }
        else {
            if (node.left != null) {
                printInorder(node.left);
            }
            System.out.println(node.key);
            if (node.right != null) {
                printInorder(node.right);
            }
        }
    }

    // Given a binary tree, print its nodes in preorder
    void printPreorder(Node node) {

        if (node.left == null & node.right == null) {
            System.out.println(node.key);
        }
        else {
            System.out.println(node.key);
            if (node.left != null) {
                printPreorder(node.left);
            }
            if (node.right != null) {
                printPreorder(node.right);
            }
        }
    }

    public static void main(String[] args) {
        Q2_TraverseTree tree = new Q2_TraverseTree(50);
        tree.addChild(tree.root, new Node(30), true);
        tree.addChild(tree.root, new Node(70), false);
        tree.addChild(tree.root.left, new Node(20), true);
        tree.addChild(tree.root.left, new Node(40), false);
        tree.addChild(tree.root.right, new Node(60), true);
        tree.addChild(tree.root.right, new Node(80), false);
        tree.printTree();
        tree.deleteChild(tree.root.left, true);
        tree.printTree();

        System.out.println("printing tree in in-order ...");
        tree.printInorder(tree.root);
        System.out.println();

        System.out.println("printing tree in post-order ...");
        tree.printPostorder(tree.root);
        System.out.println();

        System.out.println("printing tree in pre-order ...");
        tree.printPreorder(tree.root);
        System.out.println();
    }
}
