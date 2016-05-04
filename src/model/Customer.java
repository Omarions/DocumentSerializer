
package model;

/**
 *
 * @author Omar
 */
public class Customer {
    private int id;
    private String name;
    private String address;
    private String tel;
    private String mobile;
    private String fax;
    private String contactName;
    private String email;
    private String website;

    /**
     *
     */
    public Customer() {
    }

    /**
     *
     * @param id
     * @param name
     * @param address
     * @param tel
     * @param mobile
     * @param fax
     * @param contactName
     * @param email
     * @param website
     */
    public Customer(int id, String name, String address, String tel, String mobile, String fax, String contactName, String email, String website) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.tel = tel;
        this.mobile = mobile;
        this.fax = fax;
        this.contactName = contactName;
        this.email = email;
        this.website = website;
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax the fax to set
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return the contactName
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * @param contactName the contactName to set
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        //TODO validate email first.
        this.email = email;
    }

    /**
     * @return the web-site
     */
    public String getWebsite() {
        return website;
    }

    /**
     * @param website the web-site to set
     */
    public void setWebsite(String website) {
        //TODO validate website address first.
        this.website = website;
    }

    @Override
    public String toString() {
        return name;
    }

    /**
     * 
     * @param website the web-site address to validate
     * @return true if the web-site address is valid, otherwise return false.
     */
    private boolean validateWebsite(String website) {
        //TODO validate the website address with regular expression
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @param email hte email to validate
     * @return true if the email is valid, otherwise return false.
     */
    private boolean validateEmail(String email) {
        //TODO validate the email with regular expression
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
