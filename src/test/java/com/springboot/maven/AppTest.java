package com.springboot.maven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void addTest() {
        App app = new App();
        int result = app.add(2, 3);
        Assertions.assertEquals(5, result);
        System.out.println("✅ Test executed successfully!");
    }
}
