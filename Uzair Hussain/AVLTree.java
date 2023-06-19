public class AVLTree {
    private int key, height;
    AVLTree left,right;

    private AVLTree(){
        left=right=this;
        height=-1;
    }
    private AVLTree (int key, AVLTree left,AVLTree right){
        this.key=key;
        this.left=left;
        this.right=right;
        height= (1+ Math.max(left.height, right.height));
    }
    public AVLTree(int key){
        this.key=key;
        left=right=nil;
    }
    public static final AVLTree nil= new AVLTree();

    public boolean add(int key){
        int oldsize=size();
        grow(key);

        return size()>oldsize;
    }
    public int size(){
        if(this==nil){
            return 0;
        }
        else{
            return 1+(left.size()+right.size());
        }
    }
    public AVLTree grow(int key){
        if(this==nil){
            return new AVLTree(key);
        }
        if(key==this.key){
            return this;
        }
        if(key<this.key){
            left=left.grow(key);
        }
        else{
            right=right.grow(key);
        }
        rebalance();
        height=1+Math.max(left.height, right.height);

        return this;
    }
    public String toString(){
        if(this==nil){
            return "";
        }
        return (left + " " + key + " " + right );
    }
    public String Preorder(){
        if(this==nil){
            return "";
        }
        return ( key + " " + left + " " + right );
    }
    public String Postorder(){
        if(this==nil){
            return "";
        }
        return ( left + " " + right + " " +key );
    }
    public void rotateLeft(){
        left=new AVLTree(key,left,right.left);
        key=right.key;
        right=right.right;
    }
    public void rotateRight(){
        right=new AVLTree(key,left,right.right);
        key=left.key;
        left=left.left;
    }

    private void rebalance() {

        if(right.height>left.height+1){
            if(right.left.height>right.right.height){
                right.rotateRight();
            }
            rotateLeft();
        }
        if(left.height>right.height+1){
            if(left.right.height>left.left.height){
                left.rotateLeft();
            }
            rotateRight();
        }
    }
    public AVLTree leftmost(){
        AVLTree tree;
        if(left==null){
            return this;
        }
        else{
            tree=left.leftmost();
        }
        return tree;
    }
    public AVLTree rightmost(){
        AVLTree tree2;
        if(right==null){
            return this;
        }
        else{
            tree2=right.rightmost();
        }
        return tree2;
    }
    public static void main(String[] args) {
        AVLTree a = new AVLTree(2);
        int[] values={8,5,3,1,4,6,10,11,14};
        for(int i=0;i<values.length;i++){
            a.add(values[i]);
        }
        System.out.println("Height: " + a.height);
        System.out.println("In Order : " + a.toString());
        System.out.println("Pre Order : " + a.Preorder());
        System.out.println("Post Order : " + a.Postorder());
        System.out.println("Left Most Node : "+ a.leftmost());
        System.out.println("Right Most Node : "+ a.rightmost());
    }
}
