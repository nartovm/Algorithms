import java.sql.Array;
import java.util.*;

public class Main {
    public static int[] topKFrequent(int[] nums, int k) {
        if (nums.length <= 1) {
            return nums;
        }

        int offset = 10000;
        int[] freq = new int[20001];

        for (int n : nums) {
            freq[n + offset]++;
        }

        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            int number = i - offset;
            int frequency = freq[i];
            if (frequency != 0) {
                if (buckets[frequency] == null) {
                    buckets[frequency] = new ArrayList<>();
                }
                buckets[frequency].add(number);
            }
        }

        int[] result = new int[k];

        for (int i = buckets.length - 1, counter = 0; i >= 0; i--) {
            List<Integer> list = buckets[i];
            if (list != null) {
                for (Integer number : list) {
                    result[counter++] = number;
                    if (counter == k) {
                        return result;
                    }
                }
            }
        }
        return result;
    }

    public static int[] topKFrequent3(int[] nums, int k) {
        if (nums.length <= 1) {
            return nums;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            int freq = map.getOrDefault(n, 0);
            map.put(n, ++freq);
        }

        List<Integer>[] buckets = new List[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int freq = entry.getValue();
            int n = entry.getKey();
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(n);
        }
        int[] result = new int[k];
        for (int i = buckets.length - 1, counter = 0; i >= 0; i--) {
            List<Integer> list = buckets[i];
            if (list != null) {
                for (Integer n : list) {
                    result[counter++] = n;
                    if (counter >= k) {
                        return result;
                    }
                }
            }
        }
        return result;
    }

    public static int[] topKFrequent2(int[] nums, int k) {
        if (nums.length <= 1) return nums;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            int freq = map.getOrDefault(n, 0);
            map.put(n, ++freq);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> heap =
                new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            heap.add(entry);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll().getKey();
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(topKFrequent(new int[]{4, 1, 1, 1, 2, 2, 3, 2, 4, 4, 5}, 2)));
//        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 2}, 2)));
        System.out.println(Arrays.toString(topKFrequent(new int[]{-1, -1}, 1)));
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 1, 2, 2, 3}, 2)));
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3, 1, 2, 2, 2, 5}, 2)));
        System.out.println(Arrays.toString(topKFrequent(new int[]{1}, 1)));
    }
}