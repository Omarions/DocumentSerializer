/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbUtil;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.JDBC4Connection;
import java.io.IOException;
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
public class DbUtilTest {
    
    /**
     *
     */
    public DbUtilTest() {
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
     *
     */
    @Test
    public void testConnectionNotNull() {    
        Connection con=DbUtil.getConnection();
        assertEquals("get connection successfully to DB",con, DbUtil.getConnection());
    }
    
    /**
     *
     */
    @Test(expected=IOException.class)
    public void testGetConnectionThrowIOException(){
        DbUtil.getConnection();
    }
    
    /**
     *
     */
    @Test(expected=NullPointerException.class)
    public void testGetConnectionThrowNullException(){
        DbUtil.getConnection();
    }
}
