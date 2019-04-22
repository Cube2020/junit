package com.alex.platform.junit.easymock.Demo3;

import com.alex.platform.junit.unit.Demo3.Calculator;
import org.easymock.EasyMock;
import org.easymock.EasyMockRule;
import org.easymock.Mock;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mockito;

import static org.easymock.EasyMock.replay;
import static org.mockito.Mockito.*;

public class CalculatorTest {
    @Rule
    public EasyMockRule mocks = new EasyMockRule(this);
    @Mock
    Calculator calculatorMock;
    @Test
    public void testAdd(){
        Mockito.when(calculatorMock.add(2,4)).thenReturn(6);
//        EasyMock.expect(calculatorMock.add(2,4)).andReturn(5);
//        when(calculatorMock.add(2,4)).thenReturn(5);
        replay(calculatorMock);
        Assert.assertEquals(calculatorMock.add(2,4),6);
        
    }
}
