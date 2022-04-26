import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();

        int ans = 0;
        for (int i = 0; i < N; i++) {
            String sub1 = S.substring(0, i);
            String sub2 = S.substring(i);
            Set<Character> st1 = sub1.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
            Set<Character> st2 = sub2.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
            Set<Character> linked = new LinkedHashSet<>(st1);
            linked.retainAll(st2);
            ans = Math.max(ans, linked.size());
        }
        System.out.println(ans);
    }
}
