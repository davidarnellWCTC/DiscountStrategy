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
    
    public void printHeaderOnReceipt(){
        
        //String time = get time toString();
        //String date = get date toString();
        
        System.out.println();//print message
        System.out.println();
        //System.out.println("Sold to: " + custName);
        System.out.println("Date of Sale: mm/dd/yy at xx:xx am/pm" /*get date*/);
        // figure out how to format line item display
        System.out.println("ID     Item         Price     Quantity     Subtotal     Discount    Total");
    }
    
    public void printLineItemsOnReciept(){
        
    }
    
//    public void printFooterOnReceipt(){
//        System.out.println(receiptFooterMessage);
//    }
    
}
