package dev.nartov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        String[] strs = new String[]{"dog", "racecar", "car"};
        System.out.println(new Main().longestCommonPrefix(strs));
    }

    @Test
    public void test2() {
        String[] strs = new String[]{"flower", "flow", "flight"};
        System.out.println(new Main().longestCommonPrefix(strs));
    }

    @Test
    public void test3() {
        String[] strs = new String[]{"", "b"};
        System.out.println(new Main().longestCommonPrefix(strs));
    }

    @Test
    public void test4() {
        String[] strs = new String[]{"aс", "a"};
        System.out.println(new Main().longestCommonPrefix(strs));
    }

    @Test
    public void test5() {
        String[] strs = new String[]{"a", "aс"};
        System.out.println(new Main().longestCommonPrefix(strs));
    }


    @Test
    public void test6() {
        String[] strs = new String[]{"abca","aba","aaab"};
        System.out.println(new Main().longestCommonPrefix(strs));
    }
}