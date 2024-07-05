package org.example.discountcalculator;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    private double totalamount;
    private double groceryAmount;
    private List<Discount> discounts;

    public Bill( double totalamount,double groceryAmount){
        this.totalamount =totalamount;
        this.groceryAmount =groceryAmount;
        this.discounts = new ArrayList<>();



    }

    public double getTotalAmount(){
        return totalamount;
    }

    public double getGroceryAmount(){
        return groceryAmount;
    }

    public List<Discount> getiscounts(){
        return discounts;
    }

    public void addDiscount(Discount discount){
        discounts.add(discount);
    }
}
