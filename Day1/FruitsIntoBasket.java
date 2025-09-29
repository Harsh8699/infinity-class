class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int max=Integer.MIN_VALUE;
        int start=0,end=0;
        int fr[]=new int[100001];
        int unique=0;
        while(end<n){
            int f=fruits[end];
            if(fr[f]==0){
                unique++;
            }
            fr[f]++;
            end++;
            while(start <end && unique>2){
                int st=fruits[start];
                fr[st]--;
                if(fr[st]==0){
                    unique--;
                }
                start++;
            }
            max=Math.max(max,end-start);
        }
        return max;
    }
}