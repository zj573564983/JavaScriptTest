package com.zhangjie.jdbc;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/***
 * @author zhangjie
 * @date 2019/4/15 20:29
 */
public class DruidDemo1 {
    /*
        1.导入jar包
        2.定义配置文件(任意名称和目录，properties文件即可)
        3.加载配置文件
        4.获取数据库连接池对象：通过工厂来获取 DruidDataSourceFactory
        5.获取连接：getConnection
     */
    public static void main(String[] args) throws Exception {
        Properties pro=new Properties();
        InputStream stream = DruidDemo1.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(stream);
        DataSource ddsf= (DataSource) DruidDataSourceFactory.createDataSource(pro);

        Connection conn=ddsf.getConnection();
        System.out.println(conn);
    }
}
