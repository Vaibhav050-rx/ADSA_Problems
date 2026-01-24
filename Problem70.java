import java.util.*;
class Problem70 {
    public static void main(String[] args){
        Deque<Integer> d=new ArrayDeque<>();
        d.addFirst(10);
        d.addLast(20);
        d.removeFirst();
        System.out.println(d.peek());
    }
}
