class Solution{
    public int maxSubarraySumCircular(int[] nums){
        int ans1=subArray(nums);

        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            nums[i]=-1*nums[i];
        }
        int sum2=subArray(nums);
        int ans2=total+sum2;

        if(ans2==0) return ans1;

        return ans1;

    }
    int subArray(int[]nums){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(max,sum);
            if(sum<0) sum=0;
        }
        return max;
    }
}