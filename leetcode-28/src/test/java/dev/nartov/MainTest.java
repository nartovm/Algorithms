package dev.nartov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(new Main().strStr(haystack, needle));
    }

    @Test
    public void test2() {
        String haystack = "leetcode";
        String needle = "leeto";
        System.out.println(new Main().strStr(haystack, needle));
    }

    @Test
    public void test3() {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(new Main().strStr(haystack, needle));
    }

    @Test
    public void test4() {
        String haystack = "mississippi";
        String needle = "issip";
        System.out.println(new Main().strStr(haystack, needle));
    }

    @Test
    public void test5() {
        String haystack = "mississippi";
        String needle = "issipi";
        System.out.println(new Main().strStr(haystack, needle));
    }
}