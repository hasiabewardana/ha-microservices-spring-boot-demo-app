package com.example.ha_microservices_spring_boot_demo_app.mockito_demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SomeBusinessImplMockTest {

    @Test
    void findTheGreatestFromAllData_basicScenario() {
        DataService dataServiceMock =  mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{20, 15, 3});
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
        int result = someBusiness.findTheGreatestFromAllData();
        assertEquals(20, result);
    }

    @Test
    void findTheGreatestFromAllData_withOneValue() {
        DataService dataServiceMock =  mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{35});
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
        int result = someBusiness.findTheGreatestFromAllData();
        assertEquals(35, result);
    }
}