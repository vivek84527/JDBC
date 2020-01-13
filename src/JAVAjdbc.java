import java.sql.*;
import java.util.Scanner;
public class JAVAjdbc {
    Connection con;
    JAVAjdbc()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String ConnectionURL="jdbc:mysql://localhost:3306/vivek?serverTimezone=UTC";

            con = DriverManager.getConnection(ConnectionURL,"root","");


            System.out.println("Connection Success");




        }
        catch(Exception e){

            System.out.println("Connection faild"+e);


        }




    }


    public static void main(String[] args){

        JAVAjdbc obj = new JAVAjdbc();




    }





}
