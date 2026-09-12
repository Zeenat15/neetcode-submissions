class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];

        // Approach 1
        int index = 0;
        for(int i = 0; i < 2 ; i++){
            for(int num : nums){
                ans[index++] = num;
            }
        }
        return ans;

        // Approach 2
        // for(int i = 0; i < n; i++){
        //     ans[i] = ans[i+n] = nums[i];
        // }
        // return ans;
    }
}