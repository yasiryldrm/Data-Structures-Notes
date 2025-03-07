package binary_search_tree_example1;

public class Binary_search_tree_example {
static int sayi=0;
static Node sonuc=null ;

    static class Node {    
    int value; 
        Node left, right; 
          
        Node(int value){ 
            this.value = value; 
            left = null; 
            right = null; 
        } 
    } 
       
    static void insert(Node node, int value) {
        if (value < node.value) { 
            if (node.left != null) 
            { insert(node.left, value); } 
            else 
            {
            node.left = new Node(value); 
            }
        } 
        else if (value > node.value) {
          if (node.right != null) {
            insert(node.right, value);
          } 
          else {
            node.right = new Node(value);
          }
        }
      }
    
public static void Agac_Min_kth_Ara(Node node, int k) {  
    if (node != null){
        Agac_Min_kth_Ara(node.left,k);
        sayi++;
        if (sayi==k) sonuc=node;
        //else if(k<=0 || sayi<k) sonuc=null;
        Agac_Min_kth_Ara(node.right,k);
    }
    }
    
    public static void main(String[] args) {
        Node root = new Node(35);
        System.out.println("Binary Search Tree Example 1:");
             
        insert(root, 28);
        insert(root, 43);
        insert(root, 14);
        insert(root, 38);
        insert(root, 55);
        insert(root, 17);
        insert(root, 36);
        insert(root, 40);

        int k=1;
        Agac_Min_kth_Ara(root,k);
        
        if(sonuc==null) System.out.println("Index aşımı");
        else
        System.out.println("En küçük "+k+". deger=" + sonuc.value);
    }
}
