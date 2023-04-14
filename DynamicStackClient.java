public class DynamicStackClient {
    public static void main(String[] args) throws Exception {
        DynamicStack ds=new DynamicStack();
        ds.push(10);
        ds.push(20);
        ds.push(30);
        ds.push(40);
        ds.push(50);
        System.out.println(ds.peek());
        ds.push(60);
        ds.Display();
    }
}
