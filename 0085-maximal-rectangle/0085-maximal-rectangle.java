class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0){
            return 0;
        }
        int row=matrix.length;
        int col=matrix[0].length;
        int[] height=new int[col];
        int maxArea=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]=='1'){
                    height[j]++;
                }else{
                    height[j]=0;
                }
               
            }
             maxArea=Math.max(maxArea,largestRectangleArea(height));
            
        }
        return maxArea;
    }
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> st=new Stack<>();
        int[] pse=new int[n];
        int[] nse=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=-1;
            }else{
                pse[i]=st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=n;
            }else{
                nse[i]=st.peek();
            }
            st.push(i);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,heights[i]*(nse[i]-pse[i]-1));

        }
        return ans;
    }
}