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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        
        TreeNode ans = implement(0,nums.length-1,nums);
        return ans;
    }
    
    public TreeNode implement(int i, int j, int[] nums){
        if(i>j){
            return null;
        }
        
        int mid = (i+j)/2;
        
        TreeNode root = new TreeNode(nums[mid]);
        root.left = implement(i, mid-1, nums);
        root.right = implement(mid+1, j ,nums);
        return root;
    }
}