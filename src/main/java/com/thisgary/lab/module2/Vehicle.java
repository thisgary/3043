package com.thisgary.lab.module2;

// Activity 2
public class Vehicle {
    private String VehicleType;
    private int ChassisNo;
    private int ProductionYear;

    public Vehicle() {
        System.out.println("Vehicle Information");
    }

    public Vehicle(String VehicleType, int ChassisNo) {
        this.VehicleType = VehicleType;
        this.ChassisNo = ChassisNo;
    }

    public Vehicle(String VehicleType, int ChassisNo, int ProductionYear) {
        this(VehicleType, ChassisNo);
        this.ProductionYear = ProductionYear;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public int getChassisNo() {
        return ChassisNo;
    }

    public int getProductionYear() {
        return ProductionYear;
    }

    public void setVehicleType(String VehicleType) {
        this.VehicleType = VehicleType;
    }

    public void setChassisNo(int ChassisNo) {
        this.ChassisNo = ChassisNo;
    }

    public void setProductionYear(int ProductionYear) {
        this.ProductionYear = ProductionYear;
    }

    public void overview() {
        System.out.println("Vehicle Type: " + this.VehicleType);
        System.out.println("Chassis No: " + this.ChassisNo);
        System.out.println("Production Year: " + this.ProductionYear + "\n");
    }
}
