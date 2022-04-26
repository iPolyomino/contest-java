import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        sc.close();

        ArrayList<Integer> east = new ArrayList<>(Collections.nCopies(N, 0));
        ArrayList<Integer> west = new ArrayList<>(Collections.nCopies(N, 0));

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'E') {
                east.set(i, 1);
            } else {
                west.set(i, 1);
            }
        }

        for (int i = 1; i < N; i++) {
            west.set(i, west.get(i) + west.get(i - 1));
            east.set(i, east.get(i) + east.get(i - 1));
        }
        int ans = N;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            if (i != 0) {
                sum += west.get(i - 1);
            }
            sum += east.get(N - 1) - east.get(i);
            ans = Math.min(ans, sum);
        }
        System.out.println(ans);
    }
}
