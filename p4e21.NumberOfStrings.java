
import java.util.Scanner;
import java.util.ArrayList;

public class NumberOfStrings {

    public static void main(String[] args) {
        System.out.println(accum("ZpglnRxqenU"));
    }

    
    public static String accum(String s) {
     // your code
      int stringLength = s.length();
      String output = "";
      char[] separatedChars = s.toCharArray();
      
      for (int i = 0; i < s.length(); i++) {
        output += Character.toUpperCase(separatedChars[i]);
        for (int ii = 0; ii < i; ii++) {
          output += Character.toLowerCase(separatedChars[i]);
        }
        if (i == s.length() -1) {
            break;
        } else {
        output += "-";
        }
      }
      return output;
    }
}

