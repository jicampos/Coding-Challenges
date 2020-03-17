import java.util.*;

public class stringCompression{
   
   public static String stringCompression(String s){
      
      int left = 0;
      int right = 0;
      StringBuilder str = new StringBuilder();
      
      while(left<s.length()){
         while(right<s.length() && s.charAt(left) == s.charAt(right)) 
            right++;
         str.append(s.charAt(left));
         str.append(new Integer(right-left));
         left = right;
         right++;
      }
      
      String res = str.toString();
      if(res.length() < s.length())
         return res;
      return s;
   }
   
   public static void main(String[] args) {
      System.out.println(stringCompression("abbbrrrrrt"));
   }
}