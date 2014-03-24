package com.amnon.crazypic.test;

public class ProgressService {
    public ProgressService() {

    }
    
    public Integer getCurrentProgerss(double current, double max) {
        Integer i=(int)((current / max) * 100) ;
        return i;
    }
}
