package dev.nartov;

import java.util.*;

public class Main {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String word: strs) {
            String signature = id(word);
            map.putIfAbsent(signature, new ArrayList<>());
            map.get(signature).add(word);
        }
        List<List<String>> result = new ArrayList<>();
        map.forEach((x,y) -> {
            result.add(y);
        });
        return result;
    }

    private static String id(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"bdddddddddd","bbbbbbbbbbc"}));
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println(groupAnagrams(new String[]{""}));
        System.out.println(groupAnagrams(new String[]{"a"}));
    }
}