import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArmstrongNumbers{
    static long[][] matrix = null;

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(Long.MAX_VALUE)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
    public static long[] getNumbers(long N) {
        long[] result = null;
        ArrayList<Long> arrayList = new ArrayList<Long>();


        int length = 1;
        long check = 10L;
        int nLength = classicGetLength(N);
        pow(9, classicGetLength(Long.MAX_VALUE));

        for (long i = 1; i < N; i++) {
            if (i >= check) {
                long fake = i;
                int length2 = 0;
                while (fake > 0) {
                    fake = fake / 10;
                    length2++;
                }
                length = length2;
                check *= 10;
            }
            if (isAscending(i, length)) {
                if (length<nLength) {
                    int lengthNew = length;
                    long t = i;
                    while (lengthNew<nLength&&t>0)
                    {
                        armstrongSearch(arrayList, lengthNew, t);
                        lengthNew++;
                        t=t*10;
                    }
                }
                else {
                    armstrongSearch(arrayList, length, i);
                }
            }
        }
        Collections.sort(arrayList);
        result = new long[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = arrayList.get(i);
        }
        return result;
    }

    private static void armstrongSearch(ArrayList<Long> arrayList, int lengthNew, long t) {
        long armstrong = calcArmstrong(t, lengthNew);
        int armstrongLength = classicGetLength(armstrong);
        if (lengthNew ==armstrongLength){
            if (armstrong==calcArmstrong(armstrong, lengthNew)){
                arrayList.add(armstrong);
            }
        }
    }



    private static long calcArmstrong(long number, int length) {
        long sum = 0L;
        int lengthToSubstract = length;
        while (lengthToSubstract > 0) {
            int digit = (int) (number % 10);
            sum += pow(digit, length);
            lengthToSubstract--;
            number = number / 10;
        }
        return sum;
    }
    private static boolean isAscending(long number, int length) {
        int firstDigit = (int) (number / pow(10, length - 1));
        while (length > 1) {
            number = number - firstDigit * pow(10, length - 1);
            length--;
            int secondDigit = (int) (number / pow(10, length - 1));
            if (secondDigit < firstDigit)
                return false;
            else {
                firstDigit = secondDigit;
            }
        }
        return true;
    }

    private static int classicGetLength(long number) {
        int length = 0;
        while (number > 0) {
            number /= 10;
            length++;
        }
        return length;
    }

    private static long pow(int i, int pow) {
        if (matrix == null) {
            matrix = new long[11][pow+1];
            for (int j = 0; j < 11; j++) {
                for (int k = 0; k < pow+1; k++) {
                    matrix[j][k] = (long) Math.pow(j, k);
                }
            }
        }
        return matrix[i][pow];
    }


}