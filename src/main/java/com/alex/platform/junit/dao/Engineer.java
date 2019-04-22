package com.alex.platform.junit.dao;

public enum Engineer {
    YOUNG("Young engineer"), OLD("Old engineer");
    private String columnName;

    public String getName() {
        return columnName;
    }

    Engineer(String columnName) {
        this.columnName = columnName;
    }
}
