/*Write a program which creates a String “Welcome to Java World” and performs the following

• Returns the character at 5th position and display it.

• Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.

• Concatenates “- Let us learn” to the above string and display it.

• Returns the position of the first occurrence of character ‘a’ and display it.

• Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.

• Returns string between 4th position and 10th position and display it.

• Returns the lowercase of the string and display it.
*/
package fundamentals;

public class String_labEx1 {

	public static void main(String arg[]) {
	
		String s1="Wellcome to java World ";//create string using string literal.
		String s2="Wellcome";
		String s3="let us learn";
		System.out.println("charAt(): "+s1.charAt(5));//Returns the character at 5th position and display it.

		int result = s1.compareToIgnoreCase(s2);
		System.out.println(result);
		
		String s4=s1.concat(s3);// Concatenates “- Let us learn” to the above string and display it.
		System.out.println("Concatenates string is: "+s4);
	
		System.out.println("Index of a:"+s1.indexOf('a'));// Returns the position of the first occurrence of character ‘a’ and display it.

		System.out.println("replace string :"+s1.replace('a','e'));// Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
		
		System.out.println("substring: "+s1.substring(4, 10));// Returns string between 4th position and 10th position and display it.
		
		s2.toLowerCase();// Returns the lower case of the string and display it.
		System.out.println("lowercase string is: "+s2.toLowerCase());// Returns the lower case of the string and display it.
	}
}