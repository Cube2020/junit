package com.alex.platform.junit.easymock.Demo1;

import com.alex.platform.junit.unit.Demo1.Calculator;
import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * A record-replay-verify simple example for EasyMock
 */
public class CalculatorTest {
    
    private Calculator calculatorMock;

    @Before
    public void setUp() {
        calculatorMock = EasyMock.createMock(Calculator.class);
    }

    /**
     * record: create a mock object and set expect data;
     * replay: activation the mock object;
     * verify: verify if all asserts fully implemented;
     */
    @Test
    public void test() {
        // 1.record
        EasyMock.expect(calculatorMock.add(2, 4)).andReturn(6);
        EasyMock.expect(calculatorMock.add(2, 4)).andReturn(5);
        EasyMock.expect(calculatorMock.add(0, 0)).andReturn(0);
        // 2.replay
        EasyMock.replay(calculatorMock);
        // 3.verify
        Assert.assertEquals(calculatorMock.add(2, 4), 6);
        Assert.assertEquals(calculatorMock.add(2, 4), 5);
//        Assert.assertEquals(calculatorMock.add(0, 0), 0);
//        EasyMock.verify(calculatorMock);
    }
}
