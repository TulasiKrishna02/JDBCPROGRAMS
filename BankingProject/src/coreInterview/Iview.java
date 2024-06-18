package coreInterview;
import java.util.ArrayList;
import java.util.List;

public class Iview {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Following code attempts to create an arraylist of a tree structure like below:
         *                  n0
         *                 /  \
         *                n1  n2
         *               /  \     
         *             n21   n22
         *             / \
         *           n31  n32
         *           / \     \
         *        n41   n42   n421
         *        /
         *       n51
         */
        List<Node> nodelist = new ArrayList<Node>();
        Node n0 = new Node(1, -1, "l0-1");
        nodelist.add(n0);
        
        Node n41 = new Node(41, 31, "l4-1");
        Node n42 = new Node(42, 31, "l4-2");
        Node n421 = new Node(421, 32, "l4-21"); // child of n32
        nodelist.add(n41);
        nodelist.add(n42);
        nodelist.add(n421);
        
        Node n1 = new Node(11, 1, "l1-1");
        Node n2 = new Node(12, 1, "l1-2");
        nodelist.add(n1);
        nodelist.add(n2);

        Node n21 = new Node (21, 11, "l2-1");
        Node n22 = new Node (22, 11, "l2-2");
        nodelist.add(n21);
        nodelist.add(n22);

        Node n31 = new Node (31, 21, "l3-1");
        Node n32 = new Node (32, 21, "l3-2");
        nodelist.add(n31);
        nodelist.add(n32);
        
         
        
        Node n51 = new Node(51, 41, "l5-1");
        nodelist.add(n51);
        
        populateParents(nodelist, n51);
        System.out.println("---------");
        populateChildren(nodelist, n0);//Print the nodes... for Debugging..
    }
    
    /**
     * Populate parent chain of any given node, i.e. node's parent property shall be set to 
     * its parent node , node.parent node's parent property shall be set to node.parent's 
     * parent and so on, until we reach the root node.
     * Example: In the array list populated in main method, following shall be set if node n31
     * was passed as second argument:
     * n31.parent = n21;
     * n31.parent.parent = n1;
     * @param nodelist - List of all nodes in tree
     * @param node - The node for which parent node chain is to be populated
     */
    public static void populateParents(List<Node> nodelist, Node node) {
    	int id  = node.id;
    	for(Node n : nodelist){
    			//System.out.println(n.name);
    			
    			n.children = new ArrayList<Node>(2);
    			for(Node n1 : nodelist){
    				if(n.id == n1.parentid){
    					n.children.add(n1);
    					n1.parent = n;
    				}
    			}
    			//System.out.println("");
    		}
    	
    	//System.out.println("");
    	
    	for(Node node1= node ; node1.parent != null; node1 = node1.parent){
    		System.out.println("parent of " + id  + " is "+ node1.parentid);
    		id = node1.parentid;
    	}
    }

    /**
     * Populate child chain of any given node, i.e. node's children property shall be set to 
     * all its children nodes. All nodes in node's children property shall have their children 
     * property set properly and so on until we reach leaf nodes.
     * 
     * Example: In the array list populated in main method, following shall be set if node n21
     * was passed as second argument:
     * 
     * n21.children = {list containing n31 and n32};
     * n31.children = {list containing n41 and n42};
     * n32.children = {list containing n421};
     * n41.children = {list containing n51};
     * n42.children = null;
     * n421.children = null;
     * n51.children = null;
     * 
     * @param nodelist - List of all nodes in tree
     * @param node - The node for which children node chain is to be populated
     */
    public static void populateChildren(List<Node> nodelist, Node node) {
    	
    	for(Node nn : nodelist){
    		if(nn == node){
    			for(Node n: nn.children){
    				populateChildren(nn.children,n);
    				System.out.println(n.id);
    			   }
    			
    		}
    	}
    }
}






class Node {
	   public int id;
	    public String name;
	    // parentid == -1 denotes root node of the tree
	    public int parentid;
	    
	    public Node parent;
	    public List<Node> children;

	    public Node(int id, int parentid, String name) {
	        this.id = id;
	        this.parentid = parentid;
	        this.name = name;
	        this.parent = null;
	        this.children = null;
	    }
	    @Override
	    public String toString()
	    {
	        return this.id + ", " + this.name;
	    }
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((children == null) ? 0 : children.hashCode());
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((parent == null) ? 0 : parent.hashCode());
			result = prime * result + parentid;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			if (children == null) {
				if (other.children != null)
					return false;
			} else if (!children.equals(other.children))
				return false;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (parent == null) {
				if (other.parent != null)
					return false;
			} else if (!parent.equals(other.parent))
				return false;
			if (parentid != other.parentid)
				return false;
			return true;
		}
	    
	}