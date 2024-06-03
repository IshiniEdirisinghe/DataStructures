package Stack;
import java.util.*;

public class FIFOstack {

    public static void main(String[] args) {
    	Stack q = new Stack();
        q.enQueue(19);
        q.enQueue(30);
        q.enQueue(5);
        q.enQueue(67);

        if (!q.isEmpty()) {
            System.out.println(q.Front());
        }
        
        q.deQueue();
        
        if (!q.isEmpty()) {
            System.out.println(q.Front());
        }
        
        q.deQueue();
        
        if (!q.isEmpty()) {
            System.out.println(q.Front());
        }
    }

    //implementation
    static class Stack {
        private List<Integer> data;
        private int firstNo;

        public Stack() {
            data = new ArrayList<>();
            firstNo = 0;
        }

        public boolean enQueue(int x) {
            data.add(x);
            return true;
        }

        public boolean deQueue() {
            if (isEmpty()) {
                return false;
            }
            firstNo++;
            return true;
        }

        public int Front() {
            return data.get(firstNo);
        }

        public boolean isEmpty() {
            return firstNo >= data.size();
        }
    }
}
