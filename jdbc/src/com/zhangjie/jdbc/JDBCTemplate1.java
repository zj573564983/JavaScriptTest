package com.zhangjie.jdbc;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

/***
 * 测试JDBCTemplate
 * @author zhangjie
 * @date 2019/4/15 20:19
 */
public class JDBCTemplate1 {
    /*
        1.导入jar包
        2.创建JDBCTemplate对象
        3.调用方法
     */
    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate=new JdbcTemplate(JDBCUtils.getDataSource());
        String sql="update user set remark='hh' where id=?";

        int count=jdbcTemplate.update(sql,3);
        System.out.println(count);

    }
}
