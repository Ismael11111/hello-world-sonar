package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testSayHello() {
        App app = new App();
        String result = app.sayHello();
        assertEquals("Hello, world!", result);
    }
}
