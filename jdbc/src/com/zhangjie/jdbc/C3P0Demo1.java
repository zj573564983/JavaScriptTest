package com.zhangjie.jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/***
 * @author zhangjie
 * @date 2019/4/15 20:01
 */
public class C3P0Demo1 {
    /*
        1.导入jar包
        2.定义配置文件：文件名称为c3p0.properties或者c3p0-config.xml
        3.创建核心对象ComboPooledDataSource
        4.获取连接：getConnection
     */
    public static void main(String[] args) throws SQLException {
        DataSource ds=new ComboPooledDataSource();

        Connection conn=ds.getConnection();
        System.out.println(conn);
    }
}
