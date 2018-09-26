package com.raiffeisen.lesson3.lesson.calc2;

public class Result {

    private double res;
    private boolean flag;
    private String opType = "";

    public double getRes() {
        return res;
    }

    public boolean isFlag() {
        return flag;
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void setRes(double res) {
        this.res = res;
    }
}
