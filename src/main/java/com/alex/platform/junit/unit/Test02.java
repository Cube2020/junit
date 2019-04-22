package com.alex.platform.junit.unit;

import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.easymock.EasyMock.replay;

@RunWith(EasyMockRunner.class)
public class Test02 {
    
    @TestSubject
    private ClassTested classTested = new ClassTested();
    @Mock
    private Collaborator collaborator;
    
    @Test
    public void testAddDocument(){
        replay(collaborator);
        classTested.addDocument("111","222");
    }
}
