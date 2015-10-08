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
public class ReceiptConsoleOutput implements ReceiptOutputStrategy {
    
    DataAccessStrategy db = new FakeDatabase();
    
    private double netTotal;
    private double totalSaved;
    private double totalDue;
    
    ICustomer customer;
    private String custName;
//    Register register;
//    
//    public ReceiptConsoleOutput(Register r){
//        this.register = r;
//    }
    
//    public void buildReceipt(){
//        printHeaderOnReceipt();        
//    }
    
    public void printHeaderOnReceipt(String message, String custId, int recieptNo){
        
        //String time = get time toString();
        //String date = get date toString();
        
        this.customer = db.findCustomer(custId);
        
        this.custName = customer.getCustName();
        
        System.out.println(message);//print message
        System.out.println();
        System.out.println("Sold to: " + custName);
        System.out.println("Date of Sale: mm/dd/yy at xx:xx am/pm" /*get date*/);
        // figure out how to format line item display
        System.out.println("ID     Item         Price     Quantity     Subtotal     Discount    Total");
    }
    
    public void printLineItemsOnReciept(LineItem lineItems[]){
        String prodId = "";
        int qty = 0;
        for (LineItem lineItem : lineItems) {
            System.out.println(lineItem.getProdId() + "     " + lineItem.getName() 
            + lineItem.getUnitPrice() + "     " + lineItem.getQty() + "     "
            + lineItem.getSubTotal() + "     " + lineItem.getDiscountAmount() + "     " 
            + lineItem.getItemTotal());
        }
    }
    
    public void printFooterOnReceipt(String receiptFooterMessage){
//        String receiptFooterMessage = receiptFooterMessage;

        System.out.println(receiptFooterMessage);
    }
    
}
