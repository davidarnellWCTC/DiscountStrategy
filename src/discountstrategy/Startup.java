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
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //int receiptStartingNumber = 1;
        
        // Create new Register and initialize receipt number
        // The receipt number starts out at 0
        // When a new receipt is made in the register, the number increases
        Register register = new Register();
        
        register.newTransaction("100");
        register.addProductToSale("A101", 5);
        register.addProductToSale("B205", 3);
        register.completeTransation();
        
        
//        private Product[] products = {
//        new Product("A101", "MLB Brewer's Hat ", 19.95, new PercentOffDiscount(0.15)),
//        new Product("B205", "Men's Dress Shirt", 35.50, new QuantityDiscount(.10,5)),
//        new Product("C222", "Women's Socks    ", 9.50, new NoDiscount())
//    };
        
        // create a bunch of sales to pass into the register for transactions.
        
//        DatabaseAccessStrategy[] transactions = new {
//        
//    }
        
        // Run Register transaction/sales until no more customers
        // for each customer run new transaction
        
        // end when out of customers
        
    }
    
}
