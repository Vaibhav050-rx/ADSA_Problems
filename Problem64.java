import java.util.*;
class Problem64 {
    static Queue<Integer> q=new LinkedList<>();
    static void push(int x){
        q.add(x);
        for(int i=0;i<q.size()-1;i++)
            q.add(q.poll());
    }
    static void pop(){ q.poll(); }
    public static void main(String[] args){
        push(10);
        push(20);
        pop();
        System.out.println(q.peek());
    }
}
