/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.List;
import model.QuotationDetails;

/**
 *
 * @author Omar
 */
public class QuotationDetailsController {

    /**
     *
     * @param id
     * @return
     */
    public QuotationDetails getQuotDetailsById(String id){
        return null;
    }
    
    /**
     *
     * @param approval
     * @return
     */
    public List<QuotationDetails> getPurchaseOrderByApproval(boolean approval){
        return null;
    }
    
    /**
     *
     * @param poId
     * @return
     */
    public List<QuotationDetails> getQuotDetailsByQuot(String poId){
        return null;
    }
    
    /**
     *
     * @param quotDetails
     */
    public void insert(QuotationDetails quotDetails){
        
    }
    
    /**
     *
     * @param id
     * @param quotDetails
     */
    public void update(String id, QuotationDetails quotDetails){
        
    }
    
    /**
     *
     * @param id
     */
    public void remove(String id){
        
    }
}
