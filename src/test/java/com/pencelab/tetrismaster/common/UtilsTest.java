package com.pencelab.tetrismaster.common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

public class UtilsTest {

    @Test
    public void getRandomNumber() {
        int min = 5;
        int max = 10;
        for(int i = 0; i < 10; i++) {
            int random = Utils.getRandomNumber(min, max);
            assertTrue(random >= min && random <= max);
        }
    }
}