package com.example.ha_microservices_spring_boot_demo_app.mockito_demo;

public class SomeBusinessImpl {
    DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int findTheGreatestFromAllData(){
        int[] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;

        for(int value: data){
            if(value > greatest)
                greatest = value;
        }

        return greatest;
    }
}
