package com.alex.platform.junit.unit;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import static org.easymock.EasyMock.mock;
import static org.easymock.EasyMock.replay;

public class NonExampleTest {
    private ClassTested classUnderTest;

    private Collaborator mock;

    @Before
    public void setUp() {
        mock = mock(Collaborator.class);
        mock.documentAdded("New Document");
        classUnderTest = new ClassTested();
        classUnderTest.setListener(mock);
    }

    @Test
    public void testRemoveNonExistingDocument() {
        // This call should not lead to any notification
        // of the Mock Object:
        replay(mock);
        classUnderTest.addDocument("Does not exist","I'm doument");
    }

    @Test
    public void testAddDocument() {
        mock.documentAdded("New Document"); // 2
        replay(mock); // 3
        classUnderTest.addDocument("New Document", "12");
    }
}
