package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        String s = "pwwkew";
        System.out.println(new Main().lengthOfLongestSubstring(s));
    }

    @Test
    public void test2() {
        String s = "";
        System.out.println(new Main().lengthOfLongestSubstring(s));
    }

    @Test
    public void test3() {
        String s = " ";
        System.out.println(new Main().lengthOfLongestSubstring(s));
    }
}