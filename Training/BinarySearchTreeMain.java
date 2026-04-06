package training;

class BinaryNode {
    int data;
    BinaryNode left, right;

    BinaryNode(int data) {
        this.data = data;
    }
}

class BinarySearchTree {

    public static BinaryNode buildTree(int[] arr, int l, int r) {
        if (l > r)
            return null;

        int mid = (l + r) / 2;
        BinaryNode root = new BinaryNode(arr[mid]);

        root.left = buildTree(arr, l, mid - 1);
        root.right = buildTree(arr, mid + 1, r);

        return root;
    }

    public static boolean checkData(BinaryNode root, int target) {
        if (root == null)
            return false;
        if (root.data == target)
            return true;
        else {
            if (target < root.data)
                return checkData(root.left, target);
            else
                return checkData(root.right, target);
        }
    }

    public static boolean isValid(BinaryNode root, int min, int max) {
        if (root == null)
            return true;
        if (root.data <= min || root.data >= max)
            return false;
        return isValid(root.left, min, root.data) && isValid(root.right, root.data, max);
    }

    public static void inOrder(BinaryNode root) {
        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static int getKthElement(BinaryNode root, int k) {
        int[] count = new int[1];
        return helper(root, k, count);
    }

    public static int helper(BinaryNode root, int k, int[] count) {
        if (root == null)
            return -1;

        int left = helper(root.left, k, count);
        if (left != -1)
            return left;

        count[0]++;
        if (count[0] == k)
            return root.data;

        return helper(root.right, k, count);
    }

    public static BinaryNode findMin(BinaryNode root) {
        BinaryNode temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }

    public static BinaryNode deleteNode(BinaryNode root, int target) {
        if (root == null)
            return null;

        if (target < root.data)
            root.left = deleteNode(root.left, target);

        else if (target > root.data)
            root.right = deleteNode(root.right, target);

        else {
            // Node found

            // Case 1: No left child
            if (root.left == null)
                return root.right;

            // Case 2: No right child
            if (root.right == null)
                return root.left;

            // Case 3: Two children
            BinaryNode minNode = findMin(root.right);
            root.data = minNode.data;
            root.right = deleteNode(root.right, minNode.data);
        }

        return root;
    }
}

public class BinarySearchTreeMain {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        BinaryNode root = BinarySearchTree.buildTree(arr, 0, arr.length - 1);
        BinarySearchTree.inOrder(root);
        System.out.println(BinarySearchTree.checkData(root, 10));
        System.out.println(BinarySearchTree.getKthElement(root, 3));
        System.out.println(BinarySearchTree.isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
        BinaryNode updatedRoot = BinarySearchTree.deleteNode(root, 5);
        BinarySearchTree.inOrder(updatedRoot);
    }
}