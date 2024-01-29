package dev.nartov;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> noteMap = new HashMap<>();
        HashMap<Character, Integer> magazineMap = new HashMap<>();

        for (char ch : magazine.toCharArray()) {
            magazineMap.put(ch, magazineMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : ransomNote.toCharArray()) {
            noteMap.put(ch, noteMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : noteMap.entrySet()) {
            Character l = entry.getKey();
            Integer n = entry.getValue();
            int nMagazine = magazineMap.getOrDefault(l, -1);
            if (n > nMagazine) return false;
        }

        return true;
    }
}