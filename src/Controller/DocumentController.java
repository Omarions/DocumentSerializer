/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.time.LocalDate;
import java.util.List;
import model.Document;

/**
 *
 * @author Omar
 */
public class DocumentController {

    /**
     *
     * @param Id
     * @return
     */
    public Document getDocumentById(String Id){
        return null;
    }
    
    /**
     *
     * @param typeName
     * @return
     */
    public List<Document> getDocumentByType(String typeName){
        return null;
    }
    
    /**
     *
     * @param userId
     * @return
     */
    public List<Document> getDocumentByUser(int userId){
        return null;
    }
    
    /**
     *
     * @param start
     * @return
     */
    public List<Document> getDocumentByDate(LocalDate start){
        return null;
    }
    
    /**
     *
     * @param start
     * @param end
     * @return
     */
    public List<Document> getDocumentByDate(LocalDate start, LocalDate end){
        return null;
    }
    
    /**
     *
     * @param document
     */
    public void insert(Document document){
        
    }
    
    /**
     *
     * @param id
     * @param document
     */
    public void update(String id, Document document){
        
    }
    
    /**
     *
     * @param id
     */
    public void remove(String id){
        
    }
    
}
