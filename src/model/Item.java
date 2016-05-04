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
public class Item {
    private int id;
    private String description;
    private double unitPrice;
    private List<ItemDetails> itemDetails;

    /**
     *
     */
    public Item() {
    }

    /**
     *
     * @param id
     * @param description
     * @param unitPrice
     * @param itemDetails
     */
    public Item(int id, String description, double unitPrice, List<ItemDetails> itemDetails) {
        this.id = id;
        this.description = description;
        this.unitPrice = unitPrice;
        this.itemDetails = itemDetails;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the itemDetails
     */
    public List<ItemDetails> getItemDetails() {
        return itemDetails;
    }

    /**
     * @param itemDetails the itemDetails to set
     */
    public void setItemDetails(List<ItemDetails> itemDetails) {
        this.itemDetails = itemDetails;
    }
    
    
    
}
