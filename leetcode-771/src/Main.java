import java.util.HashSet;

public class Main {
    public int numJewelsInStones(String jewels, String stones) {
        int n = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i))!=-1) n++;
        }
        return n;
    }

    public int numJewelsInStones2(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        int n = 0;

        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }

        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i))) n++;
        }

        return n;
    }
}