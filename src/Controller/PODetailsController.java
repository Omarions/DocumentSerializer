/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.List;
import model.PODetails;

/**
 *
 * @author Omar
 */
public class PODetailsController {

    /**
     *
     * @param id
     * @return
     */
    public PODetails getPODetailsById(String id){
        return null;
    }
    
    /**
     *
     * @param approval
     * @return
     */
    public List<PODetails> getPurchaseOrderByApproval(boolean approval){
        return null;
    }
    
    /**
     *
     * @param poId
     * @return
     */
    public List<PODetails> getPODetailsByPO(String poId){
        return null;
    }
    
    /**
     *
     * @param po
     */
    public void insert(PODetails po){
        
    }
    
    /**
     *
     * @param id
     * @param po
     */
    public void update(String id, PODetails po){
        
    }
    
    /**
     *
     * @param id
     */
    public void remove(String id){
        
    }
}
