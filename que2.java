import java.net.SocketPermission;

public class que2 {
    public static void main(String[] args) {
        int a=9;
        a++;
        System.out.println(a);
        System.out.println(a++);
        int b=a++;
        System.out.println(b);
        System.out.println(a);
        b=a++-9;
        System.out.println(b);
        System.out.println(a);

    }
    
}
