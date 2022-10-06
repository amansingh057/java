
// Creating a binary tree.
import java.util.*;

public class Main {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static Node construct(Integer[] arr) {
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);
        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx = 1;

        while (st.size() > 0) {
            Pair top = st.peek();
            if (top.state == 1) {
                top.state++;
                if (arr[idx] != null) {
                    Node lc = new Node(arr[idx], null, null);
                    top.node.left = lc;

                    Pair lp = new Pair(lc, 1);
                    st.push(lp);
                }
                idx++;
            } else if (top.state == 2) {
                top.state++;
                if (arr[idx] != null) {
                    Node rc = new Node(arr[idx], null, null);
                    top.node.right = rc;

                    Pair rp = new Pair(rc, 1);
                    st.push(rp);
                }
                idx++;
            } else {
                st.pop();
            }
        }
        return root;
    }

    public static void display(Node root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            System.out.print(root.left.data);
        } else {
            System.out.print(".");
        }
        System.out.print("<-" + root.data + "->");
        if (root.right != null) {
            System.out.print(root.right.data);
        } else {
            System.out.print(".");
        }
        System.out.println();
        display(root.left);
        display(root.right);
    }

    public static void levelOrder(Node root){
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);
        while(qu.size()>0){
            //remove
            Node rem = qu.remove();

            //Work
            System.out.print(rem.data+" ");
            //All all childs
            if(rem.left!=null){
                qu.add(rem.left);
            }
            if(rem.right!=null){
                qu.add(rem.right);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
                null };
        Node root = construct(arr);
        levelOrder(root);
        System.out.println();
        display(root);
    }
}
