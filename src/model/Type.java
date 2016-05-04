package model;

/**
 *
 * @author Omar
 */
public class Type {
    private int id;
    private String name;
    private String comments;

    /**
     *
     */
    public Type() {
    }

    /**
     *
     * @param id
     * @param name
     * @param comments
     */
    public Type(int id, String name, String comments) {
        this.id = id;
        this.name = name;
        this.comments = comments;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return name;
    }
    
    
}
