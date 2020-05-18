class Node 
{ 
    int key; 
    Node left, right; 
  
    public Node(int item) 
    { 
        key = item; 
        left = right = null; 
    } 
} 
  
class BinaryTree 
{ 
    
    Node root; 
  
    BinaryTree() 
    { 
        root = null; 
    } 
  
    
    void traverseLeaves(Node node) 
    { 
        if (node == null) 
            return; 
  
        
        traverseLeaves(node.right); 
      
  
        
        traverseLeaves(node.left); 
  
        
        System.out.print(node.key + " "); 
        
       
    } 
  
    
    
    void traverseLeaves()  {     traverseLeaves(root);  } 
   
    public static void main(String[] args) 
    { 
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(8); 
        tree.root.left = new Node(3); 
        tree.root.right = new Node(4); 
        tree.root.left.left = new Node(14); 
        tree.root.left.right = new Node(6); 
        tree.root.left.right.left = new Node(10); 
        tree.root.left.right.right = new Node(1); 
        tree.root.right.right = new Node(7); 
        tree.root.right.right.left = new Node(13); 
  
          
        System.out.println("\nRight to left traversal of ordered binary tree is "); 
        tree.traverseLeaves(); 
    } 
} 
