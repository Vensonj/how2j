package com.wenj.database;

import java.sql.*;
import java.util.Scanner;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 27 17:18 星期三
 * @description: 测试并连接数据库，必须先导入mysql-connector-java-8.0.22.jar
 */
public class JdbcDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
       /* Connection connection = null;
        Statement statement = null;
        // 初始化驱动
        try {
            // 驱动类com.mysql.jdbc.Driver（过时） 建议采用新的驱动类com.mysql.cj.jdbc.Driver
            // 就在 mysql-connector-java-5.0.8-bin.jar中
            // 如果忘记了第一个步骤的导包，就会抛出 ClassNotFoundException
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("数据库加载成功");
            connection = DriverManager.getConnection("jdbc:mysql:///how2java?characterEncoding=utf-8&serverTimezone=UTC", "root", "root");
            System.out.println("数据库连接成功，获取到连接对象" + connection);

            // 注意：使用的是 java.sql.Statement
            // 不要不小心使用到： com.mysql.jdbc.Statement;
            statement = connection.createStatement();

            System.out.println("获取 Statement对象： " + statement);

            // 准备sql语句
            // 注意： 字符串要用单引号'
            String sql = "insert into hero values(null," + "'提莫'" + "," + 313 + "," + 50 + ")";
            statement.execute(sql);

            System.out.println("执行插入语句成功");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // 数据库的连接时有限资源，相关操作结束后，养成关闭数据库的好习惯
            // 先关闭Statement
            if (statement != null)
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            // 后关闭Connection
            if (connection != null)
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }*/
        // 增 删 改----------------------------------------------------------
        /*try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try(Connection connection = DriverManager.getConnection("jdbc:mysql:///how2java?characterEncoding=utf-8&serverTimezone=UTC","root","root");
            Statement statement = connection.createStatement()) {
            String sql = "insert into hero values(null,'盲僧',360,75)";
            statement.execute(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }*/
// --------------------------------------------------------------------------------------------------------
      /*  try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection("jdbc:mysql:///how2java?characterEncoding=utf-8&serverTimezone=UTC", "root", "root");
             Statement statement = connection.createStatement()) {
            // 执行查询语句，并把结果集返回给ResultSet
            String sql = "select * from hero";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");// 可以使用字段名
                String name = rs.getString(2);// 也可以使用字段的顺序
                int hp = rs.getInt("hp");
                int damage = rs.getInt(4);
                System.out.printf("%d\t%s\t%d\t%d%n", id, name, hp, damage);
            }
            // 不一定要在这里关闭ReultSet，因为Statement关闭的时候，会自动关闭ResultSet
            // rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
// ---------------------------------------------------------------------------------------------------------------------
       /* try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection("jdbc:mysql:///how2java?characterEncoding=utf-8&serverTimezone=UTC", "root", "root");
             Statement statement = connection.createStatement()) {
            // 执行查询语句，并把结果集返回给ResultSet
            String sql = "select count(*) from hero";
            ResultSet rs = statement.executeQuery(sql);
            int total = 0;
            while (rs.next()) {
                total = rs.getInt(1);
            }
            System.out.println("表Hero中总共有:" + total+" 条数据");
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
        //-----------------------------------------------获取数据库元数据---------------------------------------------------------------
        /*try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection c = DriverManager.getConnection("jdbc:mysql:///how2java?characterEncoding=UTF-8&serverTimezone=UTC","root", "root");) {

            // 查看数据库层面的元数据
            // 即数据库服务器版本，驱动版本，都有哪些数据库等等

            DatabaseMetaData dbmd = c.getMetaData();

            // 获取数据库服务器产品名称
            System.out.println("数据库产品名称:\t"+dbmd.getDatabaseProductName());
            // 获取数据库服务器产品版本号
            System.out.println("数据库产品版本:\t"+dbmd.getDatabaseProductVersion());
            // 获取数据库服务器用作类别和表名之间的分隔符 如test.user
            System.out.println("数据库和表分隔符:\t"+dbmd.getCatalogSeparator());
            // 获取驱动版本
            System.out.println("驱动版本:\t"+dbmd.getDriverVersion());

            System.out.println("可用的数据库列表：");
            // 获取数据库名称
            ResultSet rs = dbmd.getCatalogs();

            while (rs.next()) {
                System.out.println("数据库名称:\t"+rs.getString(1));
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
// ------------------------------------------------------使用PreparedStatement替代Statement---------------------------------------------------------------
        /*try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

//        String sql = "select count(*) from hero";
        String sql = "insert hero values (null,?,?,?)";
        // RETURN_GENERATED_KEYS 用来返回自增id值
        try (Connection connection = DriverManager.getConnection("jdbc:mysql:///how2java?characterEncoding=utf-8&serverTimezone=UTC", "root", "root");
             PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, "伊泽瑞尔");
            ps.setInt(2, 450);
            ps.setInt(3, 40);
            // 执行插入语句
            ps.execute();
            // 在执行完插入语句后，MySQL会为新插入的数据分配一个自增长id
            // JDBC通过getGeneratedKeys获取该id
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                System.out.println(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }*/

        //----------------------------当插入一条数据之后，通过获取自增长id，得到这条数据的id，比如说是55.
        //
        //删除这条数据的前一条，54.
        //
        //如果54不存在，则删除53，以此类推直到删除上一条数据。-----------------------------------------------------------------

       /* String sql = "insert hero values (null,?,?,?)";
        // RETURN_GENERATED_KEYS 用来返回自增id值
        try (Connection connection = DriverManager.getConnection("jdbc:mysql:///how2java?characterEncoding=utf-8&serverTimezone=UTC", "root", "root");
             PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             Statement statement = connection.createStatement()) {
            ps.setString(1, "卡特琳娜");
            ps.setInt(2, 400);
            ps.setInt(3, 55);
            // 执行插入语句
            ps.execute();
            // 在执行完插入语句后，MySQL会为新插入的数据分配一个自增长id
            // JDBC通过getGeneratedKeys获取该id
            ResultSet rs = ps.getGeneratedKeys();
            int id;
            if (rs.next()) {
                id = rs.getInt(1);
                System.out.println(id);
            } else
                id = 0;
            while (true) {
                --id;
                String querySql = "select * from hero where id = " + id;
                ResultSet query = statement.executeQuery(querySql);
                if (query.next()) {
                    String deleteSql = "delete from hero where id = " + id;
                    statement.execute(deleteSql);
                    break;
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }*/

        // -------------------------------------------------------------------------------------------------------------
        String sql = "delete from hero where id = ?";
        // RETURN_GENERATED_KEYS 用来返回自增id值
        try (Connection connection = DriverManager.getConnection("jdbc:mysql:///how2java?characterEncoding=utf-8&serverTimezone=UTC", "root", "root");
             PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             Statement statement = connection.createStatement()) {
            connection.setAutoCommit(false);
            for (int i = 1; i <= 10; i++) {
                ps.setInt(1, i);
                // 执行删除语句
                ps.execute();
                System.out.println("正在试图删除第" + i + "条数据");
            }
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("是否要删除数据(Y/N)?");
                String next = scanner.next();
                if (next.equalsIgnoreCase("Y")) {
                    connection.commit();
                    System.out.println("删除成功");
                    break;
                }
                System.out.println("删除失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
