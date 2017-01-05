import java.util.Scanner;


//put level into node so it can print which level you are in and what side;
public class Tree 
{
	private static int lvlL =-1;
    private static int lvlR =-1;
	public class Node
	{
		String yourEyeColor;
		Node left;
		Node right;   //no need for Node.next cause of Node left and Node right;
	                                                                              

	  public Node(String EyeColor)
	  {
	  	System.out.println("inside Node construtor");
		this.yourEyeColor = EyeColor;
		System.out.println("eyeColor:"+this.yourEyeColor);

        if(EyeColor.compareTo("n/a")==0)
        {

        	return ;
        }

        lvlL++;
		left = askParents();
		System.out.println("level for Left:"+lvlL);
		

        lvlR++;
		right = askParents();
		
		System.out.println("level for Right:"+lvlR);
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
     	System.out.println("inside Tree constructor");
         root = new Node(eyeColor);
         System.out.println("done with  Tree constructor");
     }
 
     public Node getRoot()
     {
        return root;

     }
	public Node askParents()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the eye color for this slot if you do not know enter n/a");
        
      /*  Node x = new Node(color);

        String color = sc.next();
        if(color.compareTo("n/a")==0)
        {
        	return 
        }*/

		// input mom/dad traits
		// create the parent node of the layer below you
		// set nodes of parents
		// create a node containing traits of parents
        

		Node x = new Node(sc.next());
        System.out.println("Node for this slot has been created");
		
	   if(x.yourEyeColor.compareTo("n/a")==0)           //base case is that the user doesnt know the eye color for that slot
		{
			return x;                //if the user cannot give you an answer to this slot then end the recursion and go to another slot
		}

		x.left = askParents();
		System.out.println("done with left side");
		x.right = askParents();
		System.out.println("done with right side");
		sc.close();
		return x;
        
	}
}
//ln -s /Applications/Sublime\ Text.app/Contents/SharedSupport/bin/subl