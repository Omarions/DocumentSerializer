
package Controller;

import java.util.List;
import model.Quotation;

/**
 *
 * @author Omar
 */
public class QuotationController {

    /**
     *
     * @param id
     * @return
     */
    public Quotation getQuotationById(String id){
        return null;
    }
    
    /**
     *
     * @param approval
     * @return
     */
    public List<Quotation> getPurchaseOrderByApproval(boolean approval){
        return null;
    }
    
    /**
     *
     * @param customerId
     * @return
     */
    public List<Quotation> getQuotationByCustomer(int customerId){
        return null;
    }
    
    /**
     *
     * @param po
     */
    public void insert(Quotation po){
        
    }
    
    /**
     *
     * @param id
     * @param po
     */
    public void update(String id, Quotation po){
        
    }
    
    /**
     *
     * @param id
     */
    public void remove(String id){
        
    }
}
