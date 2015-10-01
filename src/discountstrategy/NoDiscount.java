/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author darnell
 */
public class NoDiscount implements DiscountStrategy {
    private double discountRate;
    
//    public NoDiscount(double discountRate){
//        this.discountRate = discountRate;
//    }
    
    public NoDiscount (){
        
    }
    
        
    public double getDiscountAmt(double unitPrice, double qty){        
        return 0;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }    
    
}
