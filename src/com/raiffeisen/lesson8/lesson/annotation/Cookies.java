package com.raiffeisen.lesson8.lesson.annotation;

@ControlledObject(name = "bisc")
public class Cookies {

    @StartObject
    public void createCookie(){}

    @StopObject
    public void stopCookie(){}

}
