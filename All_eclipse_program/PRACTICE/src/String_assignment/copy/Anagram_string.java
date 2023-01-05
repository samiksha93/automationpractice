package String_assignment.copy;
import java.util.Arrays;
public class Anagram_string {

  public static boolean areAnagrams(String s1, String s2) {
    // First, we need to make sure that the strings have the same length
    if (s1.length() != s2.length()) {
      return false;
    }

    // Next, we will sort the strings and compare them
    char[] s1Array = s1.toCharArray();
    char[] s2Array = s2.toCharArray();
    Arrays.sort(s1Array);
    Arrays.sort(s2Array);
    return Arrays.equals(s1Array, s2Array);
  }

  public static void main(String[] args) {
    String s1 = "Mother In Law";
    String s2 = "Hitler mother";
    
    //check strings has same character in order
    if (areAnagrams(s1, s2)) {
      System.out.println("The strings are anagrams.");
    } else {
      System.out.println("The strings are not anagrams.");
    }
    
    //check length of string is equal or not
    if (s1.length() == s2.length()) {
        System.out.println("anagrams");
      }else {
    	  System.out.println("Not anagrams");
      }
  }}