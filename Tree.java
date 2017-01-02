public class Tree 
{
	public class Nodes
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

		Node x = new Node( ___ );
		if(x.color != null)
		{
			//ask for color again
		}
		left = askParents();
		right = askParents();
	}
}
ln -s /Applications/Sublime\ Text.app/Contents/SharedSupport/bin/subl