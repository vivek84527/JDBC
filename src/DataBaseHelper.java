import java.sql.*;
public class DataBaseHelper extends JAVAjdbc {
    void insert()
    {
        try
        {

            java.util.Scanner sc=new java.util.Scanner(System.in);
            System.out.println("Enter the Id");
            int Roll_No=sc.nextInt();
            System.out.println("Enter the Name");
            String Name=sc.next();
            String insertQuery="insert into student values(?,?);";
            PreparedStatement pst=con.prepareStatement(insertQuery);
            pst.setString(1,Name);
            pst.setInt(2,Roll_No);
            pst.executeUpdate();


            System.out.println("Data inserted ...");

        }
        catch(Exception e)
        {
            System.out.println("Data not inserted...."+e);
        }
    }

    public static void main(String[] args) {
        DataBaseHelper d = new DataBaseHelper();
        d.insert();
    }

}
