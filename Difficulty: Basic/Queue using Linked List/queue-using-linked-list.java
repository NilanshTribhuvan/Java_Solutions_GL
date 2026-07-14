// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {
    Node start;
    Node end;
    int size;
    

    public myQueue() {
        // Initialize your data members
        start=null;
        end=null;
        size=0;
    }

    public boolean isEmpty() {
        // check if the queue is empty
        if(start==null && end==null){
            return true;
            
        }
        return false;
    }

    public void enqueue(int x) {
        // Adds an element x at the rear of the queue.
        Node temp=new Node(x);
        if(isEmpty()){
            start=temp;
            end=temp;
        }else{
        end.next =temp;
        end =temp;
        }
        size=size+1;
    }

    public void dequeue() {
        // Removes the front element of the queue
        if(isEmpty()){
            return ;
        }
        start=start.next;
        size=size-1;
        if(start==null){
            end=null;
        }
        
    }

    public int getFront() {
        // Returns the front element of the queue.
        // If queue is empty, return -1.
        if(!isEmpty()){
            return start.data;
        }
        return -1;
    }

    public int size() {
        // Returns the current size of the queue.
        return size;
    }
}
