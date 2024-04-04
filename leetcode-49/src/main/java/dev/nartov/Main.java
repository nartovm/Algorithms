package dev.nartov;

import java.util.*;

public class Main {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        List<List<String>> list = new ArrayList<>(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String k = entry.getKey();
            List<String> v = entry.getValue();
            list.add(v);
        }
        return list;
    }

    public List<List<String>> groupAnagrams2(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }
        }

        List<List<String>> list = new ArrayList<>(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String k = entry.getKey();
            List<String> v = entry.getValue();
            list.add(v);
        }
        return list;
    }

    public static void main(String[] args) {
        new Main().groupAnagrams(new String[]{"asdasd", "asdfasgf"});
    }
}