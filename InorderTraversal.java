/**
    Binary Tree : Inorder Traversal by Asma
  */
class InorderTraversal {
   
    public List<Integer> inorderTraversal(TreeNode root) {
      ArrayList<Integer> inorder = new ArrayList<Integer>();
      
      inorder(root, inorder);

      return inorder;

    }
    
     public void inorder(TreeNode root, ArrayList<Integer> list) {
        if(root == null)
            return;

        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
     }
}

/**
   TC : 0(N)
   SC : 0(N) stack space
 */