/*.Write a method that takes a String[] as an argument and returns a String 
  containing the concatenation of all the strings in the input array.
  Invoke your method 3 times with different arguments.
   Make sure that your code handles the cases where the argument is null. 
*/
package fundamentals;

public class StringLabEx3 {
	    public static void main(String[] args) {
	        // Example 1: Concatenating strings in an array
	        String[] array1 = {"Hello", " ", "World"};
	        String result1 = concatenateStrings(array1);
	        System.out.println("Example 1: " + result1);

	        // Example 2: Handling null array
	        String[] array2 = null;
	        String result2 = concatenateStrings(array2);
	        System.out.println("Example 2: " + result2);

	        // Example 3: Concatenating strings with an empty array
	        String[] array3 = {};
	        String result3 = concatenateStrings(array3);
	        System.out.println("Example 3: " + result3);
	    }

	    public static String concatenateStrings(String[] stringArray) {
	        if (stringArray == null) {
	            // Handle null array
	            return "Input array is null";
	        }

	        StringBuilder result = new StringBuilder();

	        for (String str : stringArray) {
	            if (str != null) {
	                result.append(str);
	            }
	        }

	        return result.toString();
	    }
	}
