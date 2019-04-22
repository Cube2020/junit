package com.alex.platform.junit.easymock.Demo2;

import com.alex.platform.junit.unit.Demo2.Stu;
import com.alex.platform.junit.unit.Demo2.StuDao;
import com.alex.platform.junit.unit.Demo2.StuServiceImpl;
import org.easymock.EasyMock;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StuServiceImplTest {
    
    @Test
    public void testQuery(){
        Stu stuExp = new Stu("1001", 28,"alex");
        StuDao stuDao = EasyMock.createMock(StuDao.class);
        EasyMock.expect(stuDao.getStuById("1001")).andReturn(stuExp);
        EasyMock.replay(stuDao);
        
        StuServiceImpl stuServiceImpl = new StuServiceImpl();
        stuServiceImpl.setStuDao(stuDao);
        Stu stu = stuServiceImpl.query("1001");
        assertNotNull(stu);
        assertEquals(stuExp,stu);
        
//        EasyMock.verify(stuDao);
        
    }
    
}
