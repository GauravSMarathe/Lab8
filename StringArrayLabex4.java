/*
3.Create two arrays.
 One containing String values: Peter , Amy, John ,Boyd, and Cathy, 
 and another one containing int values: 15,9, 14, 10,and 12.
 create an table showing  these values as name value pairs as below.

Name           Value

Amy             9

Boyd            10

Cathy            12

John             14

Peter            15
*/
package fundamentals;

public class StringArrayLabex4 {

	public static void main(String[] arg) {
	String name[]= {"Peter","Amy","John","Boyd","Cathy"};
	int value[]= {15,9,14,10,12};
	
	System.out.println("name\t\tvalues\n");
	
	for(int i=0;i<name.length;i++) {
	
		System.out.println( name[i]+"\t\t"+value[i]);
	}
	}
}
