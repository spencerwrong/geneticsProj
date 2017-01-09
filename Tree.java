import java.util.Scanner;


//put level into node so it can print which level you are in and what side;
public class Tree 
{
	public int leftLevel = 0;
	public int rightLevel = 0;
	public class Node      //remember to make private after testing
	{
		String yourEyeColor;
		Node left;
		Node right;   //no need for Node.next cause of Node left and Node right;
	                                                                              

	  public Node(String EyeColor)
	  {
	  	System.out.println("inside Node construtor");
		this.yourEyeColor = EyeColor;                        //works as planned
		System.out.println("eyeColor:"+this.yourEyeColor);

        if(EyeColor.compareTo("n/a")==0)
        {

        	System.out.println("you have entered n/a (we are in the Node constructor)");
        	System.out.println(" ");
        	return;
        }
       // System.out.println("About to begin askParents for left");
       // leftLevel++;
       // System.out.println("We are on left level:"+leftLevel);
		left = askParents();
		
		

      //  System.out.println("About to begin askParents right");
      //  rightLevel++;
      //System.out.println("We are on right level:"+rightLevel);
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
     	System.out.println("inside Tree constructor");
         root = new Node(eyeColor);
         System.out.println("done with  Tree constructor");
     }
 
     public Node getRoot()
     {
        return root;

     }

     public String getColor()
     {

     	return root.yourEyeColor;
     }
     //Ask the user to 
     //recursively keep making nodes until the user inputs "n/a"
     //then go to the right side of the tree and make nodes and go back down  after the right side.

	public Node askParents()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the eye color for this slot if you do not know enter n/a");
        System.out.println("                 ");
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
        String color = sc.next();

       /* if(color.equals("n/a"))
        {
           System.out.println("colors is equal to n/a");
           Node x = new Node(color);
        }*/

		Node x = new Node(color);
        System.out.println("Node for this slot has been created");
        System.out.println("                     ");

		
	  /* if(color.compareTo("n/a")==0)           //base case is that the user doesnt know the eye color for that slot
		{
			System.out.println("checked and found eyeColor == n/a");
			return x;                //if the user cannot give you an answer to this slot then end the recursion and go to another slot
		}
        else
        {
        System.out.println("About to begin askParents for left");
        leftLevel++;
        System.out.println("We are on left level:"+leftLevel);
		x.left = askParents();
        leftLevel=0;
		System.out.println("done with left side");
		
		System.out.println("                        ");
		

		System.out.println("About to begin askParents right");
        rightLevel++;
        System.out.println("We are on right level:"+rightLevel);
		x.right = askParents();
		rightLevel=0;
		System.out.println("done with right side");

		System.out.println("                        ");
		sc.close();
		return x;
        }*/
        return x;
	}
}
//ln -s /Applications/Sublime\ Text.app/Contents/SharedSupport/bin/subl
