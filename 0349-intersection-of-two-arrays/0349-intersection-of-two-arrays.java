class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] result=new int[Math.min(n,m)];
        int k=0;
        for(int i=0;i<n;i++){
            boolean found=false;
            for(int j=0;j<m;j++){
                if(nums1[i]==nums2[j]){
                    found=true;
                    break;
                }
            }
            if(found){
                found=false;
                for(int j=0;j<k;j++){
                    if(result[j]==nums1[i]){
                        found=true;
                        break;
                    }
                }
                if(!found){
                    result[k]=nums1[i];
                    k++;
                }
            }
        }
        return Arrays.copyOf(result,k);
        
    }
}