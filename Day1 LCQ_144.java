class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrderRec(root, result);
        return result;
    }
    private void preOrderRec(TreeNode root, List<Integer> result){
        if(root == null) return;
        result.add(root.val);
        preOrderRec(root.left, result);
        preOrderRec(root.right, result);
    }
}
