class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();

        while (root != null || !st.isEmpty()) {

            while (root != null) {
                st.push(root);
                root = root.left;
            }

            root = st.pop();
            ans.add(root.val);

            root = root.right;
        }

        return ans;
    }
}