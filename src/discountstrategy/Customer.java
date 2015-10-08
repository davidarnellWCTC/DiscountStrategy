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
    private String custName;

    public Customer(String customerNumber, String custName) {
        this.custId = customerNumber;
        this.custName = custName;
    }

//    public String getCustId(){
//        return custId;
//    }
    @Override
    public String getCustId() {
        return custId;
    }

    @Override
    public void setCustId(String custId) {
        this.custId = custId;
    }

    @Override
    public String getCustName() {
        return custName;
    }

    @Override
    public void setCustName(String custName) {
        this.custName = custName;
    }

    //
    //
    //
    //
}
