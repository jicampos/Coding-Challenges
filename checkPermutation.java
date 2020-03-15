import java.util.*;

public class checkPermutation {
   
   public static boolean checkPermutationHash(String s1, String s2){
      
      if(s1.length() != s2.length()) return false;
      
      Map<Character, Integer> map = new HashMap<>();
      for(int i=0; i<s1.length(); i++){
         char c = s1.charAt(i);
         if(!map.containsKey(c)) 
            map.put(c, 0);
         map.replace(c, map.get(c)+1);
      }
      
      for(int i=0; i<s2.length(); i++){
         char c = s2.charAt(i);
         if(!map.containsKey(c))
            return false;
         map.replace(c, map.get(c)-1);
      }
      
      for(Character currentKey: map.keySet()){
         if(map.get(currentKey) != 0)
            return false;
      }
      return true;
   }
   
   public static boolean checkPermutationSort(String s1, String s2){
      
      if(s1.length() != s2.length()) return false;
      
      char[] chars1 = s1.toCharArray();
      char[] chars2 = s2.toCharArray();

      Arrays.sort(chars1);
      Arrays.sort(chars2);
      
      for(int i=0; i<s1.length(); i++){
         if(chars1[i] != chars2[i])
            return false;
      }
      return true;
   }
   
   public static void main(String[] args) {
      System.out.println(checkPermutationSort("abcfd", "bdafc"));
   }
}