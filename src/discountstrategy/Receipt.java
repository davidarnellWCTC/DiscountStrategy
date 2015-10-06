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
public class Receipt {
    
    // This class will be the object that gets assembled and put out by the 
    // register
    
    // The receipt doesn't have products or discounts, it has LineItems.
    LineItem lineItem;
    
    // Message at the top of each receipt
    private String Message = "Thank you for Shopping at Kohls";
    
    // information on the Customer retreived from the Customer Object
    private String custID, custName;
    
    // The receipt number is passed into the Receipt object when the receipt is created
    private int receiptNo;
    
    // Constructor for the Receipt object
    // When the receipt is created a new receipt number is issued
    public Receipt (int receiptNo){
        this.receiptNo = receiptNo;
        buildReceipt();
    }
    
    public void buildReceipt(){
        
    }
            
    
    // Receipt will output:
    // Message → Thank you for shoing at Kohls
    // Customer Name → Customer Name retrieved from Customer Object
    // Date of Sale → Some kind of date getting and formatting method
    // Receipt No. → The receipt will need to keep a running total of all the 
    //      Receipt objects made. This will be calculated at the register instead
    //      of at the Receipt object since its the registers job to keep track
    // Header → "ID" "Item" "Price" "Qty" "Subtotal" "Discount"
    // Line Item → Line item created with the string values for each of the
    //      things listed above. Line Item stored in an array and each array 
    //      Will be printed on a new line
    // Net Total → The Net Total (before discounts) is displayed in its own colum
    // Total Saved → The total Discounts from each product are added up
    // Total Due → Simple calculation f the Net Total - Total Saved
    
    // Method to build and print Header
    // Method to run through the line item array and print that all out
    // Method to build and print the totals
    
    
    
//    private void addToArray(final LineItem item) {
//        // needs validation
//        LineItem[] tempItems = new LineItem[lineItems.length + 1];
//        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
//        tempItems[lineItems.length] = item;
//        lineItems = tempItems;
//    }
    
}
