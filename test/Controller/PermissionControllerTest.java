/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import java.util.List;
import model.Permission;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.Operations;

/**
 *
 * @author Omar
 */
public class PermissionControllerTest {
    
    public PermissionControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPermissionById method, of class PermissionController.
     */
    @Test
    public void testGetPermissionById() {
        System.out.println("getPermissionById");
        int id = 1;
        PermissionController instance = new PermissionController();
        Permission expResult = new Permission(1, "purchase_order", "approval", "ALLOW");
        Permission result = instance.getPermissionById(id);
        System.out.println(expResult);
        System.out.println(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPermissionsByUser method, of class PermissionController.
     */
    @Test
    public void testGetPermissionsByUser() {
        System.out.println("getPermissionsByUser");
        int userId = 2;
        PermissionController instance = new PermissionController();
        List<Permission> expResult = new ArrayList<>();
        expResult.add(new Permission(2, "purchase_order", "approval", "DENY"));
        expResult.add(new Permission(3, "quotation", "approval", "ALLOW"));
        List<Permission> result = instance.getPermissionsByUser(userId);
        System.out.println(expResult);
        System.out.println(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPermissionsByOperation method, of class PermissionController.
     */
    @Test
    public void testGetPermissionsByOperation() {
        System.out.println("getPermissionsByOperation");
        Operations operation = null;
        PermissionController instance = new PermissionController();
        List<Permission> expResult = null;
        List<Permission> result = instance.getPermissionsByOperation(operation);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of insert method, of class PermissionController.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Permission permission = null;
        PermissionController instance = new PermissionController();
        instance.insert(1,permission);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class PermissionController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int id = 0;
        Permission permission = null;
        PermissionController instance = new PermissionController();
        instance.update(id, permission);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class PermissionController.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int id = 0;
        PermissionController instance = new PermissionController();
        instance.remove(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
