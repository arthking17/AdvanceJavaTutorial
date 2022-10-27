package com.example.demo.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSQLDemo {

    public static void main(String[] args) throws SQLException {

        // url to connect to database test of postgresql
        String url = "jdbc:postgresql://localhost/test";

        Connection conn = null;

        // data to add in DB test of postgresql
        int rollno = 2;
        String name = "Jane";
        int age = 20;

        // sql statement to insert a student into postgresql
        String sql = "insert into student(rollno, name, age) "
                + "values(" + rollno + ",'" + name + "'," + age + ")";

        try {
            // get the connection to the database using url, username, password
            conn = DriverManager.getConnection(url, "postgres", "william");

            // create the createStatement
            Statement st = conn.createStatement();

            // execute the sql statement
            // return the number of rows affected
            int m = st.executeUpdate(sql);

            // if 1 row has updated, insertion has been operated successfully
            if (m == 1)
                System.out.println("Inserted successfully : " + sql);
            else {
                System.out.println("Insertion failed !!!");
            }
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            // close the connection
            conn.close();
        }
    }

}
