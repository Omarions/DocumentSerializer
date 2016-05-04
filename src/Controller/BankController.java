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

/**
 *
 * @author Omar
 */
public class BankController {
    private final Connection connection;

    /**
     *
     */
    public BankController() throws Exception {
        connection = DbUtil.getConnection();
    }
    
    /**
     *
     * @param id
     * @return
     */
    public Bank getBankById(int id){
        String query="SELECT * FROM bank WHERE bank_id=?";
        Bank bank = new Bank();

        try {
            PreparedStatement stmt=(PreparedStatement) connection.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet rs=stmt.executeQuery();
            
            if(rs.next()){
                bank.setId(rs.getInt("bank_id"));
                bank.setName(rs.getString("name"));
                bank.setCurrency(rs.getString("currency"));
                bank.setAccountNo(rs.getString("account_no"));
                bank.setSwiftCode(rs.getString("swift_code"));
                bank.setComments(rs.getString("comments"));   
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return bank;
    }
    
    /**
     *
     * @param name
     * @return
     */
    public List<Bank> getBankByName(String name){
        String query="SELECT * FROM bank WHERE name=?";
        List<Bank> banks=new ArrayList<>();

        try {
            PreparedStatement stmt=(PreparedStatement) connection.prepareStatement(query);
            stmt.setString(1, name);
            ResultSet rs=stmt.executeQuery();
            
            while(rs.next()){
                Bank bank = new Bank();
                bank.setId(rs.getInt("bank_id"));
                bank.setName(rs.getString("name"));
                bank.setCurrency(rs.getString("currency"));
                bank.setAccountNo(rs.getString("account_no"));
                bank.setSwiftCode(rs.getString("swift_code"));
                bank.setComments(rs.getString("comments"));  
                
                banks.add(bank);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return banks;
    }
    
    /**
     *
     * @param currency
     * @return
     */
    public List<Bank> getBankByCurrency(String currency){
        String query="SELECT * FROM bank WHERE currency=?";
        List<Bank> banks=new ArrayList<>();

        try {
            PreparedStatement stmt=(PreparedStatement) connection.prepareStatement(query);
            stmt.setString(1, currency);
            ResultSet rs=stmt.executeQuery();
            
            while(rs.next()){
                Bank bank = new Bank();
                bank.setId(rs.getInt("bank_id"));
                bank.setName(rs.getString("name"));
                bank.setCurrency(rs.getString("currency"));
                bank.setAccountNo(rs.getString("account_no"));
                bank.setSwiftCode(rs.getString("swift_code"));
                bank.setComments(rs.getString("comments"));  
                
                banks.add(bank);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return banks;
    }
    
    /**
     *
     * @return
     */
    public List<Bank> getAccounts(){
        String query="SELECT * FROM bank";
        List<Bank> banks=new ArrayList<>();

        try {
            PreparedStatement stmt=(PreparedStatement) connection.prepareStatement(query);
            
            ResultSet rs=stmt.executeQuery();
            
            while(rs.next()){
                Bank bank = new Bank();
                bank.setId(rs.getInt("bank_id"));
                bank.setName(rs.getString("name"));
                bank.setCurrency(rs.getString("currency"));
                bank.setAccountNo(rs.getString("account_no"));
                bank.setSwiftCode(rs.getString("swift_code"));
                bank.setComments(rs.getString("comments"));  
                
                banks.add(bank);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return banks;
    }
    
    /**
     *
     * @param bank
     * @return 
     */
    public int insert(Bank bank){
        int rowAffected=0;
        try {
            String query="INSERT INTO bank(bank_id,name,currency,account_no,swift_code,comments) VALUES(5,?,?,?,?,?)";
            
            PreparedStatement stmt=(PreparedStatement) connection.prepareStatement(query);
            stmt.setString(1, bank.getName());
            stmt.setString(2, bank.getCurrency());
            stmt.setString(3, bank.getAccountNo());
            stmt.setString(4, bank.getSwiftCode());
            stmt.setString(5, bank.getComments());
            
            rowAffected=stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BankController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowAffected;
    }
    
    /**
     *
     * @param bank
     * @return 
     */
    public int update(Bank bank){
        int rowAffected=0;
        try {
            String query="UPDATE bank SET name = ?, currency = ?, account_no = ?, swift_code = ?, comments = ? WHERE bank_id=?";
            
            PreparedStatement stmt=(PreparedStatement) connection.prepareStatement(query);
            
            stmt.setString(1, bank.getName());
            stmt.setString(2, bank.getCurrency());
            stmt.setString(3, bank.getAccountNo());
            stmt.setString(4, bank.getSwiftCode());
            stmt.setString(5, bank.getComments());
            stmt.setInt(6, bank.getId());
            
            rowAffected=stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BankController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowAffected;
    }
    
    /**
     *
     * @param id
     * @return 
     */
    public int remove(int id){
        int rowAffected=0;
        try {
            String query="DELETE FROM bank WHERE bank_id=?";
            
            PreparedStatement stmt=(PreparedStatement) connection.prepareStatement(query);

            stmt.setInt(1, id);
            
            rowAffected=stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BankController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowAffected;
    }
}
