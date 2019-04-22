package com.alex.platform.junit.unit;

import org.junit.Before;
import org.junit.Test;

import static org.easymock.EasyMock.mock;
import static org.easymock.EasyMock.replay;

public class Test01 {
    private ClassTested classUnderTest;
    private Collaborator mock;

    @Before
    public void setUp() {
        classUnderTest = new ClassTested();
        mock = mock(Collaborator.class);
        classUnderTest.setListener(mock);
    }

    @Test
    public void testAddMethod() {
        replay(mock);
        classUnderTest.addDocument("add title", "add document");
    }
}
