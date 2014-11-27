package introtocs.intermediate;

public class Strings {

	public static void main(String[] args) {
		// Working with Strings
		System.out.println("The scruffy dog said, \"Woof Woof\"");
		System.out.println("Transportation types: bike\\car\\airplane");
		
		String surprise = "Boo!";
		System.out.println(surprise.toLowerCase());
		System.out.println(surprise.toUpperCase());
		
		String trimThis = "  Trim this  ";
		System.out.println(trimThis.trim() + "String");
		
		String phrase = "I love to program";
		String substring = phrase.substring(2, 6);
		System.out.println(substring);
		
		String newPhrase = phrase.replace("program", "build applications");
		System.out.println(newPhrase);
		
		if (substring.equalsIgnoreCase("Love")) {
			System.out.println("Strings Match");
		} else {
			System.out.println("Strings Don't Match");
		}
		
		
	}

}
