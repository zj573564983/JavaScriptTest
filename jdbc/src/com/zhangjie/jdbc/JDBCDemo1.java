package com.zhangjie.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/***
 * @author zhangjie
 * @date 2019/4/15 19:03
 */
public class JDBCDemo1 {

    public static void main(String[] args) throws Exception {
        /*
            1.导入驱动jar包
            2.注册驱动
            3.获取数据库连接信息
            4.定义sql语句
            5.获取执行sql的对象Statement
            6.执行sql
            7.处理结果
            8.释放资源
         */
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1?serverTimezone=UTC","root","123456");
        String sql="update user set remark ='test' where id=1";
        Statement statement=conn.createStatement();

        int count=statement.executeUpdate(sql);
        System.out.println(count);

        statement.close();
        conn.close();
    }
}
