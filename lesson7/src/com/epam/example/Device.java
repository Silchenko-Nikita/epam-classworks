package com.epam.example;

public class Device {
    private String serialNumber;
    private String manufacturer;
    private double price;

    public Device() {
    }

    public Device(String serialNumber, String manufacturer, double price) {
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + serialNumber.hashCode();
        result = 31 * result + serialNumber.hashCode();
        long priceLongBits = Double.doubleToLongBits(price);
        result = 31 * result + (int) (priceLongBits ^ (priceLongBits >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Device other = (Device) obj;

        if (hashCode() != other.hashCode()) {
            return false;
        }

        if (Double.compare(this.price, other.price) != 0) {
            return false;
        }
        if (!this.serialNumber.equals(other.serialNumber)) {
            return false;
        }

        return this.manufacturer.equals(other.manufacturer);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                ": serialNumber=" + serialNumber  +
                ", manufacturer=" + manufacturer +
                ", price=" + price;
    }


}
