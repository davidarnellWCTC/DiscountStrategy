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
public class Product {
    // The Product has a Discount
    private String prodId;
    private String name;
    private double unitPrice;
    private double discountAmount;
    
    private DiscountStrategy discount;

    public Product(String prodId, String name, double unitPrice, DiscountStrategy discount) {
        this.prodId = prodId;
        this.name = name;
        this.discount = discount;
        this.unitPrice = unitPrice;
    }
    
    public double getDiscountAmtOffPrice(double qty){
        return discount.getDiscountAmt(unitPrice, qty);
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    
    
    
    
    // Start psvm used for testing in class 9/29/2015
    
//    public static void main(String[] args) {
//        Product product = new Product("A100", "Baseball Hat", 20, new QuantityDiscount(.10,5));
//        
//        double amt = product.getDiscountAmt(2);
//        System.out.println("Expected discount in the amount of 0.0 and got: " + amt);
//    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }
    
}
