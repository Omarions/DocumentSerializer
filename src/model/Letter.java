/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Omar
 */
public class Letter {
    private int id;
    private String to1;
    private String to2;
    private String body;
    private String comments;
    private boolean confirmed;

    /**
     *
     */
    public Letter() {
    }

    /**
     *
     * @param id
     * @param to1
     * @param to2
     * @param body
     * @param comments
     * @param confirmed
     */
    public Letter(int id, String to1, String to2, String body, String comments, boolean confirmed) {
        this.id = id;
        this.to1 = to1;
        this.to2 = to2;
        this.body = body;
        this.comments = comments;
        this.confirmed = confirmed;
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
     * @return the to1
     */
    public String getTo1() {
        return to1;
    }

    /**
     * @param to1 the to1 to set
     */
    public void setTo1(String to1) {
        this.to1 = to1;
    }

    /**
     * @return the to2
     */
    public String getTo2() {
        return to2;
    }

    /**
     * @param to2 the to2 to set
     */
    public void setTo2(String to2) {
        this.to2 = to2;
    }

    /**
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body the body to set
     */
    public void setBody(String body) {
        this.body = body;
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
