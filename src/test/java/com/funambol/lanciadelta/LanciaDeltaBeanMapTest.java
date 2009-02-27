/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.funambol.lanciadelta;

import junit.framework.TestCase;

/**
 *
 * @author ste
 */
public class LanciaDeltaBeanMapTest extends TestCase {

    private String test;

    public String getTest() {
        return test;
    }

    
    public LanciaDeltaBeanMapTest(String testName) {
        super(testName);
    }

    public void testNoPrefix() {
        LanciaDeltaBeanMap map = new LanciaDeltaBeanMap(this);

        assertTrue(map.containsKey("test"));
    }

    public void testPrefix() {
        LanciaDeltaBeanMap map = new LanciaDeltaBeanMap("prefix", this);

        assertTrue(map.containsKey("prefix.test"));
    }

}
