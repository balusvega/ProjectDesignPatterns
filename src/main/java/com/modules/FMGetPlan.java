package com.modules;

public class FMGetPlan {

    public FMthdPlan getPlan(String planType){
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("Plan 1")) {
            return new FMPlan1();
        }
        else if(planType.equalsIgnoreCase("Plan 2")){
            return new FMPlan2();
        }
        else if(planType.equalsIgnoreCase("Plan 3")) {
            return new FMPlan3();
        }
        return null;
    }
}
