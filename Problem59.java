class Problem59 {
    static int top=-1;
    static int[] stack=new int[5];
    static void push(int x){ stack[++top]=x; }
    static void pop(){ top--; }
    public static void main(String[] args){
        push(10);
        push(20);
        pop();
        System.out.println(stack[top]);
    }
}
