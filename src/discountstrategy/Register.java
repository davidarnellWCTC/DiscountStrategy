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
public class Register {
    
    int receiptNo;
    
    public Register(){        
        // If a new register object is being made I will assume a new receipt
        // number will be used. Getters and setters are available if the starting
        // receipt number should change.        
        receiptNo = 1;
    }
    
    // Start a new transaction and make new Receipt Object 
    public void startTransaction(){
        Receipt receipt = new Receipt(receiptNo);
    }
    
    
    
    // Get Customer Info and Add to receipt
    
    // Scann new Item and add it to the Line Item Array
    
    // End sale
    
    // Print Receipt
    
    // Check for a new sale

    public int getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(int receiptNo) {
        this.receiptNo = receiptNo;
    }
    
    
    
}
