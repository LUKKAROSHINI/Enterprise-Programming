package section7.jdbcProgram;

import java.sql.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        try {
            // Connect to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost", "root", "rosh");

            // Create a statement object to execute queries
            Statement s = con.createStatement();
            String query1 = "USE section7";
            s.execute(query1);
            // Create a Scanner object to take user input
            Scanner ob = new Scanner(System.in);
            System.out.println("Enter the ID number:");
            int sid = ob.nextInt();
            System.out.println("Enter the name:");
            String sname = ob.next();
            
            String query4 = "update student  set name ='"+sname+"'  where id = "+sid+"";
            s.execute(query4);
         
              // String query2 = "delete from student where id ='"+sname+"' ";
             
              // s.execute(query2);
             
          //  System.out.println("Enter the cgpa:");
           // float scgpa = ob.nextFloat();

            // Use the specific database
           

            // Construct the insert query with PreparedStatement
           // String query4 = "INSERT INTO student(id, name) VALUES (?, ?)";
           // String query3 ="alter table student drop column cgpa";
           // s.execute(query3);
          //  PreparedStatement ps = con.prepareStatement(query2);
            

            // Set parameters for the PreparedStatement
            //ps.setInt(1, sid);
            //ps.setString(2, sname);
            //ps.setFloat(3, scgpa);

            // Execute the PreparedStatement
          //  ps.executeUpdate();

            System.out.println("Given task executed successfully");

            // Close the Scanner object
            ob.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
