package com.company;

public class Main {

    public static void main(String[] args) {
       Gadget lappy = new Laptop(59, 381, "EliteBook G7 870", "30 June 2020");
       System.out.println(lappy.toString());
        Gadget mobile = new Laptop(60, 381, "Galaxy Note 10", "30 June 2020");
        System.out.println(mobile.toString());
        Gadget printer = new Laptop(61, 381, "HP Laserjet", "30 June 2020");
        System.out.println(printer.toString());
        Gadget favlappy = new Laptop(62, 381, "MacBook Pro", "30 June 2021");
        System.out.println(favlappy.toString());
    }
}

abstract class Gadget {
    private int deviceID;
    private int empID;
    private String specs;
    private String allocationDate;

    @Override
    public String toString() {
        return "Gadget{" +
                "deviceID=" + deviceID +
                ", empID=" + empID +
                ", specs='" + specs + '\'' +
                ", allocationDate='" + allocationDate + '\'' +
                '}';
    }

    public String getAllocationDate() {
        return allocationDate;
    }

    public void setAllocationDate(String allocationDate) {
        this.allocationDate = allocationDate;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(int deviceID) {
        this.deviceID = deviceID;
    }

    public Gadget(int deviceID, int empID, String specs, String allocationDate) {
        this.deviceID = deviceID;
        this.empID = empID;
        this.specs = specs;
        this.allocationDate = allocationDate;
    }

    public void allocateGadget() {
        System.out.println("Gadget Allocated");
    }
}

class Laptop extends Gadget {

    public Laptop(int deviceID, int empID, String specs, String allocationDate) {
        super(deviceID, empID, specs, allocationDate);
    }
    public void allocateGadget() {
        System.out.println("Laptop Allocated");
    }
}

class SmartPhone extends Gadget {

    public SmartPhone(int deviceID, int empID, String specs, String allocationDate) {
        super(deviceID, empID, specs, allocationDate);
    }
    public void allocateGadget() {
        System.out.println("SmartPhone Allocated");
    }
}

class Printer extends Gadget {

    public Printer(int deviceID, int empID, String specs, String allocationDate) {
        super(deviceID, empID, specs, allocationDate);
    }
    public void allocateGadget() {
        System.out.println("Printer Allocated");
    }
}
