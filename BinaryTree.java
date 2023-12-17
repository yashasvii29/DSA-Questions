import java.util.*;
public class BinaryTree{
    public class Node{
        int data;
        Node left;
        Node right;

    }
    // tree is a collection of nodes
    private Node root;
    public BinaryTree(){
        // binarytree client class m jab BinaryTree ka object create krenge toh constructor call hoga and then createTree function call hoga 
        root=createTree();
    }
    Scanner sc=new Scanner(System.in);
    private Node createTree(){
        int item=sc.nextInt();
         Node nn=new Node();
        nn.data=item;
        boolean hlc=sc.nextBoolean();
        // has left child
        if(hlc==true){
            // hum recursive call lagayenge ,createTree function se kahenge left node create kare and nn ke left m left node ka address assign kr dy
            nn.left= createTree();
        }
        boolean hrc=sc.nextBoolean();
        // has right child  
        if(hrc==true){
            // hum recursive call lagayenge ,createTree function se kahenge right node create kare and nn ke right m right node ka address assign kr dy
            nn.right=createTree();
        }
        // createTree function se root ka address return kr rhe hai
        return nn;
    }
    public void Display(){
        // hum chahte hai client root ko access na kare so we will create a public display function and inside this function we will call private function display(root) 
        Display(root);
    }
    private void Display(Node nn){
        if(nn==null){
            return;
        }
        String s="";
        s="<--"+nn.data+"-->";
        if(nn.left!=null){
            s=nn.left.data+s;
        }
        else{
            s="."+s;
        }
        if(nn.right!=null){
            s=s+nn.right.data;
        }
        else{
            s=s+".";
        }
        System.out.println(s);
        Display(nn.left);
        Display(nn.right);
    }
     public int max(){
         // hum chahte hai client root ko access na kare so we will create a public max function and inside this function we will call private function max(root) 
        return max(root);
    }
    private int max(Node nn){
        if(nn==null)
            return Integer.MIN_VALUE;
        int left=max(nn.left);
        int right=max(nn.right);
        return Math.max(nn.data,Math.max(left,right));
    }
    public boolean find(int item){
         // hum chahte hai client root ko access na kare so we will create a public find function and inside this function we will call private function max(root) 
        return find(root,item);
    }
    private boolean find(Node nn,int item){
        if(nn==null){
            return false;
        }
        if(nn.data==item){
            return true;
        }
        boolean left=find(nn.left,item);
         boolean right=find(nn.right,item);
         return left||right;
         // logical OR isliye use kiya hai left ya right kisi ek m bhi node exist krta hai then it will return true

    }
    public int ht(){
        return ht(root);
    }
    private int ht(Node nn){
        if(nn==null){
            return -1;// single node ki height 0 aayegi
            // single node ki height 1 aayegi return 0 pe(means 0 return krne pe)
        }
        int lh=ht(nn.left);
        int rh=ht(nn.right);
        return Math.max(lh,rh)+1;
    }
    public void PreOrder(){
        PreOrder(this.root);
        System.out.println();
    }
    private void PreOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        PreOrder(node.left);
        PreOrder(node.right);
    }
     public void PostOrder(){
        PostOrder(this.root);
        System.out.println();
    }
    private void PostOrder(Node node){
        if(node==null){
            return;
        }
        
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.data+" ");
    }
     public void InOrder(){
        InOrder(this.root);
        System.out.println();
    }
    private void InOrder(Node node){
        if(node==null){
            return;
        }
        
        InOrder(node.left);
        System.out.print(node.data+" ");
        InOrder(node.right);
        
    }
    public void levelOrder(){
        // LinkedList<Node> queue=new LinkedList<>();
        Queue<Node> q=new LinkedList<>(); // queue banayenge linkedlist ki help se
        // hum ek queue banayenge jisme nodes ke address honge and right side m LinkedList likhenge because node ko linkedlist ke through connect karenge
        // 2nd case of inheritance 
        q.add(root);
        while(!q.isEmpty()){
            Node rv=q.remove();// remove first
            //q.poll()
            System.out.println(rv.data);
            if(rv.left!=null){
                q.add(rv.left);
            }
            if(rv.right!=null){
                q.add(rv.right);
            }
        }
        System.out.println();
    }
}