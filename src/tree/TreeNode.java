/**
* BST balanced
* inorder will sorted
*/


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
      this.val = val;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
