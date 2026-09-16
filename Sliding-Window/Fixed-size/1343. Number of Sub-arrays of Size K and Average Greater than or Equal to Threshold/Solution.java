class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int t=threshold*k;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int count=0;
        if(sum>=t){
        count++;
        }
        for(int j=k;j<arr.length;j++){
            sum+=arr[j];
            sum-=arr[j-k];
            if(sum>=t){
            count++;
            }
        }
        return count;
    }
}
