package com.thisgary.lab.module2;

// Activity 5
public class TicketSale {
    private final double pricePerA_Seat;
    private final double pricePerB_Seat;
    private final double pricePerC_Seat;
    private int numberOfA_Seats;
    private int numberOfB_Seats;
    private int numberOfC_Seats;
    private double totalSales;

    public TicketSale() {
        this.pricePerA_Seat = 0;
        this.pricePerB_Seat = 0;
        this.pricePerC_Seat = 0;
    }

    public TicketSale(double pricePerA_Seat, double pricePerB_Seat, double pricePerC_Seat) {
        this.pricePerA_Seat = pricePerA_Seat;
        this.pricePerB_Seat = pricePerB_Seat;
        this.pricePerC_Seat = pricePerC_Seat;
    }

    public double getPricePerA_Seat() {
        return this.pricePerA_Seat;
    }

    public double getPricePerB_Seat() {
        return this.pricePerB_Seat;
    }

    public double getPricePerC_Seat() {
        return this.pricePerC_Seat;
    }

    public int getNumberOfA_Seats() {
        return this.numberOfA_Seats;
    }

    public int getNumberOfB_Seats() {
        return this.numberOfB_Seats;
    }

    public int getNumberOfC_Seats() {
        return this.numberOfC_Seats;
    }

    public void setNumberOfA_Seats(int numberOfA_Seats) {
        this.numberOfA_Seats = numberOfA_Seats;
    }

    public void setNumberOfB_Seats(int numberOfB_Seats) {
        this.numberOfB_Seats = numberOfB_Seats;
    }

    public void setNumberOfC_Seats(int numberOfC_Seats) {
        this.numberOfC_Seats = numberOfC_Seats;
    }

    public void calculateTotalSales() {
        this.totalSales = (this.numberOfA_Seats * this.pricePerA_Seat) +
                (this.numberOfB_Seats * this.pricePerB_Seat) +
                (this.numberOfC_Seats * this.pricePerC_Seat);
    }

    public void calculateTotalSales(int numberOfA_Seats, int numberOfB_Seats, int numberOfC_Seats) {
        this.numberOfA_Seats = numberOfA_Seats;
        this.numberOfB_Seats = numberOfB_Seats;
        this.numberOfC_Seats = numberOfC_Seats;
        this.calculateTotalSales();
    }

    public double getTotalSales() {
        return this.totalSales;
    }

    public void overview() {
        System.out.printf("Price of A: %.2f\n", this.pricePerA_Seat);
        System.out.printf("Price of B: %.2f\n", this.pricePerB_Seat);
        System.out.printf("Price of C: %.2f\n\n", this.pricePerC_Seat);
        System.out.printf("Seats of A: %d\n", this.numberOfA_Seats);
        System.out.printf("Seats of B: %d\n", this.numberOfB_Seats);
        System.out.printf("Seats of C: %d\n\n", this.numberOfC_Seats);
        System.out.printf("Total sales: %.2f\n\n", this.totalSales);
    }
}
