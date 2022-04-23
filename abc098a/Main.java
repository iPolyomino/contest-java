import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int mx = A + B;
        mx = Math.max(mx, A - B);
        mx = Math.max(mx, A * B);
        System.out.println(mx);
    }
}
