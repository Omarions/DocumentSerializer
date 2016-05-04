package model;

import java.util.List;

/**
 * Represent User in DB
 * @author Omar Fawzy
 */
public class User {
    private int id;
    private String username;
    private String password;
    private String name;
    private String title;
    private String signaturePath;
    private List<Permission> permissions;

    /**
     *
     */
    public User() {
    }

    /**
     *
     * @param id
     * @param username
     * @param password
     * @param name
     * @param title
     * @param signaturePath
     */
    public User(int id, String username, String password, String name, String title, String signaturePath) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.title = title;
        this.signaturePath = signaturePath;
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
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
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
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the signaturePath
     */
    public String getSignaturePath() {
        return signaturePath;
    }

    /**
     * @param signaturePath the signaturePath to set
     */
    public void setSignaturePath(String signaturePath) {
        this.signaturePath = signaturePath;
    }
    
    /**
     * @return the permissions
     */
    public List<Permission> getPermissions() {
        return permissions;
    }

    /**
     * @param permissions the permissions to set
     */
    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return name + "\r\n" + title;
    }

    @Override
    public boolean equals(Object obj) {
        return this.username.equals(((User)obj).username);
    }
   
    
}
