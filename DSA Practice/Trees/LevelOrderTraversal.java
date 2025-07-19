import java.util.*;

public class LevelOrderTraversal {

    // Static inner class 
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> wl = new ArrayList<>();
        if (root == null) {
            return wl;
        }
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> sl = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node v = queue.poll();
                sl.add(v.data);
                if (v.left != null) {
                    queue.offer(v.left);
                }
                if (v.right != null) {
                    queue.offer(v.right);
                }
            }
            wl.add(sl);
        }
        return wl;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        LevelOrderTraversal tree = new LevelOrderTraversal();
        List<List<Integer>> result = tree.levelOrder(root);

        System.out.println("Level Order Traversal:");
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}
