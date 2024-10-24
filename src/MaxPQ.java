public class MaxPQ {
    Integer [] heap;
    int n; // how many elements in the PQ

    public MaxPQ(int capacity){
        heap = new Integer[capacity + 1];
        n = 0;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public int getSize(){
        return n;
    }

    /**
     * pushes an item to the right position in the heap
     * @param val the value to be pushed
     */
    public void push(int val) {
        int pos = n;
        heap[pos] = val;

        while (heap[pos] > heap[(pos-1) / 2]) {
            int temp = heap[pos];
            heap[pos] = heap[(pos - 1) / 2];
            heap[(pos - 1) / 2] = temp;
            pos = (pos - 1) / 2;
        }

        n += 1;
    }

    public Integer[] getHeap(){
        return heap;
    }
}
