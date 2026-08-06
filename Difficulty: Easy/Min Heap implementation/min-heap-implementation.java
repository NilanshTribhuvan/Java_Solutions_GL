class minHeap {
    int[] arr;
    int size;
    // Constructor
    public minHeap() {
        // Initialize your data members
        arr=new int[10000];
        size=0;
    }

    public void push(int x) {
        // Insert x into the heap
        arr[size]=x;
        int i=size;
        size++;
        while(i>0){
            int parent = (i-1)/2;
            if(arr[parent]>arr[i]){
                int temp=arr[parent];
                arr[parent]=arr[i];
                arr[i]=temp;
                i=parent;
            }else{
                break;
            }
        }
    }

    public void pop() {
        // Remove the top (minimum) element
        if(size==0){
            return;
        }
        int i=0;
        arr[0]=arr[size-1];
        size--;
        while(i<size){
            int smallest=i;
            int left=2*i+1;
            int right=2*i+2;
            if(left<size && arr[smallest]>arr[left]){
                smallest=left;
            }
            if(right<size && arr[smallest]>arr[right]){
                smallest=right;
                
            }
            if(smallest!=i){
                int temp=arr[smallest];
                arr[smallest]=arr[i];
                arr[i]=temp;
                i=smallest;
                
            }else{
                break;
            }
        }
    }

    public int peek() {
        // Return the top element or -1 if empty
        if(size==0){
            return -1;
        }
        return arr[0];
    }

    public int size() {
        // Return the number of elements in the heap
        return size;
    }
}