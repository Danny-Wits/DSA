package trees;

public class Main {
    public static void main(String[] args) {
        BST b=  new BST();
        b.insertNode(new treeNode(4, null, null));
        b.insertNode(new treeNode(1, null, null));
        b.insertNode(new treeNode(10, null, null));
        b.insertNode(new treeNode(5, null, null));
        b.insertNode(new treeNode(3, null, null));
        b.display();
        System.out.println(b.search(10));
    }
}
