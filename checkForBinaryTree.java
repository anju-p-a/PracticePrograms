

/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
//A function that returns if this is a binary search tree with unique values; omitted the equal sign and there by got unique values
    boolean checkBST(Node root) {
        if(root!=null){
         // check if left data is less than right data
         if(root.left.data<root.data)
            if(root.left!=null && root.right!=null){
                if(root.left.data>=root.right.data){
                    return false;
                }
            }
      //check if left data is less than root data

            if(root.left != null){
                if(root.left.data>=root.data){
                    return false;
                }else{
                    checkBST(root.left);
                }
            }
        //check if right data is greater than root data
             if(root.right != null){
                if(root.right.data<=root.data){
                     return false;
                }else{
                    checkBST(root.right);
                }
             }

        }
        return true;
    }
