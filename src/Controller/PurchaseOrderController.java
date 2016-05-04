/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.List;
import model.PurchaseOrder;

/**
 *
 * @author Omar
 */
public class PurchaseOrderController {

    /**
     *
     * @param id
     * @return
     */
    public PurchaseOrder getPurchaseOrderById(String id){
        return null;
    }
    
    /**
     *
     * @param approval
     * @return
     */
    public List<PurchaseOrder> getPurchaseOrderByApproval(boolean approval){
        return null;
    }
    
    /**
     *
     * @param customerId
     * @return
     */
    public List<PurchaseOrder> getPurchaseOrderByCustomer(int customerId){
        return null;
    }
    
    /**
     *
     * @param po
     */
    public void insert(PurchaseOrder po){
        
    }
    
    /**
     *
     * @param id
     * @param po
     */
    public void update(String id, PurchaseOrder po){
        
    }
    
    /**
     *
     * @param id
     */
    public void remove(String id){
        
    }
}
