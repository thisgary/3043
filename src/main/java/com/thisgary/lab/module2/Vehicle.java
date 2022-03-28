package com.thisgary.lab.module2;

// Activity 2
public class Vehicle {
    private String vehicleType;
    private int chassisNo, productionYear;

    public Vehicle() { // Don't ask
        System.out.println("Vehicle Information");
    }

    public Vehicle(String vehicleType, int chassisNo) {
        this.vehicleType = vehicleType;
        this.chassisNo = chassisNo;
    }

    public Vehicle(String vehicleType, int chassisNo, int productionYear) {
        this(vehicleType, chassisNo);
        this.productionYear = productionYear;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public int getChassisNo() {
        return chassisNo;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setChassisNo(int chassisNo) {
        this.chassisNo = chassisNo;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void overview() {
        System.out.println("Vehicle Type   : " + this.vehicleType);
        System.out.println("Chassis No     : " + this.chassisNo);
        System.out.println("Production Year: " + this.productionYear + "\n");
    }
}
