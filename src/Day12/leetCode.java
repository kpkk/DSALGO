package Day12;

public class leetCode {

    /*

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
    /*
    class Solution {
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            List<Integer>a1=new ArrayList<>();
            List<Integer>a2=new ArrayList<>();

            helperFun(root1, a1);
            helperFun(root2,a2);
            if(a1.equals(a2)){
                return true;
            }else{
                return false;
            }
        }
        private void helperFun(TreeNode node, List<Integer> list){
            if(node!= null){
                // System.out.println(node.val);
                if(node.left==null && node.right==null){
                    list.add(node.val);
                }

                helperFun(node.left, list);
                helperFun(node.right, list);
            }
        }
    }
     */
}
