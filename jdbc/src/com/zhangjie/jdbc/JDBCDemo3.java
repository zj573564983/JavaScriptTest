package com.zhangjie.jdbc;

import java.sql.*;

/***
 * @author zhangjie
 * @date 2019/4/15 19:44
 */
public class JDBCDemo3 {
    public static void main(String[] args) throws Exception {
        /*
            1.导入驱动jar包
            2.注册驱动
            3.获取数据库连接信息
            4.定义sql语句
                注意：sql的参数使用？作为占位符
            5.获取执行sql的对象PreparedStatement
            6.给？赋值
            7.执行sql
            8.处理结果
            9.释放资源
         */
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/test1?serverTimezone=UTC","root","123456");
        String sql="select * from user where name=?";
        PreparedStatement stat=conn.prepareStatement(sql);
        stat.setString(1,"zhangjie");

        ResultSet resultSet=stat.executeQuery();
        while(resultSet.next()){
            int id = resultSet.getInt(1);
            String name=resultSet.getString("name");
            String remark=resultSet.getString("remark");

            System.out.println(id+"---"+name+"---"+remark);
        }

        resultSet.close();
        stat.close();
        conn.close();
    }
}
