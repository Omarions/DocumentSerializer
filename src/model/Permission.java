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
public class Permission {
    private int id;
    private String tableName;
    private String fieldName;
    private String allowedOperation;

    /**
     *
     */
    public Permission() {
    }

    /**
     *
     * @param id
     * @param tableName
     * @param fieldName
     * @param allowedOperation
     */
    public Permission(int id, String tableName, String fieldName, String allowedOperation) {
        this.id = id;
        this.tableName = tableName;
        this.fieldName = fieldName;
        this.allowedOperation = allowedOperation;
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
     * @return the tableName
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName the tableName to set
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * @return the fieldName
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * @param fieldName the fieldName to set
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * @return the allowedOperation
     */
    public String getAllowedOperation() {
        return allowedOperation;
    }

    /**
     * @param allowedOperation the allowedOperation to set
     */
    public void setAllowedOperation(String allowedOperation) {
        this.allowedOperation = allowedOperation;
    }

    @Override
    public String toString() {
        return "Permission[id=> " + id + ", Table=> " + tableName + ", Field=> " 
                + fieldName + ", Allwoed Operation=> " + allowedOperation + "]";
    }   

    @Override
    public boolean equals(Object obj) {
        return this.id ==((Permission)obj).id;
    }
    
    

}
