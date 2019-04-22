package com.alex.platform.junit.easymock;

import com.alex.platform.junit.dao.Engineer;
import com.alex.platform.junit.dao.UserDao;
import com.alex.platform.junit.model.User;
import com.alex.platform.junit.service.UserService;
import org.easymock.EasyMock;
import org.easymock.EasyMockRule;
import org.easymock.EasyMockRunner;
import org.easymock.TestSubject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.util.ReflectionTestUtils;

import javax.annotation.Resource;

import static org.mockito.Mockito.when;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {UserService.class})
public class UserServiceAnnotationTest {

    @Rule
    public EasyMockRule mocks = new EasyMockRule(this);
    @InjectMocks
    private UserService userService;
    @Mock
    private User userMock;
    @Mock
    private UserDao userDaoMock;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void getUserAgeInfoTest() {
        when(userMock.getAge()).thenReturn(3);
        when(userDaoMock.findByUserId("1002")).thenReturn(userMock);
        Assert.assertTrue(userService.getUserAgeInfo("1002").equals(Engineer.YOUNG.getName()));
    }

}
