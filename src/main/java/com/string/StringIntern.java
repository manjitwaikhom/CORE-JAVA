package com.string;

/*Interning of String in Java
String Interning is a method of storing only one copy of each distinct String Value, which must be immutable.
When the intern() method is executed then it checks whether the String equals to this String Object exists in the
pool or not.If it is available, then the string from the pool is returned. Otherwise, this String object is added
to the pool and a reference to this String object is returned.
*/
public class StringIntern {
	public static void main(String[] args) {
		// S1 refers to Object in the Heap Area  
        String s1 = new String("manjit"); // Line-1  
  
        // S2 refers to Object in SCP Area 
        String s2 = s1.intern(); // Line-2  
        
		/* Comparing memory locations
		 *  s1 is in Heap 
		 *  s2 is in String Constant Pool
		 */
        System.out.println(s1==s2);
        
     // S3 refers to Object in the SCP Area  
        String s3 = "manjit"; // Line-3
        
        System.out.println(s2 == s3);
	}
	
	/*
	 * Explanation : Whenever we create a String Object, two objects will be created
	 * i.e. One in the Heap Area and One in the String constant pool and the String
	 * object reference always points to heap area object. When line-1 execute, it
	 * will create two objects and pointing to the heap area created object. Now
	 * when line-2 executes, it will refers to the object which is in the SCP. Again
	 * when line-3 executes, it refers to the same object which is in the SCP area
	 * because the content is already available in the SCP area. No need to create a
	 * new one object.
	 */

}
