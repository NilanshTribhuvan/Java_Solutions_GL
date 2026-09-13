class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img1.length;
        ArrayList<int[]> o1=new ArrayList<>();
        ArrayList<int[]> o2=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(img1[i][j]==1){
                    o1.add(new int[]{i,j});
                }
                if(img2[i][j]==1){
                    o2.add(new int[]{i,j});
                }
            }
        }
        HashMap<String,Integer> map=new HashMap<>();
        int maxf=0;
        for(int[] p1:o1){
            for(int[] p2:o2){
                int rowshift=p2[0]-p1[0];
                int colshift=p2[1]-p1[1];
                String shift=rowshift+","+colshift;
                map.put(shift,map.getOrDefault(shift,0)+1);
                maxf=Math.max(maxf,map.get(shift));
            }
        }
        return maxf;
    }
}