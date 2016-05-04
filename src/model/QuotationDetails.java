
package model;

/**
 *
 * @author Omar
 */
public class QuotationDetails {
    private int id;
    private Item item;
    private int quantity;

    /**
     *
     */
    public QuotationDetails() {
    }

    /**
     *
     * @param id
     * @param item
     * @param quantity
     */
    public QuotationDetails(int id, Item item, int quantity) {
        this.id = id;
        this.item = item;
        this.quantity = quantity;
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
     * @return the item
     */
    public Item getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(Item item) {
        this.item = item;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
}
