package treee;


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}
public class SymmetryTree{
    public boolean isMirror(TreeNode left,TreeNode right){
        if(left==null && right==null){
            return true;
        }
        if(left==null || right==null){
            return false;
        }
        if(left.val != right.val){
            return false;
        }
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
    public boolean isSymmetric(TreeNode root){
        if(root ==null){
            return true;
        }
        return isMirror(root.left, root.right);
    }
}