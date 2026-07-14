/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}
*/
// Stack class
class myStack {
    Node top;
    int size;
    public myStack() {
        // Initialize your data members
        top=null;
        size=0;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        if(top==null){
            return true;
        }
        return false;
    }

    public void push(int x) {
        // Adds an element x at the rear of the stack.
        Node temp=new Node(x);
        temp.next = top;
        top=temp;
        size=size+1;
    }

    public void pop() {
        // Removes the front element of the stack.
        Node temp=top;
        top=top.next;
        size =size-1;
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
        if(!isEmpty()){
            return top.data;
        }
        return -1;
        
    }

    public int size() {
        // Returns the current size of the stack.
        return size;
    }
}
