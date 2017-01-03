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

	// Determines if the expressed gene is dominant or recessive (BB or Bb = dominant | bb = recessive)
	/**
	 * @return true if the expressed trait is dominant
	 */
	public boolean isDominant()
	{
		if(!traits.hasUppercase()) // if there is no uppercase letter the expressed trait must be dominant.
		{
			return false;
		}
		return true;
	}
	
	/**
	 * Returns the string containing the traits.
	 * @return the string contianing the traits.
	 */
 	public String getTraits()
 	{
 		return traits;
 	}

 	/**
 	 * Returns true if the dominant trait is expressed.
 	 * @return true if the dominant trait is expressed.
 	 */
 	public boolean getDomoinant()
 	{
 		return dominant;
 	}

	/**
 	 * Determines if a string contains an lowercase letter
 	 * @return true if a lowercase letter is present.
 	 */
 	public boolean hasLowercase()
 	{
 		return !(traits.equals(traits.toUpperCase()));
 	}

 	/**
 	 * Determines if a string contains an uppercase letter
 	 * @return true if an uppercase letter is present.
 	 */
 	public boolean hasUppercase()
 	{
 		return !(traits.equals(traits.toLowerCase()));
 	}
}