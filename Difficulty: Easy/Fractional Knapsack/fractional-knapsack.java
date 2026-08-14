class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
         
        int n=val.length;
        double[][] arr=new double[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=val[i];
            arr[i][1]=wt[i];
        }
        
        Arrays.sort(arr,(a,b)->{
           double ratioA=a[0]/a[1];
           double ratioB=b[0]/b[1];
           return Double.compare(ratioB,ratioA);
        });
        
        double sum=0.0;
            for(int i=0;i<n;i++){
                double value=arr[i][0];
                double weight=arr[i][1];
            if(weight<=capacity){
                sum+=value;;
                capacity-=(int)weight;
            }else{
                sum+=value*(capacity/weight);
                break;
                }
            }
            return sum;
        }
    }
