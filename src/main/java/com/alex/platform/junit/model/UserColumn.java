package com.alex.platform.junit.model;

public enum UserColumn {

    userId("userId"), userName("userName"), age("age");
    private String columnName;

    public String getName() {
        return columnName;
    }

    UserColumn(String columnName) {
        this.columnName = columnName;
    }
}
