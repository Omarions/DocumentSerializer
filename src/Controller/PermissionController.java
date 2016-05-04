/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Permission;
import utils.Operations;

/**
 *
 * @author Omar
 */
public class PermissionController {

    private static Connection connection;

    public PermissionController() throws Exception {
        connection = DbUtil.DbUtil.getConnection();
    }
    
    /**
     *
     * @param id
     * @return
     */
    public Permission getPermissionById(int id){
        String query="SELECT * FROM permission WHERE id=?";
        Permission permission=new Permission();
        
        try {
            PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                permission.setId(id);
                permission.setTableName(rs.getString("table_name"));
                permission.setFieldName(rs.getString("field_name"));
                permission.setAllowedOperation(rs.getString("allowed_operation"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PermissionController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return permission;       
    }
    
    /**
     *
     * @param userId
     * @return
     */
    public List<Permission> getPermissionsByUser(int userId){
        String query="SELECT * FROM permission WHERE user_id=?";
        List<Permission> permissions = new ArrayList<>();
         
        try {
            PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(query);
            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Permission permission=new Permission();
                permission.setId(rs.getInt("id"));
                permission.setTableName(rs.getString("table_name"));
                permission.setFieldName(rs.getString("field_name"));
                permission.setAllowedOperation(rs.getString("allowed_operation"));
                
                permissions.add(permission);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PermissionController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return permissions;       
    }
    
    /**
     *
     * @param operation
     * @return
     */
    public List<Permission> getPermissionsByOperation(Operations operation){
        String query="SELECT * FROM permission WHERE allowed_operation=?";
        List<Permission> permissions = new ArrayList<>();
         
        try {
            PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(query);
            stmt.setString(1, operation.toString());
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Permission permission=new Permission();
                permission.setId(rs.getInt("id"));
                permission.setTableName(rs.getString("table_name"));
                permission.setFieldName(rs.getString("field_name"));
                permission.setAllowedOperation(rs.getString("allowed_operation"));
                
                permissions.add(permission);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PermissionController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return permissions;       
    }
    
    /**
     *
     * @param user_id
     * @param permission
     * @return 
     */
    public int insert(int user_id,Permission permission){
        int rowAffected=0;
        try {
            String query="INSERT INTO permission(id,table_name,field_name,allowed_operation,user_id) VALUES(0,?,?,?,?,?)";
            
            PreparedStatement stmt=(PreparedStatement) connection.prepareStatement(query);
            stmt.setString(1, permission.getTableName());
            stmt.setString(2, permission.getFieldName());
            stmt.setString(3, permission.getAllowedOperation());
            stmt.setInt(4, user_id);
            
            rowAffected=stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BankController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowAffected;
    }
    
    /**
     *
     * @param id
     * @param permission
     */
    public int update(int userId, Permission permission){
        int rowsAffected=0;
        try {
            String query="UPDATE permission SET table_name = ?, field_name = ?,"
                    + " allowed_operation = ?, user_id = ? WHERE id=?";
            
            PreparedStatement stmt=(PreparedStatement) connection.prepareStatement(query);
            
            stmt.setString(1, permission.getTableName());
            stmt.setString(2, permission.getFieldName());
            stmt.setString(3, permission.getAllowedOperation());
            stmt.setInt(4, userId);
            stmt.setInt(5, permission.getId());
           
            rowsAffected=stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BankController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsAffected;
    }
    
    /**
     *
     * @param id
     */
    public int remove(int id){
        int rowsAffected=0;
        try {
            String query="DELETE FROM permission WHERE id=?";
            
            PreparedStatement stmt=(PreparedStatement) connection.prepareStatement(query);

            stmt.setInt(1, id);
            
            rowsAffected=stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BankController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsAffected;
    }
}
