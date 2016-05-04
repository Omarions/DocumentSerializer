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
public class Bank {
    private int id;
    private String name;
    private String currency;
    private String accountNo;
    private String swiftCode;
    private String Comments;

    /**
     *
     */
    public Bank() {
    }

    /**
     *
     * @param id
     * @param name
     * @param currency
     * @param accountNo
     * @param swiftCode
     * @param Comments
     */
    public Bank(int id, String name, String currency, String accountNo, String swiftCode, String Comments) {
        this.id = id;
        this.name = name;
        this.currency = currency;
        this.accountNo = accountNo;
        this.swiftCode = swiftCode;
        this.Comments = Comments;
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
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return the accountNo
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * @param accountNo the accountNo to set
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    /**
     * @return the swiftCode
     */
    public String getSwiftCode() {
        return swiftCode;
    }

    /**
     * @param swiftCode the swiftCode to set
     */
    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

    /**
     * @return the Comments
     */
    public String getComments() {
        return Comments;
    }

    /**
     * @param Comments the Comments to set
     */
    public void setComments(String Comments) {
        this.Comments = Comments;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        return this.id == ((Bank)obj).id;
    }
    
    
    
}
