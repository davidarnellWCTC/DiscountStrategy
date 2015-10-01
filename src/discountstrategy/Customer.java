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
public class Customer implements ICustomer {
    
    private String custId;
    private String customerName;

    public Customer(String customerNumber, String customerName) {
        this.custId = customerNumber;
        this.customerName = customerName;
    }
    
    
    public String getCustId(){
        return custId;
    }
    
    
    
    
}
