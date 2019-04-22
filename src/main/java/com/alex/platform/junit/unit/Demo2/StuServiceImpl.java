package com.alex.platform.junit.unit.Demo2;

public class StuServiceImpl {
    private StuDao stuDao;

    public void setStuDao(StuDao stuDao) {
        this.stuDao = stuDao;
    }
    
    public Stu query(String id){
        return stuDao.getStuById(id);
    }
}
