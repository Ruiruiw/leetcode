class MyCircularDeque {

    //使用数组模拟双端队列
    //这里不考虑扩容情况，也自然不需要考虑真正意义上的删除元素；
    //初始化时，head=0, tail=0;
    //只需移动头尾指针，头部新增元素，则head = (head - 1 + cap) % cap,删除则head = (head + 1) % cap;
    //尾部新增元素，则tail = (tail + 1) % cap,删除则tail=(tail - 1 + cap) % cap;

    private int[] elements;
    private int head, tail;
    private int size;
    private int cap;

    public MyCircularDeque(int k) {
       this.elements = new int[k];
       cap=k;
       head=0;
       tail=0;
       size=0;
    }
    
    public boolean insertFront(int value) {
       if(isFull()) return false;
       else{
           head = (head - 1 + cap) % cap;
           elements[head] = value;
        //    head++;
           size++;
           return true;
       }
    }
    
    public boolean insertLast(int value) {
        if(isFull()) return false;
        else{ 
           elements[tail] = value;
           tail = (tail + 1) % cap;
           size++;
           return true;
        }
    }
    
    public boolean deleteFront() {
        if(isEmpty()) return false;
        else{
            head = (head + 1) % cap;
            size--;
            return true;
        }
    }
    
    public boolean deleteLast() {
       if(isEmpty()) return false;
       else{
        //    tail++;
        tail = (tail - 1 + cap) % cap;
           size--;
           return true;
       }
    }
    
    public int getFront() {
       if(isEmpty()) return -1;
       else  {
        //  int idx = head - 1;
         return elements[head];
       }
    }
    
    public int getRear() {
       if(isEmpty()) return -1;
       else {
        //  int idx = Math.min(size - 1, tail + 1);
        //  System.out.println("size: " + size + ", tail + 1: " + (tail  + 1));
         return elements[(tail - 1 +cap) % cap];
       }
    }
    
    public boolean isEmpty() {
      return size==0;
    }
    
    public boolean isFull() {
        return size==cap;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
