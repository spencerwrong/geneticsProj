import java.util.Scanner;

/** 
 * Creates a Person with given traits and a whether the domininant gene is expressed.
 */
public class Person
{
	private boolean dominant; // true = brown eyes / false = blue eyes
	private String traits;

	/**
	 * Constructs a Person object.
	 * @param dominant whether the expressed trait is dominant or recessive
	 * @param string containing the traits for the Person.
	 */
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
			
			// 1st check
			// traits must be length 2
			if(traits.length != 2)
			{
				throw new Exception("Traits must be exactly length 2");
			}

			// 2nd check
			// first letter is different from 2nd letter
			if(!traits.toLowerCase().charAt(0).equals(traits.toLowerCase().charAt(1)))
			{
				throw new Exception("Traits must contain the same letter");
			}
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