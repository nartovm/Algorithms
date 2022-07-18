import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArmstrongCalcFromGithub {
    private static long[][] pows;

    private static void genPows(int N) {
        if (N > 20) throw new IllegalArgumentException();
        pows = new long[10][N + 1];
        for (int i = 0; i < pows.length; i++) {
            long p = 1;
            for (int j = 0; j < pows[i].length; j++) {
                pows[i][j] = p;
                p *= i;
            }
        }
    }

    private static boolean check(long i) {
        long powSum = 0;
        long x = i;
        int N = ((int) Math.log10(x)) + 1;
        do {
            int mod = (int) x % 10;
            powSum += pows[mod][N];
            x = x / 10;
        } while (x != 0);
        return powSum == i;
    }

    public static long[] generate(long limit) {
        List<Long> results = new ArrayList<>();
        genPows(19);
        for (long i = 1; i < limit; i++) {
            if (check(i)) results.add(i);
        }
        long[] resultArr = new long[results.size()];
        for (int i = 0; i < results.size(); i++) {
            resultArr[i] = results.get(i);
        }
        return resultArr;
    }

    public static void main(String[] args)
    {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(generate(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(generate((long) Math.pow(10,9))));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}
