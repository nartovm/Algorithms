package dev.nartov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testSufficientCharacters() {
        Solution solution = new Solution();
        assertTrue(solution.canConstruct("abc", "aabbcc"));
    }

    @Test
    void testInsufficientCharacters() {
        Solution solution = new Solution();
        assertFalse(solution.canConstruct("abcd", "aabbcc"));
    }

    @Test
    void testExactMatch() {
        Solution solution = new Solution();
        assertTrue(solution.canConstruct("abc", "abc"));
    }

    @Test
    void testEmptyStrings() {
        Solution solution = new Solution();
        assertTrue(solution.canConstruct("", ""));
    }

    @Test
    void testEmptyRansomNote() {
        Solution solution = new Solution();
        assertTrue(solution.canConstruct("", "aabbcc"));
    }

//    @Test
//    void testSpecialCharacters() {
//        Solution solution = new Solution();
//        assertTrue(solution.canConstruct("!@#", "!@#"));
//    }
}