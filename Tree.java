public class Tree 
{
	public class Node
	{
		String yourEyeColor;
		Node left;
		Node right;
	}

	public Node(String yourEyeColor)
	{
		this.yourEyeColor = yourEyeColor;
		left = askParents();
		right = askParents();

	}
	public void askParents()
	{
		// input mom/dad traits
		// create the parent node of the layer below you
		// set nodes of parents
		// create a node containing traits of parents
	}
}