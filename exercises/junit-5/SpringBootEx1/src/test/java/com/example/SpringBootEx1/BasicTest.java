package com.example.SpringBootEx1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicTest{

    @Test
    void shouldNumbers(){
        int result = 10 + 20;

        assertEquals(30, result);
    }
}