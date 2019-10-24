class Solution {
    public String largestNumber(int[] nums) {
        
        int[] sorted = sort(nums);
        StringBuilder str = new StringBuilder();
        for(int i=0; i<nums.length; i++)
            str.append(String.valueOf(nums[i]));
        return str.toString();
        
    }
    
    // custom sort method, returns nums sorted = 
    public int[] sort(int[] nums){
        int max_index = 0;
        for(int i=0; i<nums.length; i++){
            max_index = i;
            for(int j=i+1; j<nums.length; j++)
                // does nums[j] have higher priority?
                // if so, update index
                if(compare(nums[j], nums[max_index]))
                    max_index = j;
            
            // swap elements 
            int temp = nums[max_index];
            nums[max_index] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
    
    // returns true if 'a' has higher priority, false otherwise
    public boolean compare(int a, int b){
        int first_index_a = a;
        int first_index_b = b;
        
        while(first_index_a>=10)
            first_index_a /= 10;
        while(first_index_b>=10)
            first_index_b /= 10;
        
        if(first_index_a == first_index_b){
            if(a < 10 || b < 10){
                if(a < 10 && b >= 10)
                    return true;
                else if(b < 10 && a >= 10)
                    return false;
                else
                    return (a > b) ? true : false; 
            }
        }
        else if(first_index_a>first_index_b)
            return true;
        else
            return false;
        
        
        return true;
    }
    
}