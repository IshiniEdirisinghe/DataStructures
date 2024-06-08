package Stack;
import java.util.*;

public class Stack_ArrayList {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return (list.size() == 0);
        }

        public static void push(int elememt) {
            list.add(elememt);
        }

        public static int pop() {
            if (isEmpty() == true)
                return -1;
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek() {
            if (isEmpty())
                return -1;
            return list.get(list.size() - 1);
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(67);
        s.push(20);
        s.push(5);
        s.push(111);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}
