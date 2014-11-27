package introtocs.intermediate;

public class NestedIfStatements {

	public static void main(String[] args) {
		// Nested If Statements
		String gender = "Male";
		int age = 29;
		
		if(gender.equalsIgnoreCase("Male")) {
			if(age > 30) {
				System.out.println("You are a male over the age of 30");
			} else {
				System.out.println("You are a male under the age of 30");
			}
		} else {
			if(age > 30) {
				System.out.println("You are a female over the age of 30");
			} else {
				System.out.println("You are a female under the age of 30");
			}
		}
	}

}
