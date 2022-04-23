public class BTNode2 <E> {
    BTNode2 left, right;
    E data;
    //constructor
    public BTNode2(){
        left = null;
        right = null;
        data = null;
    }
    //constructor
    public BTNode2(E item){
        left = null;
        right = null;
        data = item;
    }
    //function to set left node
    public void setLeft(BTNode2 n){
        left = n;
    }
    //function to set right node
    public void setRight(BTNode2 n){
        right = n;
    }
    //function to get left node
    public BTNode2 getLeft(){
        return left;
    }
    //function to get right node
    public BTNode2 getRight(){
        return right;
    }
    //function to set data to node
    public  void setData(E d){
        data = d;
    }
    //funtion to get data from node
    public  E getData(){
        return data;
    }
}
