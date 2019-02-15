package day5;

import java.util.Stack;

public class Convert {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null){
            return null;
        }
        TreeNode list = null;
        Stack<TreeNode> stack = new Stack<>();
        while (pRootOfTree != null || !stack.isEmpty()){
            if (pRootOfTree != null){
                stack.push(pRootOfTree);
                pRootOfTree = pRootOfTree.right;
            }else{
                pRootOfTree = stack.pop();
                if (list == null){
                    list = pRootOfTree;
                }else{
                    list.left = pRootOfTree;
                    pRootOfTree.right = list;
                    list = pRootOfTree;
                }
                pRootOfTree = pRootOfTree.left;
            }
        }
        return list;
    }
}
