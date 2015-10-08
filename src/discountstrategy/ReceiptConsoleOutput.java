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
   
//    Register register;
//    
//    public ReceiptConsoleOutput(Register r){
//        this.register = r;
//    }
    
//    public void buildReceipt(){
//        printHeaderOnReceipt();        
//    }
    
    public void printHeaderOnReceipt(String message, String custName, int recieptNo){
        
        //String time = get time toString();
        //String date = get date toString();
        
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
