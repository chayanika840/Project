class Solution {
    public int findDuplicate(int[] nums) {
        //slow and fast pointers
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow]; //move by one
            fast = nums[nums[fast]]; //move by two
        }while(slow != fast); //unless they meet at any given pint
            
        fast = nums[0]; //after they meet, slow pinter will be there but we'll move fast pointer to the first position 
        
        while(slow != fast){ //again move both by 1 until they meet
                slow = nums[slow];
                fast = nums[fast];
            }
        return slow; //can be fast also
        }
}