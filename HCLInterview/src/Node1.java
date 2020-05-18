class Node1 
{ 
    int data; 
    Node1 left, right; 
    public Node1(int item) 
    { 
        data = item; 
        left = right = null; 
    } 
} 
  
class BinaryTree1 
{ 
    
    Node1 root; 
  
    public BinaryTree1() 
    { 
        root = null; 
    } 
  
   
    void printLevelOrder() 
    { 
        int h = height(root); 
        int i; 
        for (i=1; i<=h; i++) 
            printGivenLevel(root, i); 
    } 
  
    
    int height(Node1 root) 
    { 
        if (root == null) 
           return 0; 
        else
        { 
            
            int lheight = height(root.left); 
            int rheight = height(root.right); 
              
            
            if (lheight > rheight) 
                return(lheight+1); 
            else return(rheight+1);  
        } 
    } 
  
   
    void printGivenLevel (Node1 root ,int level) 
    { 
        if (root == null) 
            return; 
        if (level == 1) 
            System.out.print(root.data + " "); 
        else if (level > 1) 
        { 
            printGivenLevel(root.left, level-1); 
            printGivenLevel(root.right, level-1); 
        } 
    } 
      
    
    public static void main(String args[]) 
    { 
       BinaryTree tree = new BinaryTree(); 
       tree.root= new Node(1); 
       tree.root.right= new Node(2); 
       tree.root.right.right= new Node(5); 
       tree.root.right.right.left= new Node(3); 
       tree.root.right.right.right= new Node(6);
       tree.root.right.right.left.right= new Node(4); 
         
       System.out.println(" For the above tree, Level order traversal  is "); 
       tree.printLevelOrder(); 
    } 
} 