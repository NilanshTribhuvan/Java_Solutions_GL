class myQueue {
    int[] queue;
    int start;
    int end;
    int currSize;
    // Constructor
    public myQueue(int n) {
        // Define Data Structures
        queue=new int[n];
        start=-1;
        end=-1;
        currSize=0;
    }

    public boolean isEmpty() {
        // Check if queue is empty
        if(currSize==0){
            return true;
        }
        return false;
    }

    public boolean isFull() {
        // Check if queue is full
        if(currSize==queue.length){
            return true;
        }
        return false;
    }

    public void enqueue(int x){
        // Enqueue
        if(isFull()){
            return ;
        }
        if(isEmpty()){
            start=0;
        }
        
            end++;
           queue[end]=x;
           currSize++;
    
        
        
    }

    public void dequeue() {
        // Dequeue
        if(isEmpty()){
            return;
        }
        currSize--;
        if(currSize==0){
            start=-1;
            end=-1;
        }else{
            start++;
        }
    }

    public int getFront() {
        // Get front element
        if(!isEmpty()){
            return queue[start];
        }
        return -1;
    }

    public int getRear() {
        // Get last element
        if(!isEmpty()){
            return queue[end];
        }
        return -1;
    }
}
