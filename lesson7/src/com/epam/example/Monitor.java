package com.epam.example;

public class Monitor extends Device {
    private int x;
    private int y;

    public Monitor(String serialNumber, String manufacturer,
                   double price, int x, int y) {
        super(serialNumber, manufacturer, price);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Monitor other = (Monitor) obj;

        if (hashCode() != other.hashCode()) {
            return false;
        }

        return x == other.x && y == other.y;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", x=" + x + ", y=" + y;
    }
}
