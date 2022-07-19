package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import static java.lang.Class.forName;

public class Insert {

    private static String dburl="jdbc:mysql://localhost:3306/test?serverTimezone=Asia/Seoul&useSSL=false";//test DB
    Insert(){
        Connection connection;//DB 연결
        PreparedStatement preparedStatement;//sql 작성
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//드라이버 로딩

            connection= DriverManager.getConnection(dburl,"root","1234");//Connection 객체
            preparedStatement = connection.prepareStatement("INSERT INTO fish (name,length,weight) values (?,?,?)");
            preparedStatement.setString(1,"smelt");
            preparedStatement.setDouble(2,11.2);
            preparedStatement.setDouble(3,12);
            preparedStatement.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Insert();
    }
}
