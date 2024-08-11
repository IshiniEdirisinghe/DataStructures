package BinaryTree;

class Node {
 int value;
 Node left, right;

 public Node(int value) {
     this.value = value;
     left = right = null;
 }
}

public class BinaryTree {
 Node root;

 public BinaryTree() {
     root = null;
 }

 public void insert(int value) {
     root = insertRec(root, value);
 }

 //insert a new node
 private Node insertRec(Node root, int value) {
     if (root == null) {
         root = new Node(value);
         return root;
     }

     if (value < root.value)
         root.left = insertRec(root.left, value);
     else if (value > root.value)
         root.right = insertRec(root.right, value);

     return root;
 }

 public void delete(int value) {
     root = deleteRec(root, value);
 }

 //delete a node
 private Node deleteRec(Node root, int value) {
     if (root == null) return root;

     if (value < root.value)
         root.left = deleteRec(root.left, value);
     else if (value > root.value)
         root.right = deleteRec(root.right, value);
     else {
         if (root.left == null)
             return root.right;
         else if (root.right == null)
             return root.left;

         root.value = minValue(root.right);

 
         root.right = deleteRec(root.right, root.value);
     }

     return root;
 }

 //find the minimum node
 private int minValue(Node root) {
     int minValue = root.value;
     while (root.left != null) {
         minValue = root.left.value;
         root = root.left;
     }
     return minValue;
 }


 public void inorder() {
     inorderRec(root);
 }


 private void inorderRec(Node root) {
     if (root != null) {
         inorderRec(root.left);
         System.out.print(root.value + " ");
         inorderRec(root.right);
     }
 }


 public static void main(String[] args) {
     BinaryTree tree = new BinaryTree();

     //insert elements 
     tree.insert(50);
     tree.insert(30);
     tree.insert(20);
     tree.insert(40);
     tree.insert(70);
     tree.insert(60);
     tree.insert(80);

     
     System.out.println("Inorder traversal:");
     tree.inorder();
     System.out.println();

     //delete nodes
     tree.delete(20);
     System.out.println("Inorder traversal after deleting 20:");
     tree.inorder();
     System.out.println();


     tree.delete(30);
     System.out.println("Inorder traversal after deleting 30:");
     tree.inorder();
     System.out.println();

 }
}
