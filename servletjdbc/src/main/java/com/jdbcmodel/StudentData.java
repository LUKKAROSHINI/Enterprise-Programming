package com.jdbcmodel;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbcmodel.Student;

public class StudentData {


public List<Student> getDetails() throws Exception
{
Connection con = null; 
con = DriverManager.getConnection("jdbc:mysql://localhost","root","rosh");
//DriverManager is used to connect to a database. It returns connection object 
Statement s = con.createStatement();
String query1 = "use csejdbc";  //To connect to a database section19
String query2 = "select * from Student";
s.execute(query1);  
ResultSet rs = s.executeQuery(query2);
List<Student> L = new ArrayList<Student>();
while(rs.next()){
Student ob = new Student();
ob.setRegno(rs.getInt(1));
ob.setName(rs.getString(2));
ob.setCgpa(rs.getFloat(3));
L.add(ob);
}
return L;
}
}
