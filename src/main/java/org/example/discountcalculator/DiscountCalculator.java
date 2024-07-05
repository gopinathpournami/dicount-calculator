package org.example.discountcalculator;

public class DiscountCalculator {
    public double calculateNatPayableAmount(User user,Bill bill){
        double totalDiscount = 0;
        double nonGroceryAmount =bill.getTotalAmount()-bill.getGroceryAmount();

        // percentage discounts
        if(user.isEmployee()){
            totalDiscount += nonGroceryAmount * .3;

        }else if(user.isAffiliate()){
            totalDiscount += nonGroceryAmount * .1;
        }else if(user.isLongTermCustomer()){
            totalDiscount += nonGroceryAmount * .05;
        }

        //fixed amount :discount for 100
        totalDiscount  += (bill.getTotalAmount()/100 )*5;
        //net payable
        double netPayableAmount = bill.getTotalAmount()-totalDiscount;
        return netPayableAmount;
    }
}
