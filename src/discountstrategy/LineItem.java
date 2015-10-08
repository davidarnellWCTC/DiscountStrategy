/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author David
 */
public class LineItem {
    // The LineItem has the product data
    private String prodId;
    private String name;
    private double qty;
    private double unitPrice;
    private double subTotal;
    private double discountAmount;
    private double itemTotal;
    
    // The line item has a product
    // but the product has the discount
    private Product product;
    private DataAccessStrategy db = new FakeDatabase();
    
    public LineItem(String prodId, double qty){
        
        //db = new FakeDatabase();
        
        //this.product = product;
        this.prodId = prodId;
        this.qty = qty;
        
        product = db.findProduct(prodId);
        
        this.unitPrice = product.getUnitPrice();   
        this.name = product.getName();
        discountAmount = product.getDiscountAmtOffPrice(qty);
        itemTotal = (qty * unitPrice) - discountAmount;
    }    
    //discountAmount = product.getDiscountAmt(qty);
    
    // Method to get line item
    
    public void setName(){
        name = product.getName();
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

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public double getItemTotal() {
        return itemTotal;
    }

    public void setItemTotal(double itemTotal) {
        this.itemTotal = itemTotal;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
}
