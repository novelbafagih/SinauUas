package com.company;

public class Computer {
    private String name;
    private String cpu;
    private int clockSpeedInGhz;
    private int ram;
    private int disk;

    public Computer(String name, String cpu, int clockSpeedInGhz, int ram, int disk) {
        this.name = name;
        this.cpu = cpu;
        this.clockSpeedInGhz = clockSpeedInGhz;
        this.ram = ram;
        this.disk = disk;
    }

    public void turnOn(){
        System.out.println("The computer is Turning On....");
        System.out.println("The computer is Running   ....");
        System.out.println("Computer Name:\t\t\t" + name);
        System.out.println("Computer Cpu:\t\t\t" + cpu);
        System.out.println("Computer Clock Speed:\t" + clockSpeedInGhz +"GHZ");
        System.out.println("Computer Ram:\t\t\t" + ram + "GB");
        System.out.println("Computer Disk:\t\t\t" + disk +"GB");
    }
}
