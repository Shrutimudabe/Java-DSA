 public static int sumOfLeftLeaves(Node node){
        if(node ==null){
            return 0;
        }
        
        if(node.left!=null &&node.left.left==null && node.left.right==null){
          return node.left.data + sumOfLeaves(node.right);
        }
       int rightSide = sumOfLeaves(node.right);
        int leftSide = sumOfLeaves(node.left);
        
    return leftSide + rightSide;
    }
