package com.zhangjie.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/***
 * @author zhangjie
 * @date 2019/4/15 19:34
 */
public class JDBCDemo2 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/test1?serverTimezone=UTC","root","123456");
        String sql="select * from user";
        Statement statement=conn.createStatement();

        ResultSet resultSet=statement.executeQuery(sql);
        while(resultSet.next()){
            int id = resultSet.getInt(1);
            String name=resultSet.getString("name");
            String remark=resultSet.getString("remark");

            System.out.println(id+"---"+name+"---"+remark);
        }

        resultSet.close();
        statement.close();
        conn.close();
    }
}
