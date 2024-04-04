package fundamentals;

/*Write a method that takes a String and returns a String of the same length containing the 
 'X' character in all positions except the last 4 positions. 
 The characters in the last 4 positions must be the same as in the original string. 
 For example, if the argument is

"12345678", the return value should be "XXXX5678".
*/
public class StringLabEx2 {

    public static void main(String[] args) {
	        String originalString = "12345678";
	        String modifiedString = replaceWithX(originalString);
	        System.out.println(modifiedString);
	        
	       String modifiedString1= replaceWithX("7798960361");
	        System.out.println(modifiedString1);
	        
	        String str3=replaceWithX("1234");
	        System.out.println(str3);
	    }

	    public static String replaceWithX(String input) {
	        if (input == null || input.length() < 4) {
	            // Handle invalid input as per your requirements
	            return input;
	        }

	        int length = input.length();
	        int lastFourStartIndex = length - 4;

	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < lastFourStartIndex; i++) {
	        	
	        	result.append('X');
	        }
	        result.append(input.substring(lastFourStartIndex));
	       
	        
	        return result.toString();
	    }
	}
