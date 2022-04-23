public class BinaryTree2 <E> {
    private BTNode2 root;

    //constructor
    public BinaryTree2(){
        root = null;
    }
    //function to check if tree is empty
    public boolean isEmpty(){
        return root == null;
    }
    //function to insert data
    public void insert (E data){
        root = insert(root, data);
    }
    //function to insert data recursively
    private BTNode2 insert (BTNode2 node,E data){
        if (node == null)
            node = new BTNode2(data);
        else{
            if (node.getLeft()==null)
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right,data);
        }
        return node;
    }
    public int countNodes(){
        return countNodes(root);
    }
    //funtion to count number of nodes recursively
    private int countNodes (BTNode2 r){
        if (r == null)
            return 0;
        else {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }
    //function to search for an element
    public boolean search (E val){
        return search(root, val);
    }
    //function to search for an element recursively
    private  boolean search (BTNode2 r, E val){
        if(r.getData() == val)
            return true;
        if (r.getLeft() != null)
           if(search(r.getLeft(),  val))
               return true;
        if (r.getRight() != null)
            if(search(r.getRight(), val))
                return true;
        return false;
    }
    //function for inorder traversal
    public void inorder(){
        inorder(root);
    }
    private void inorder (BTNode2 r){
        if(r != null){
            inorder(r.getLeft());
            System.out.print(r.getData()+ " ");
            inorder(r.getRight());
        }
    }
    //function for preorder traversal
    public void preorder(){
        preorder(root);
    }
    private void preorder(BTNode2 r){
        if(r != null){
            System.out.print(r.getData()+" ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }
    //fuction for postorder traversal
    public void postorder(){
        postorder(root);
    }
    private void postorder(BTNode2 r){
        if(r != null){
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.print(r.getData()+" ");
        }
    }
}
