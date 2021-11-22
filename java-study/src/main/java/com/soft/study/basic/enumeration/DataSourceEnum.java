package com.soft.study.basic.enumeration;

/**
 * @description: 枚举实现单例
 * @author: crq
 * @create: 2021-11-22 14:31
 **/
public enum DataSourceEnum {
    /**
     * 数据源枚举
     */
    DATASOURCE;
    private final DbConnection connection;

    DataSourceEnum() {
        connection = new DbConnection();
    }

    public DbConnection getConnection() {
        return connection;
    }

    static class DbConnection {
        private DbConnection() {

        }
    }
}
