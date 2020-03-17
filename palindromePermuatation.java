import java.util.*;

public class palindromePermuatation{
   
   public static boolean palindromePermuatationSet(String s){
      
      HashSet<Character> set = new HashSet<>();
      for(int i=0; i<s.length(); i++){
         if(set.contains(s.charAt(i)))
            set.remove(s.charAt(i));
         else
            set.add(s.charAt(i));
      }
      
      if(set.size() <= 1)
         return true;
      return false;
   }
   
   public static boolean palindromePermuatationBit(String s){
      
      int checker = 0;
      int mask = 1;
      
      for(int i=0; i<s.length(); i++){
         int shift = (int)s.charAt(i);
         checker = checker ^ mask<<shift;
      }
      int count = 0;
      for(int i=0; i<32; i++){
         int shift = i;
         if((checker & mask<<shift) != 0)
            count++;
      }
      
      if(count <= 1)
         return true;
      return false;
   }
   
   public static void main(String[] args) {
      System.out.println(palindromePermuatationBit("bbaatllt"));
   }
}