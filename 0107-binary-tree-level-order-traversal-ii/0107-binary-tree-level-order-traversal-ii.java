public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<TreeNode>();
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        
        if(root == null) return ans;
        
        q.offer(root);
        while(!q.isEmpty()){
            int levelNum = q.size();
            List<Integer> sl = new LinkedList<Integer>();
            for(int i=0; i<levelNum; i++) {
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                sl.add(q.poll().val);
            }
            ans.add(0, sl);
        }
        return ans;
    }
}