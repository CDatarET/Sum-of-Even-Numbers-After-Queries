class Solution {
    private int scan(int[] nums){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                sum += nums[i];
            }
        }

        return sum;
    }

    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] ret = new int[queries.length];
        int j = 0;
        for(int i = 0; i < queries.length; i++){
            nums[queries[i][1]] += queries[i][0];
            ret[j++] = scan(nums);
        }

        return ret;
    }
}
