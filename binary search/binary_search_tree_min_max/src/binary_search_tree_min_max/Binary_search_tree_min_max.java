package binary_search_tree_min_max;

public class Binary_search_tree_min_max {

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
            { System.out.println(" Inserted " + value + " to left of " + node.value); 
            node.left = new Node(value); 
            }
        } 
        else if (value > node.value) {
          if (node.right != null) {
            insert(node.right, value);
          } 
          else {
            System.out.println("  Inserted " + value + " to right of "
                + node.value);
            node.right = new Node(value);
          }
        }
      }
    
static Node Agac_Min_Ara(Node kok)
{ 
while(kok.left!=null)
{
    kok = kok.left;  
    System.out.print("sol-");
} 
return kok;
}

static Node Agac_Max_Ara(Node kok)
{ 
while(kok.right!=null)
{
    kok = kok.right;  
    System.out.print("sag-");
} 
return kok;
}
    
    public static void main(String[] args) {
        Node root = new Node(35);
        System.out.println("Binary Tree Example");
        System.out.println("Building tree with root value " + root.value);
             
        insert(root, 28);
        insert(root, 43);
        insert(root, 14);
        insert(root, 38);
        insert(root, 55);
        insert(root, 17);
        insert(root, 36);
        insert(root, 40);
        
        Node sonuc_min= Agac_Min_Ara(root);
        System.out.println("Min deger= " + sonuc_min.value); 
        
        Node sonuc_max= Agac_Max_Ara(root);
        System.out.println("Max deger= " + sonuc_max.value); 
    }
    
}
