package org.example.discountcalculator;

public class Discount {
    private double amount;
    private DiscountType type;

    public Discount( double amount,DiscountType type){
        this.amount =amount;
        this.type =type;

    }

    public double getAmount(){
        return amount;
    }

    public DiscountType getType(){
        return type;
    }

}
