
package model;

/**
 *
 * @author Omar
 */
public class PODetails {
    private int id;
    private Item item;
    private int quantity;

    /**
     *
     */
    public PODetails() {
    }

    /**
     *
     * @param id
     * @param item
     * @param quantity
     */
    public PODetails(int id, Item item, int quantity) {
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
     * @return the items
     */
    public Item getItem() {
        return item;
    }

    /**
     * @param item
     */
    public void setItems(Item item) {
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
