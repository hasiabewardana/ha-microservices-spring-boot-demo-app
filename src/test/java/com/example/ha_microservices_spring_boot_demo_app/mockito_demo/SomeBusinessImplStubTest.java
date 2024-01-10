package com.example.ha_microservices_spring_boot_demo_app.mockito_demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SomeBusinessImplStubTest {

    @Test
    void findTheGreatestFromAllData_basicScenario() {
        DataService dataService = new DataServiceStub1();
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataService);
        int result = someBusiness.findTheGreatestFromAllData();
        assertEquals(20, result);
    }

    @Test
    void findTheGreatestFromAllData_withOneValue() {
        DataService dataService = new DataServiceStub2();
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataService);
        int result = someBusiness.findTheGreatestFromAllData();
        assertEquals(35, result);
    }
}

class DataServiceStub1 implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[]{20, 15, 3};
    }
}

class DataServiceStub2 implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[]{35};
    }
}