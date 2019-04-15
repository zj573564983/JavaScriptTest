package com.zhangjie.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/***
 * 使用新的JDBCUtils
 * @author zhangjie
 * @date 2019/4/15 20:46
 */
public class DruidDemo2 {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement preparedStatement=null;
        try {
            conn = JDBCUtils.getConnection();
            String sql="insert into user values(null,?,?)";
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,"张三");
            preparedStatement.setString(2,"111");
            int i = preparedStatement.executeUpdate();
            System.out.println(i);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(preparedStatement,conn);
        }

    }
}
