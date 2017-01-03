import java.util.Scanner;

public class Tree 
{
	public class Node
	{
		String yourEyeColor;
		Node left;
		Node right;   //no need for Node.next cause of Node left and Node right;
	                                                                              

	  public Node(String EyeColor)
	  {
		this.yourEyeColor = EyeColor;
		left = askParents();
		right = askParents();
	  }
    }

   /* public String getEyeColor()
     {
     	  String x = this.yourEyeColor;
     	  return x;
     }*/
     private Node root;


     public Tree(String eyeColor)
     {
         root = new Node(eyeColor);
     }
 
     public Node getRoot()
     {
        return root;

     }
	public Node askParents()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the eye color for this slot if you do not know enter n/a");


		// input mom/dad traits
		// create the parent node of the layer below you
		// set nodes of parents
		// create a node containing traits of parents

		Node x = new Node(sc.next());
	   if(x.yourEyeColor.compareTo("n/a")==0)           //base case is that the user doesnt know the eye color for that slot
		{
			return x;                //if the user cannot give you an answer to this slot then end the recursion and go to another slot
		}
		x.left = askParents();
		System.out.println("done with left side");
		x.right = askParents();
		System.out.println("done with right side");
		return x;
        
	}
}
//ln -s /Applications/Sublime\ Text.app/Contents/SharedSupport/bin/subl