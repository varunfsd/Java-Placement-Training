package training;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
    }
}

class BinaryTree {

    static class Index {
        int value = -1;
    }

    public static TreeNode buildTree(int[] arr) {
        return buildTreeHelper(arr, new Index());
    }

    private static TreeNode buildTreeHelper(int[] arr, Index index) {
        index.value++;

        if (index.value >= arr.length || arr[index.value] == -1) {
            return null;
        }

        TreeNode root = new TreeNode(arr[index.value]);
        root.left = buildTreeHelper(arr, index);
        root.right = buildTreeHelper(arr, index);

        return root;
    }

    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static int countLeafNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }

    public static boolean isSameTree(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        if (a.data != b.data) {
            return false;
        }
        return isSameTree(a.left, b.left) && isSameTree(a.right, b.right);
    }

    public static boolean isMirror(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        if (a.data != b.data) {
            return false;
        }
        return isMirror(a.left, b.right) && isMirror(a.right, b.left);
    }

    public static void levelOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                System.out.print(curr.data + " ");

                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> levelOrderZigZag(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean isLeftToRight = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                temp.add(curr.data);

                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            if (!isLeftToRight)
                Collections.reverse(temp);
            list.add(temp);
            isLeftToRight = !isLeftToRight;
        }
        System.out.println();
        return list;
    }

    public static void inOrderIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
    }
}

public class TreeExample {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        int[] arr1 = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        TreeNode root = BinaryTree.buildTree(arr);
        TreeNode root1 = BinaryTree.buildTree(arr1);

        System.out.print("InOrder: ");
        BinaryTree.inOrder(root);
        System.out.println();

        System.out.print("PreOrder: ");
        BinaryTree.preOrder(root);
        System.out.println();

        System.out.print("PostOrder: ");
        BinaryTree.postOrder(root);
        System.out.println();

        System.out.println("Total Nodes: " + BinaryTree.countNodes(root));
        System.out.println("Leaf Nodes: " + BinaryTree.countLeafNodes(root));

        System.out.println("Same Tree: " + BinaryTree.isSameTree(root, root1));
        System.out.println("Mirror: " + BinaryTree.isMirror(root, root1));

        System.out.println("Level Order:");
        BinaryTree.levelOrder(root);

        System.out.print("InOrder Iterative: ");
        BinaryTree.inOrderIterative(root);
        System.out.print("LevelOrder ZigZag: " + BinaryTree.levelOrderZigZag(root));
    }
}