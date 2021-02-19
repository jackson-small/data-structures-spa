package assignment6;

public class assignment6Main {
    public static void main(String [] args){
        TreeNode n = new TreeNode(10);
        myBST bst = new myBST(n);
        bst.add(n, 4);
        bst.add(n, 5);
        bst.add(n, 16);
        bst.add(n, 2);
        bst.add(n, 17);
        bst.print();

        System.out.println();
        System.out.println("Palindrome Tests:");
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("false"));
        System.out.println(isPalindrome("kayak"));
        System.out.println();
        System.out.println("Factorial Tests:");
        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(0));
    }

    public static boolean isPalindrome(String pal){
        int index = -1;
        while(pal.length()>1){
            if(pal.charAt(0) == pal.charAt(pal.length()-1)){
                pal = pal.substring(1,pal.length()-1);
            } else {
                index++;
                pal = pal.substring(1,pal.length()-1);
            }
        }
        if(index == -1){
            return true;
        } else {
            return false;
        }
    }

    public static int factorial(int k){
        if(k>1){
            return k*factorial(k-1);
        } else{
            return 1;
        }
    }
}
