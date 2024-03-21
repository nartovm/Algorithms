package dev.nartov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1(){
        System.out.println(new Main().isHappy(19));
    }

    @Test
    public void test2(){
        System.out.println(new Main().isHappy(2));
    }

}