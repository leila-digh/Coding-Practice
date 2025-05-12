class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] solution =  new int[2];
        for(int i=0; i < nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                // System.out.format("Checking: [%d, %d] \n", nums[i], nums[j]);
                if(sumTarget(nums[i], nums[j], target)){
                    solution[0] = i;
                    solution[1] = j;
                }
            }
        }
        return solution;
    }

        
    

    public boolean sumTarget(int a, int b, int target){
        int sum =  a + b;
        if(sum == target){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        int tests[][] = {{2,7,11,15}, {3,2,4}, {3,3}};
        int[] targets = {9, 6, 6};
        
        for (int i = 0; i < tests.length; i++) {
            int[] result = sol.twoSum(tests[i], targets[i]);
            System.out.format("Input: %-5s, Target: %d \nOutput: [%d, %d]\n\n",java.util.Arrays.toString(tests[i]), targets[i], result[0], result[1]);
        }
    }
}