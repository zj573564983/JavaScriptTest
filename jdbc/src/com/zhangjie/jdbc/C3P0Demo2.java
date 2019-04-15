package com.zhangjie.jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/***
 * @author zhangjie
 * @date 2019/4/15 20:08
 */
public class C3P0Demo2 {
    public static void main(String[] args) throws SQLException {
        //什么都没传，则会使用默认配置
        //DataSource ds=new ComboPooledDataSource();
        DataSource ds=new ComboPooledDataSource("mysql");

        Connection conn=ds.getConnection();
        System.out.println(conn);
    }
}
