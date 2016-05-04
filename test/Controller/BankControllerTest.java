/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import java.util.List;
import model.Bank;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Omar
 */
public class BankControllerTest {
    
    /**
     *
     */
    public BankControllerTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of getBankById method, of class BankController.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetBankById() throws Exception {
        System.out.println("getBankById");
        int id = 1;
        BankController instance = new BankController();
        Bank expResult = new Bank(1,"HSBC","Dollar","Account No1","Swift Code","No Comments");
        Bank result = instance.getBankById(id);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getBankByName method, of class BankController.
     */
    @Test
    public void testGetBankByName() {
        System.out.println("getBankByName");
        String name = "HSBC";
        BankController instance = new BankController();
        List<Bank> expResult = new ArrayList<>();
        expResult.add(new Bank(1,"HSBC","Dollar","Account No1","Swift Code","No Comments"));
        expResult.add(new Bank(2,"HSBC","Egyptian Pound","Account No2","Swift Code","Zeepaaalla"));
        expResult.add(new Bank(5, "HSBC", "EURO", "Account No5", "Swift5", "No Comment"));
        List<Bank> result = instance.getBankByName(name);
        assertEquals(expResult, result);
    }

    /**
     * Test of getBankByCurrency method, of class BankController.
     */
    @Test
    public void testGetBankByCurrency() {
        System.out.println("getBankByCurrency");
        String Currency = "Dollar";
        BankController instance = new BankController();
        List<Bank> expResult = new ArrayList<>();
        expResult.add(new Bank(1,"HSBC","Dollar","Account No1","Swift Code","No Comments"));
        expResult.add(new Bank(3,"QNB","Dollar","Account No3","Swift3","Another DOLLAR Bank"));
        List<Bank> result = instance.getBankByCurrency(Currency);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAccounts method, of class BankController.
     */
    @Test
    public void testGetAccounts() {
        System.out.println("getAccounts");
        BankController instance = new BankController();
        List<Bank> expResult = new ArrayList<>();
        expResult.add(new Bank(1,"HSBC","Dollar","Account No1","Swift Code","No Comments"));
        expResult.add(new Bank(2,"HSBC","Egyptian Pound","Account No2","Swift Code","Zeepaaalla"));
        expResult.add(new Bank(3,"QNB","Dollar","Account No3","Swift3","Another DOLLAR Bank"));
        expResult.add(new Bank(4,"CIB","Egyptian Pound","Account No4","Swift4","Zeeepaaalla2"));
        List<Bank> result = instance.getAccounts();
        assertEquals(expResult, result);
    }

    /**
     * Test of insert method, of class BankController.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Bank bank = new Bank(5, "HSBC", "EURO", "Account No5", "Swift5", "No Comment");
        BankController instance = new BankController();
        int expResult=1;
        assertEquals(expResult, instance.insert(bank));
    }

    /**
     * Test of update method, of class BankController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Bank bank = new Bank(1, "HSBC", "Dollar", "Account No1", "Swift1", "No Comment");
        BankController instance = new BankController();
        int expResult=1;
        assertEquals(expResult, instance.update(bank));
    }

    /**
     * Test of remove method, of class BankController.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int id = 2;
        int expResult=1;
        BankController instance = new BankController();
        assertEquals(expResult,instance.remove(id));
    }
    
}
