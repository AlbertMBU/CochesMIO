package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import com.github.javafaker.Faker;


//Test class for Connector

public class ConnectorTest
        extends TestCase
{
    public ConnectorTest(String testName ) { super( testName ); }
    public static Test suite() { return new TestSuite( ConnectorTest.class ); }
    public void testApp() { assertTrue( true ); }
}
