package com.raiffeisen.lesson3.lesson.calc2;

public class Operationist {

    private double x;
    private double y;
    private Result res;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Operationist() {
        this.x = 0;
        this.y = 0;
        this.res = new Result();
    }

    public Operationist(double x, double y) {
        this();
        this.x = x;
        this.y = y;
    }

    public Result getSum() {
        doCalc(x + y, true, "SUM");
        return this.res;
    }

    private void doCalc(double v, boolean b, String sum) {
        this.res.setRes(v);
        res.setFlag(b);
        res.setOpType(sum);
    }

    public Result getDiv() {

        if (y == 0) {
            doCalc(-1, false, "DIV");
        } else {
            doCalc(x / y, true, "DIV");
        }
        return res;
    }
}