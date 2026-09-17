class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sat=0;
        int add=0;
        for(int i=0;i<grumpy.length;i++){
            if(grumpy[i]==0){
                sat+=customers[i];
            }
        }
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                add+=customers[i];
            }
        }
        int max=add;
        for(int j=minutes;j<grumpy.length;j++){
            if(grumpy[j]==1){
                add+=customers[j];
            }
            if(grumpy[j-minutes]==1){
                add-=customers[j-minutes];
            }
            max=Math.max(add,max);
        }
        return sat+max;
    }
}
