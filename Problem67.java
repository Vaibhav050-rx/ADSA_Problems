class Problem67 {
    static int[] q=new int[5];
    static int f=0,r=-1;
    static void enqueue(int x){ q[++r]=x; }
    static void dequeue(){ f++; }
    public static void main(String[] args){
        enqueue(10);
        enqueue(20);
        dequeue();
        System.out.println(q[f]);
    }
}
