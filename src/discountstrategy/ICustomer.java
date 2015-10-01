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
public interface ICustomer {
        
    public abstract String getCustId();
    public abstract void setCustId(String custId);
    
    public abstract String getCustName();
    public abstract void setCustName(String custName);
    
}
