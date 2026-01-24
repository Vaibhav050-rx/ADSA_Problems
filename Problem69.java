import java.util.*;
class Problem69 {
    static Stack<Integer> s1=new Stack<>();
    static Stack<Integer> s2=new Stack<>();
    static void enqueue(int x){ s1.push(x); }
    static int dequeue(){
        while(!s1.isEmpty()) s2.push(s1.pop());
        int v=s2.pop();
        while(!s2.isEmpty()) s1.push(s2.pop());
        return v;
    }
    public static void main(String[] args){
        enqueue(10);
        enqueue(20);
        System.out.println(dequeue());
    }
}
