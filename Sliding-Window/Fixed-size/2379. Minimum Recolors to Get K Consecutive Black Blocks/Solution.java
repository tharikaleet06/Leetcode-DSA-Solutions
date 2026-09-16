class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                count++;
            }
        }
        int min=count;
        for(int j=k;j<blocks.length();j++){
            if(blocks.charAt(j)=='W'){
                count++;
            }
            if(blocks.charAt(j-k)=='W'){
                count--;
            }
            min=Math.min(count,min);

        }
        return min;
    }
}
