package model;

import java.time.LocalDateTime;

/**
 * Represent Document in DB
 * @author Omar Fawzy
 */
public class Document {
    private String number;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private Type type;
    private User user;

    /**
     *
     */
    public Document() {
    }

    /**
     *
     * @param number
     * @param createdDate
     * @param modifiedDate
     * @param type
     * @param user
     */
    public Document(String number, LocalDateTime createdDate, LocalDateTime modifiedDate, Type type, User user) {
        this.number = number;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.type = type;
        this.user = user;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the id to set
     */
    public void setId(String number) {
        this.number = number;
    }

    /**
     * @return the createdDate
     */
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * @return the modifiedDate
     */
    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    /**
     * @param modifiedDate the modifiedDate to set
     */
    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * @return the type
     */
    public Type getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return number;
    }
    
    
    
}
