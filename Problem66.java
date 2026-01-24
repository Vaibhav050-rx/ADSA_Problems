import java.util.*;
class Problem66 {
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.poll();
        System.out.println(q.peek());
    }
}
