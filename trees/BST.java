package trees;

public class BST {
    treeNode root;

    void insertNode(treeNode node) {
        this.root = I(root, node);
    }

    private treeNode I(treeNode root, treeNode node) {
        int data = node.data;
        if (root == null) {
            root = node;
            return root;
        }
        if (data < root.data) {
            root.leftChild = I(root.leftChild, node);
        } else {
            root.rightChild = I(root.rightChild, node);
        }
        return root;
    }

    void display() {
        D(root);
    }

    private void D(treeNode node) {
        if (node == null) {
            return;
        }
        D(node.leftChild);
        System.err.print(node.data + "-");
        D(node.rightChild);
    }

    boolean search(int data){
        return S(root, data);
    }
    private boolean S(treeNode root , int data){
        if(root==null)return false;
        if(data>root.data)return S(root.rightChild, data);
        if(data<root.data)return S(root.leftChild, data);
        return true;
    }
    
    void remove(){

    }
}
