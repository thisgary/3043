package com.thisgary.lab.module6;

/*
Activity 4
----------
Credit card has credit card number, transaction date, transaction description and transaction amount.
 */
public class CreditCard implements Payment {
    private final String creditCardNumber;
    private final String transactionDate;
    private final String transactionDescription;
    private final double transactionAmount;
    static int currentMonth = 0;
    static double totalAmount = 0;

    public CreditCard(String creditCardNumber, String transactionDate, String transactionDescription, double transactionAmount) {
        this.creditCardNumber = creditCardNumber;
        this.transactionDate = transactionDate;
        this.transactionDescription = transactionDescription;
        this.transactionAmount = transactionAmount;

        int k = transactionDate.indexOf("/") + 1;
        int thisMonth = Integer.parseInt(transactionDate.substring(k, k + 2));
        if (currentMonth != thisMonth) {
            currentMonth = thisMonth;
            totalAmount = transactionAmount;
        } else
            totalAmount += transactionAmount;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    @Override
    public double calculatePayment() {
        return totalAmount;
    }

    public String toString() {
        return "Number: " + creditCardNumber +
                ", Date: " + transactionDate +
                ", Description: " + transactionDescription +
                ", Amount: " + transactionAmount +
                ", Month Total: " + totalAmount;
    }
}
