import java.util.Scanner;

public class Person
{
	private boolean dominant; // true = brown eyes / false = blue eyes
	private String traits;

	public Person(boolean dominant, traits)
	{
		this.dominant = dominant;
		this.traits = traits;
	}

	
	public static void main(String[] args)
	{
		// input traits but only accept if length 2
		String traits = "";
		while(traits.length() != 2)
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter the traits (e.g. BB, Bb or bb)");
			traits = input.nextLine();
			System.out.println(traits);
		}
	}

	// Determines if the expressed gene is Dominant or recessive (BB or Bb = dominant | bb = recessive)
	/**
	 * @return
	 */
	public boolean isDominant()
	{
		if()
	}
	
	/**
	 * @return
	 */
 	public String getTraits()
 	{
 		return traits;
 	}

 	/**
 	 * Returns true if the dominant trait is expressed.
 	 * @return
 	 */
 	public boolean getDomoinant()
 	{
 		return dominant;
 	}

 	/**
 	 * Determines if a string contains a lowercase letter
 	 * @return
 	 */
 	public boolean hasUppercase()
 	{

 	}

 	/**
 	 * Determines if a string contains an uppercase letter
 	 * @return
 	 */
 	public boolean hasLowercase()
 	{

 	}


}