package com.littleyellow.update;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {

        float a =10;
        float b = 3;
        try {
            String str = String.format("%.2f%c",a/b,'%');
            System.out.print(str);
        } catch (Exception e) {
            System.out.print("-----------");
        }


        assertEquals(4, 2 + 2);
    }
}