public class BST {
    Node root;

    class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
        }
    }
        void insert(int value) {
            root = insert(root, value);
        }

        Node insert(Node node, int value) {
            if (node == null) {
                return new Node(value);
            }
            if (value < node.value) {
                node.left = insert(node.left, value);
            } else if (value > node.value) {
                node.right = insert(node.right, value);
            }
            return node;
        }

        boolean search(int value) {
            Node node = root;
            while (node != null) {
                if (node.value == value) {
                    return true;
                }
                if (value < node.value) {
                    node = node.left;
                } else {
                    node = node.right;
                }
            }
            return false;
        }

        void delete(int value) {
            root = delete(root, value);
        }

        Node delete(Node node, int value) {
            if (node == null) {
                return null;
            }
            if (value < node.value) {
                node.left = delete(node.left, value);
            } else if (value > node.value) {
                node.right = delete(node.right, value);
            } else {
                if (node.right == null) {
                    return node.left;
                }
                if (node.left == null) {
                    return node.right;
                }
                Node temp = node.right;
                while (temp.left != null) {
                    temp = temp.left;
                }
                node.value = temp.value;
                node.right = delete(node.right, temp.value);
            }
            return node;
        }
}