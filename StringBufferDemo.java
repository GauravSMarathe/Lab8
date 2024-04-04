package fundamentals;
/* write a program which creates a StringBuffer “This is StringBuffer” and performs the following.

	1. Adds the string”- This is a sample program” to existing string and display it.

	2. Inserts the string “Object” into the existing string at 21st postion and display it.

	3. Reverses the entire string and displays it.

	4. Replaces the word “Buffer” with “Builder” and display it.

	*/
	public class StringBufferDemo {

		    public static void main(String[] args) {
		        // Task 1
		        StringBuffer stringBuffer = new StringBuffer("This is StringBuffer");
		        stringBuffer.append("- This is a sample program");
		        System.out.println("Task 1: " + stringBuffer);

		        // Task 2
		        stringBuffer.insert(21, "Object");
		        System.out.println("Task 2: " + stringBuffer);

		        // Task 3
		        stringBuffer.reverse();
		        System.out.println("Task 3: " + stringBuffer);

		        // Task 4
		        stringBuffer.replace(stringBuffer.indexOf("Buffer"), stringBuffer.indexOf("Buffer") + "Buffer".length(), "Builder");
		        System.out.println("Task 4: " + stringBuffer);
		    }
		}

