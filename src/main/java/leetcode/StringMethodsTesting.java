package leetcode;

import java.util.Arrays;

public class StringMethodsTesting {
  public static void main(String[] args) {
    /**
    String str2 = "aAAbbbb";
    System.out.println(str2.contains("aA"));
	  
	  
	  
	  char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
	  String myStr2 = "";
	  myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
	  System.out.println("Returned String: " + myStr2);
	  
	  
	  String str2 = "aAAbbbb";
	    System.out.println(str2.endsWith("bb"));
	    
	    
	  String str2 = "aAAbbbb";
	    System.out.println(str2.startsWith("a"));
	  
	  String str1="aa";
	  String str2 = "aAAbbbb";
	  System.out.println(str1.compareTo(str2));
	  
	  String str1="aa";
	  String str2 = "aAAbbbb";
	  System.out.println(str1.compareToIgnoreCase(str2));
	  
	  String str1="aa";
	  String str2 = "aAAbbbb";
	  System.out.println(str1.equals(str2));
	  
	  String str1="aa";
	  StringBuilder str2 = new StringBuilder("aa");
	  System.out.println(str1.contentEquals(str2));//not possible for comparing string and StringBUilder using .equals()
	  
	  String str1="aa";
	  String str2 = "aA";
	  System.out.println(str1.equalsIgnoreCase(str2));
	  
	  String myStr = "Hello %s! One kilobyte is %d bytes.";
	  String result = String.format(myStr, "World", 1024);
	  System.out.println(result);
	  
	  String resul2t = String.format("%3$c %2$c %1$c", 'a', 'b', 'c');
	  System.out.println(resul2t);
      
	  
	  System.out.println(String.format("| %-10s | %-5d |", "Java", 101));
	  
	  
	  //Padding numbers with '0' s
	  int id=7;
	  System.out.println(String.format("%04d",id));
	// Output: ID: 007
	  
	  
	  double myNumber = 12.78;
	  String result;
	  
	// Default
	  result = String.format("%f", myNumber);
	  System.out.println(result);

	  // Two decimal digits
	  result = String.format("%.2f", myNumber);
	  System.out.println(result);

	  // No decimal digits
	  result = String.format("%.0f", myNumber);
	  System.out.println(result);

	  // No decimal digits but keep the decimal point
	  result = String.format("%#.0f", myNumber);
	  System.out.println(result);

	  // Group digits
	  result = String.format("%,.2f", myNumber);
	  System.out.println(result);

	  // Scientific notation with two digits of precision
	  result = String.format("%.2e", myNumber);
	  System.out.println(result);

	  
	  
	  char[] myArray = {'a', 'b', 'c'};
	  System.out.println(String.valueOf(myArray));
	  System.out.println(String.valueOf('A'));
	  System.out.println(String.valueOf(true));
	  System.out.println(String.valueOf(4.5f));
	  System.out.println(String.valueOf(5.2));
	  System.out.println(String.valueOf(12));
	  System.out.println(String.valueOf(1400L));
		
	 
	 String myStr = "Hello";
	  char[] myArray = myStr.toCharArray();
	  System.out.println(myArray[0]);
	  
	  int[] myStr = {2,3,4};
	  System.out.println(Arrays.toString(myStr));
	  
	   **/
	  
	  
	  String myStr ="Hello World";
	  System.out.println(myStr.subSequence(2,5));

 	  
  }
}
