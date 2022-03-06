/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        int sz = descriptions.length;
        for (int i = 0; i < sz; i++) {
            int par = descriptions[i][0];
            int child = descriptions[i][1];
            int isleft = descriptions[i][2];
            if (!map.containsKey(par)) {
                TreeNode node = new TreeNode();
                node.val = par;
                map.put(par, node);
            }
            if (!map.containsKey(child)) {
                TreeNode node = new TreeNode();
                node.val = child;
                map.put(child, node);
            }
            set.add(child);
            if (isleft == 1) {
                map.get(par).left = map.get(child);
            } else {
                map.get(par).right = map.get(child);
            }
        }
        for (int key : map.keySet()) {
            if (set.contains(key)) continue;
            return map.get(key);
        }
        return null;
    }
}
