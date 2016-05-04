/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import java.util.List;
import model.Permission;
import model.User;
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
public class UserControllerTest {
    
    public UserControllerTest() {
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
     * Test of getUserById method, of class UserController.
     */
    @Test
    public void testGetUserById() {
        System.out.println("getUserById");
        int id = 2;
        UserController instance = new UserController();
        List<Permission> permissions = new ArrayList<>();
        permissions.add(new Permission(2, "purchase_order", "approval", "DENY"));
        permissions.add(new Permission(3, "quotation", "approval", "ALLOW"));
        User expResult = new User(2, "username2", "password2", "Emp2", "title2",
                "signature2.jpg");
        expResult.setPermissions(permissions);
        User result = instance.getUserById(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getUserByUsername method, of class UserController.
     */
    @Test
    public void testGetUserByUsername() {
        System.out.println("getUserByUsername");
        String username = "";
        UserController instance = new UserController();
        User expResult = null;
        User result = instance.getUserByUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class UserController.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String username = "";
        String password = "";
        UserController instance = new UserController();
        User expResult = null;
        User result = instance.login(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsers method, of class UserController.
     */
    @Test
    public void testGetUsers() {
        System.out.println("getUsers");
        UserController instance = new UserController();
        List<User> expResult = null;
        List<User> result = instance.getUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class UserController.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        User user = new User(1, "username1", "password1", "Employee1", "Emp1 Title", "emp1 signature");
        UserController instance = new UserController();
        int expResult = 1;
        int result = instance.insert(user);
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class UserController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int id = 0;
        User user = null;
        UserController instance = new UserController();
        instance.update(id, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class UserController.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int id = 0;
        UserController instance = new UserController();
        instance.remove(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
