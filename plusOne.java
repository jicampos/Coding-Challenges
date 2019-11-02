class Solution {
    public int[] plusOne(int[] digits) {
        
        int carry = 1;
        
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]+carry == 10){
                digits[i] = 0;
                carry = 1;
            } else{
                digits[i] = digits[i] + carry;
                carry = 0;
            }
        }
        
        
        // If number is larger than array size
        if(carry == 1){
            int[] ans = new int[digits.length+1];
            ans[0] = carry;
            
            for(int i=0; i<digits.length; i++){
                ans[i+1] = digits[i]; 
            }
            
            return ans;
        }
        
        return digits;
        
    }
}