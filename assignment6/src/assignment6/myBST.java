package assignment6;


public class myBST {// I read this G4G article https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
    public TreeNode root;

    public myBST(TreeNode n){
        this.root = n;
    }

    public TreeNode add(TreeNode current, int k){
        if(current == null){
            current = new TreeNode(k);
            return current;
        }
        if(k< current.data){
            current.left = add(current.left, k);
        } else if(k> current.data){
            current.right =  add(current.right, k);
        }
        return current;
    }

    public void print(){
        int height = getHeight(this.root);
        printBST(this.root, 0);
    }

    public void printBST(TreeNode current, int space){ //I read the g4g article about printing the TreeSet
        //https://www.geeksforgeeks.org/print-binary-tree-2-dimensions/
        if(current != null) {
            space += 10;
            printBST(current.right, space);
            System.out.println();
            for (int i = 10; i < space; i++){
                System.out.print(" ");
            }
            System.out.println(current.data + "\n");
            printBST(current.left, space);
        }

    }

    public int getHeight(TreeNode current){
        int heightL = 1;
        while(current.left != null){
            heightL++;
            current = current.left;
        }
        int heightR = 1;
        while(current.right != null){
            heightR++;
            current = current.right;
        }
        if(heightR>heightL){
            return heightR;
        } else {
            return heightL;
        }
    }
}
