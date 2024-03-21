package dev.nartov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1(){
        String s = "egg";
        String t = "add";
        System.out.println(new Main().isIsomorphic(s, t));
    }

    @Test
    public void test2(){
        String s = "badc";
        String t = "baba";
        System.out.println(new Main().isIsomorphic(s, t));
    }

    @Test
    public void test3(){
        String s = "paper";
        String t = "title";
        System.out.println(new Main().isIsomorphic(s, t));
    }
}