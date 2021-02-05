package HomeWork;

import java.util.ArrayList;
import java.util.List;


class TreeNode {
  int val;
    TreeNode left;
     TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
      this.left = left;
        this.right = right;
    }
}

public class day14 {
    public static void main(String[] args) {

    }
    List<Integer> list=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        dfs(root,0);
            return list;
    }
    public void dfs(TreeNode root,int depth){
            if(root==null){
                return;
            }
            if(depth==list.size()){
                list.add(root.val);
            }
            depth++;
            dfs(root.right,depth);
            dfs(root.left,depth);
        }
}
