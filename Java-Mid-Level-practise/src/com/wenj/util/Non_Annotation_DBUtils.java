package com.wenj.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 29 18:41 星期五
 * @description: 自定义的工具类,不带注解
 */
public class Non_Annotation_DBUtils {
    static String ip = "127.0.0.1";
    static int port = 3306;
    static String database = "how2java";
    static String encoding = "UTF-8";
    static String serverTimezone = "UTC";
    static String username = "root";
    static String password = "root";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s&serverTimezone=%s", ip, port, database, encoding, serverTimezone);
        return DriverManager.getConnection(url, username, password);
    }

    /*public static void main(String[] args) throws SQLException {
        System.out.println(getConnection());
    }*/
}
