/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DbUtil.DbUtil;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Bank;
import model.Permission;
import model.User;

/**
 *
 * @author Omar
 */
public class UserController {

    private final Connection connection;
    
    public UserController() throws Exception {
        connection = DbUtil.getConnection();
    }
    
    /**
     *
     * @param id
     * @return
     */
    public User getUserById(int id){
        String query="SELECT u.*, p.* FROM users as u "
                + "INNER JOIN permission as p "
                + "ON(u.user_id=p.user_id) "
                + "WHERE u.user_id=?";
        User user = new User();
        List<Permission> permissions = new ArrayList<>();
        
        try {
            PreparedStatement stmt=(PreparedStatement) connection.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet rs=stmt.executeQuery();
            
            while(rs.next()){
                Permission permission = new Permission();
                
                user.setId(rs.getInt("u.user_id"));
                user.setUsername(rs.getString("u.username"));
                user.setPassword(rs.getString("u.password"));
                user.setName(rs.getString("u.name"));
                user.setTitle(rs.getString("u.title"));
                user.setSignaturePath(rs.getString("u.signature"));
                
                permission.setId(rs.getInt("p.id"));
                permission.setTableName(rs.getString("p.table_name"));
                permission.setFieldName(rs.getString("p.field_name"));
                permission.setAllowedOperation(rs.getString("p.allowed_operation"));
                
                permissions.add(permission);
            }
            
            user.setPermissions(permissions);
            
        } catch (SQLException ex) {
            Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return user;
    }
    
    /**
     *
     * @param username
     * @return
     */
    public User getUserByUsername(String username){
        String query="SELECT u.*, p.* FROM users as u "
                + "INNER JOIN permission as p "
                + "ON(u.user_id=p.user_id) "
                + "WHERE u.username=?";
        User user = new User();
        List<Permission> permissions = new ArrayList<>();
        
        try {
            PreparedStatement stmt=(PreparedStatement) connection.prepareStatement(query);
            stmt.setString(1, username);
            ResultSet rs=stmt.executeQuery();
            
            while(rs.next()){
                Permission permission = new Permission();
                
                user.setId(rs.getInt("u.user_id"));
                user.setUsername(rs.getString("u.username"));
                user.setPassword(rs.getString("u.password"));
                user.setName(rs.getString("u.name"));
                user.setTitle(rs.getString("u.title"));
                user.setSignaturePath(rs.getString("u.signature"));
                
                permission.setId(rs.getInt("p.id"));
                permission.setTableName(rs.getString("p.table_name"));
                permission.setFieldName(rs.getString("p.field_name"));
                permission.setAllowedOperation(rs.getString("p.allowed_operation"));
                
                permissions.add(permission);
            }
            
            user.setPermissions(permissions);
            
        } catch (SQLException ex) {
            Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
        }

        return user;
    }
    
    /**
     *
     * @param username
     * @param password
     * @return
     */
    public User login(String username, String password){
        String query="SELECT u.*, p.* FROM users as u "
                + "INNER JOIN permission as p "
                + "ON(u.user_id=p.user_id) "
                + "WHERE u.username=? && u.password=?";
        User user = new User();
        List<Permission> permissions = new ArrayList<>();
        
        try {
            PreparedStatement stmt=(PreparedStatement) connection.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);
            
            ResultSet rs=stmt.executeQuery();
            
            while(rs.next()){
                Permission permission = new Permission();
                
                user.setId(rs.getInt("u.user_id"));
                user.setUsername(rs.getString("u.username"));
                user.setPassword(rs.getString("u.password"));
                user.setName(rs.getString("u.name"));
                user.setTitle(rs.getString("u.title"));
                user.setSignaturePath(rs.getString("u.signature"));
                
                permission.setId(rs.getInt("p.id"));
                permission.setTableName(rs.getString("p.table_name"));
                permission.setFieldName(rs.getString("p.field_name"));
                permission.setAllowedOperation(rs.getString("p.allowed_operation"));
                
                permissions.add(permission);
            }
            
            user.setPermissions(permissions);
            
        } catch (SQLException ex) {
            Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
        }

        return user;
    }
    
    /**
     *
     * @return
     */
    public List<User> getUsers(){
        return null;
    }
    
    /**
     *
     * @param user
     * @return 
     */
    public int insert(User user){
        int rowAffected=0;
        try {
            String query="INSERT INTO users(user_id, username, password, name, title,signature) VALUES(0,?,?,?,?,?)";
            
            PreparedStatement stmt=(PreparedStatement) connection.prepareStatement(query);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getName());
            stmt.setString(4, user.getTitle());
            stmt.setString(5, user.getSignaturePath());
            
            rowAffected=stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BankController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowAffected;
    }
    
    /**
     *
     * @param id
     * @param user
     */
    public void update(int id, User user){
        
    }
    
    /**
     *
     * @param id
     */
    public void remove (int id){
        
    }
}
