class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                i++;
            }else if(a[i]>b[j]){
                j++;
            }
            else{
                if(res.isEmpty()||res.get(res.size()-1)!=a[i]){
                    res.add(a[i]);
                }
                i++;
                j++;
            }
        }
        return res;
    }
}