package dev.nartov;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testCase(){
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        System.out.println(new Main().findDisappearedNumbers(nums));
    }
    @Test
    public void testCase2(){
        int[] nums = readIntsFromFile("src/test/resources/case1");
        System.out.println(new Main().findDisappearedNumbers(nums));
    }

    @Test
    public void testCase3(){
        int[] nums = new int[]{1,1};
        System.out.println(new Main().findDisappearedNumbers(nums));
    }
    @Test
    public void testCase4(){
        int[] nums = new int[]{2,2};
        System.out.println(new Main().findDisappearedNumbers(nums));
    }

    public static int[] readIntsFromFile(String filePath) {
        String content = null;
        try {
            content = Files.readString(Path.of(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Arrays.stream(content.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}