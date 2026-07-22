class Solution {
    public int trap(int[] height) {
        int[] prefix=new int[height.length];
        prefix[0]=height[0];
        for(int i=1;i<height.length;i++){
            prefix[i]=Math.max(prefix[i-1],height[i]);
        }
         int[] suffix=new int[height.length];
         suffix[height.length-1]=height[height.length-1];
         for(int i=height.length-2;i>=0;i--){
            suffix[i]=Math.max(suffix[i+1],height[i]);
         }
         int total =0;
         for(int i=0;i<height.length;i++){
            int left=prefix[i],right = suffix[i];
            if(height[i]<left && height[i]<right){
                total +=(Math.min(left,right))-height[i];
            }

         }
         return total;
    }
}