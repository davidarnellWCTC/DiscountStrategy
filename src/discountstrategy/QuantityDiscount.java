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
public class QuantityDiscount implements DiscountStrategy {
    private double discountRate;
    private double minQty;

    
    public QuantityDiscount(double discountRate, double minQty){
        this.discountRate = discountRate;
        this.minQty = minQty;
    }
        
    public double getDiscountAmt(double unitPrice, double qty) {
        if (qty >= minQty) {
            return unitPrice * qty * discountRate;
        } else {
            return 0;
        }
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }    
    
    public double getMinQty() {
        return minQty;
    }

    public void setMinQty(double minQty) {
        this.minQty = minQty;
    }
    
}
