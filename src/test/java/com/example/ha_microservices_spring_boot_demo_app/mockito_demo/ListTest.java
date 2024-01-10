package com.example.ha_microservices_spring_boot_demo_app.mockito_demo;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {
    @Test
    void simpleTest() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(3);
        assertEquals(3, listMock.size());
        assertEquals(3, listMock.size());
        assertEquals(3, listMock.size());
    }

    @Test
    void multipleReturnsTest() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(3).thenReturn(1);
        assertEquals(3, listMock.size());
        assertEquals(1, listMock.size());
        assertEquals(1, listMock.size());
    }

    @Test
    void specificParametersTest() {
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("SomeString");
        assertEquals("SomeString", listMock.get(0));
        assertNull(listMock.get(1));
    }

    @Test
    void genericParametersTest() {
        List listMock = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn("SomeString");
        assertEquals("SomeString", listMock.get(0));
        assertEquals("SomeString", listMock.get(1));
    }
}
