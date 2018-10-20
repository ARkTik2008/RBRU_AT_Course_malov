package com.raiffeisen.lesson10.lesson;

/*
1) вставить данные в таблицу purchase
2) получить данные из таблицы person и вывести их в консоль
3) реализовать preparestatement . Параметры для запроса читаются из файла :)
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.ArrayList;


public class sqlMain {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        //Подключение к БД
        String url = "jdbc:sqlserver://localhost;Database=testdb;integratedSecurity=true";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.getConnection(url);

        System.out.println("!!!Connected");
        //Часть 1
        System.out.println("Часть 1");
        Statement stmt1 = null;
        stmt1 = conn.createStatement();
        stmt1.execute("INSERT INTO [dbo].[purchase] VALUES ('test6',1,'11.04.2018',1)");
        System.out.println(" ");
        System.out.println(" ");

        //Часть 2
        System.out.println("Часть 2");
        Statement stmt = null;
        stmt = conn.createStatement();
        ResultSet rs = null;

        if (stmt != null) {
            rs = stmt.executeQuery("select * from person");
        }

        while (rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
        }
        System.out.println(" ");
        System.out.println(" ");

        //Часть 3
        System.out.println("Часть 3");
        ArrayList<String> inputData = parseFile();


        String SQL = "SELECT * FROM product WHERE product_price > ? AND quantity_on_hand > ?";
        PreparedStatement preparedStatement = conn.prepareStatement(SQL);

        for (String row : inputData) {

            String[] parameters = row.split(":");


            preparedStatement.setString(1, parameters[0]);
            preparedStatement.setString(2, parameters[1]);

            ResultSet result3 = preparedStatement.executeQuery();

            System.out.println("Для параметров " + parameters[0] + " и " + parameters[1] + " получены следующие результаты: ");
            if (result3.next()) {
                while (result3.next()) {
                    System.out.println(result3.getString(1) + " " + result3.getString(2) + " " + result3.getString(3) + " " + result3.getString(4));
                }
            } else {
                System.out.println("!!!Список пуст!!!");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println(" ");

        conn.close();
        System.out.println("!!!Connection closed");

    }

    private static ArrayList<String> parseFile() throws IOException {

        ArrayList<String> data = new ArrayList<>();
        /*
        Содержание файла следующего вида:
            1:1
            100:50
            2:2
        */

        Files.readAllLines(Paths.get("C:/input.txt")).forEach(
                l -> {
                    String tmp = l;
                    data.add(l);
                }
        );
        return data;
    }
}
