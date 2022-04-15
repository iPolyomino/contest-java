import java.util.*;

class Main {
    static String[] strs = {
            "dream",
            "dreamer",
            "erase",
            "eraser"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        // int n = Integer.parseInt(s);
        String S = sc.next();

        while (true) {
            boolean endWithStr = false;
            for (String str : strs) {
                if (S.endsWith(str)) {
                    endWithStr = true;
                    S = S.substring(0, S.length() - str.length());
                    break;
                }
            }
            if (!endWithStr) {
                System.out.println("NO");
                break;
            }
            if (S.length() <= 0) {
                System.out.println("YES");
                break;
            }
        }
    }
}
