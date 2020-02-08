package com.epam.example;

public class Main {

    public static void main(String[] args) {
//	    Device device = new Device();
//        System.out.println(device);
//        device = new Device("AAAP01", "LG", 1100.0);
//        System.out.println(device);
        Monitor monitor = new Monitor("MP_A9", "HP",
                8500.0, 1024, 848);
//        System.out.println(monitor);
//        Adapter adapter = new Adapter("PP005", "AD",
//                            4562.0, 100, "823_a");
//        System.out.println(adapter);

        Device[] devices = {
                new Device("AAAP01", "LG", 1100.0),
                new Monitor("MP_A9", "HP", 8500.0, 1024, 848),
                new Device("AAAP01", "LG", 1100.0),
                new Adapter("PP005", "AD",4562.0, 100, "823_a")
        };

        for (Device obj : devices) {
            System.out.println(obj + " (Hash code: " + obj.hashCode() + ")");
        }

        System.out.println("Equals -> " + devices[0].equals(devices[2]) );
        System.out.println("Equals monitors -> " +
                devices[1].equals(monitor));
    }
}
