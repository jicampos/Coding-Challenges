import java.util.*;

public class Solution {
   
   public static boolean isUniqueBF(String s){
      for(int i=0; i<s.length(); i++){
         for(int j=0; j<s.length(); j++){
            if(s.charAt(i) == s.charAt(j) && i != j)
               return false;
         }
      }
      return true;
   }
   
   public static boolean isUniqueSet(String s){
      Set<Character> set = new HashSet<>();
      for(int i=0; i<s.length(); i++){
         if(set.contains(s.charAt(i)))
            return false;
         set.add(s.charAt(i));
      }
      return true;
   }
   
   public static boolean isUniqueSort(String s){
      char[] chars = s.toCharArray();
      Arrays.sort(chars);
      for(int i=0; i<s.length()-1; i++){
         if(chars[i] == chars[i+1])
            return false;
      }
      return true;
   }
   
   public static boolean isUniqueBit(String s){
      int checker = 0;
      int mask = 1;
      for(int i=0; i<s.length(); i++){
         int shift = (int)s.charAt(i);
         if((mask<<shift & checker) != 0)
            return false;
         checker = checker | mask<<shift;
      }
      return true;
   }
   
   public static void main(String[] args) {
      
      System.out.println(isUniqueBit("abxcvnmljj"));
   }
}