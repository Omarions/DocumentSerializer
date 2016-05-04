/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Omar
 */
public class PurchaseOrder {
    private String POId;
    private Customer customer;
    private List<PODetails> details;
    private double taxes;
    private String comments;
    private boolean confirmed;

    /**
     *
     */
    public PurchaseOrder() {
    }

    /**
     *
     * @param POId
     * @param customer
     * @param details
     * @param taxes
     * @param comments
     * @param confirmed
     */
    public PurchaseOrder(String POId, Customer customer, List<PODetails> details, double taxes, String comments, boolean confirmed) {
        this.POId = POId;
        this.customer = customer;
        this.details = details;
        this.taxes = taxes;
        this.comments = comments;
        this.confirmed = confirmed;
    }

    /**
     * @return the POId
     */
    public String getPOId() {
        return POId;
    }

    /**
     * @param POId the POId to set
     */
    public void setPOId(String POId) {
        this.POId = POId;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the details
     */
    public List<PODetails> getDetails() {
        return details;
    }

    /**
     * @param details the details to set
     */
    public void setDetails(List<PODetails> details) {
        this.details = details;
    }

    /**
     * @return the taxes
     */
    public double getTaxes() {
        return taxes;
    }

    /**
     * @param taxes the taxes to set
     */
    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * @return the confirmed
     */
    public boolean isConfirmed() {
        return confirmed;
    }

    /**
     * @param confirmed the confirmed to set
     */
    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }
    
    
    
}
