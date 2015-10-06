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
    private String receiptHeaderMessage = "Thank you for Shopping at Kohls";
    private String receiptFooterMessage = "Thank you for shopping, please come again";
    
    // information on the Customer retreived from the Customer Object
    private String custID, custName;
    
    // The receipt number is passed into the Receipt object when the receipt is created
    private int receiptNo;
    
    // the receipt has these values, not the products or line items
    private double netTotal;
    private double totalSaved;
    private double totalDue;
    
    // Constructor for the Receipt object
    // When the receipt is created a new receipt number is issued
    public Receipt (int receiptNo, String custID, String custName){
        this.custID = custID;
        this.custName = custName;
        this.receiptNo = receiptNo;
        buildReceipt();
        
        // testing receipt output
        testReceipt();
    }
    
    public void buildReceipt(){
        printHeaderOnReceipt();
        
        
    }
    
    public void printHeaderOnReceipt(){
        
        //String time = get time toString();
        //String date = get date toString();
        
        System.out.println(receiptHeaderMessage);
        System.out.println();
        System.out.println("Sold to: " + custName);
        System.out.println("Date of Sale: mm/dd/yy at xx:xx am/pm" /*get date*/);
        // figure out how to format line item display
        System.out.println("ID     Item         Price     Quantity     Subtotal     Discount    Total");
    }
    
    public void printLineItemsOnReciept(){
        
    }
    
    public void printFooterOnReceipt(){
        System.out.println(receiptFooterMessage);
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
    
    public void testReceipt(){
        
    }
    
}
