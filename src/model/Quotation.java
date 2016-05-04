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
public class Quotation {
    private String number;
    private Customer customer;
    private List<QuotationDetails> details;
    private String comments;
    private Bank bank;
    private boolean confirmed;

    /**
     *
     */
    public Quotation() {
    }

    /**
     *
     * @param number
     * @param customer
     * @param details
     * @param comments
     * @param bank
     * @param confirmed
     */
    public Quotation(String number, Customer customer, List<QuotationDetails> details, String comments, Bank bank, boolean confirmed) {
        this.number = number;
        this.customer = customer;
        this.details = details;
        this.comments = comments;
        this.bank = bank;
        this.confirmed = confirmed;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
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
    public List<QuotationDetails> getDetails() {
        return details;
    }

    /**
     * @param details the details to set
     */
    public void setDetails(List<QuotationDetails> details) {
        this.details = details;
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
     * @return the bank
     */
    public Bank getBank() {
        return bank;
    }

    /**
     * @param bank the bank to set
     */
    public void setBank(Bank bank) {
        this.bank = bank;
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
