package com.raiffeisen.lesson8.lesson.annotation;

@ControlledObject(name = "bisc")
public class Cookies {

    @ControlledObject(name = "Color", def = 1)
    public String color;

    @StartObject
    public void createCookie(){}

    @StopObject
    public void stopCookie(){}

}
