package com.wenj.util;

import com.wenj.annotation.SelfJDBCAnnotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 02 01 16:43 星期一
 * @description: 自定义工具类，带注解
 */
@SelfJDBCAnnotation(ip = "127.0.0.1", database = "how2java", encoding = "UTF-8", serverTimezone = "UTC", username = "root", password = "root")
public class With_Annotation_DBUtils {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        SelfJDBCAnnotation selfJDBCAnnotation = With_Annotation_DBUtils.class.getAnnotation(SelfJDBCAnnotation.class);
        String ip = selfJDBCAnnotation.ip();
        int port = selfJDBCAnnotation.port();
        String database = selfJDBCAnnotation.database();
        String encoding = selfJDBCAnnotation.encoding();
        String serverTimezone = selfJDBCAnnotation.serverTimezone();
        String username = selfJDBCAnnotation.username();
        String password = selfJDBCAnnotation.password();
        String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s&serverTimezone=%s", ip, port, database, encoding, serverTimezone);
        return DriverManager.getConnection(url, username, password);
    }

    public static void main(String[] args) throws SQLException {
        Connection connection = getConnection();
        System.out.println(connection);
    }

}
