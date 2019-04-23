package com.alex.platform.junit.easymock.Demo2;

import com.alex.platform.junit.unit.Demo2.User2;
import com.alex.platform.junit.unit.Demo2.UserController2;
import com.alex.platform.junit.unit.Demo2.UserService2;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * Test for controller url
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserControllerTest {
    
    private MockMvc mockMvc;
    @Mock
    UserService2 userService;
    @InjectMocks
    UserController2 userController;


    @Before
    public void init() {
        if (mockMvc == null) {
            MockitoAnnotations.initMocks(this);
            mockMvc = MockMvcBuilders.standaloneSetup(userController).build();

        }
    }

    @Test
    public void getUserByIdTest() {
        User2 user = new User2("1001", "alex", 28);
        when(userService.query("1001")).thenReturn(user);
        MvcResult result;
        try {
            result = mockMvc.perform(get("/user/getUserById").param("userId","1001")).andExpect(jsonPath("$.age").value(28)).andReturn();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
