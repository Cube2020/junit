package com.alex.platform.junit.easymock;

import com.alex.platform.junit.dao.Engineer;
import com.alex.platform.junit.dao.UserDao;
import com.alex.platform.junit.model.User;
import com.alex.platform.junit.service.UserService;
import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.lang.reflect.Field;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {

    @Resource
    private UserService userService;

    private User userMock;
    private UserDao userDaoMock;

    @Before
    public void init() {
        //Create mock object
        userMock = EasyMock.createMock(User.class);
        userDaoMock = EasyMock.createMock(UserDao.class);

        //Inject mock object to service
        Field userDaoField = null;
        try {
            userDaoField = userService.getClass().getDeclaredField("userDao");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        userDaoField.setAccessible(true);
        try {
            userDaoField.set(userService, userDaoMock);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getUserAgeInfoTest() {
        //Set expected value for mock object
        EasyMock.expect(userMock.getAge()).andReturn(29);
        EasyMock.expect(userDaoMock.findByUserId("1002")).andReturn(userMock);
        EasyMock.replay(userMock);
        EasyMock.replay(userDaoMock);
        Assert.assertTrue(userService.getUserAgeInfo("1002").equals(Engineer.YOUNG.getName()));
    }

}
