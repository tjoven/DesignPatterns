package com.example.designpatterns;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
       int[] num = {1,2,43,3};
       num = new int[num.length + 1];
       System.out.println(Arrays.toString(num));
    }
}