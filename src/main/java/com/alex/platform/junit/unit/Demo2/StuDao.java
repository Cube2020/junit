package com.alex.platform.junit.unit.Demo2;

public class StuDao {
    private StuDao userDao;

    public void setUserDao(StuDao userDao) {
        this.userDao = userDao;
    }

    public Stu getStuById(String id){
        return "1001".equals(id) ? new Stu("1001", 25, "alex") : new Stu("1002", 30, "tom");
    }
}
