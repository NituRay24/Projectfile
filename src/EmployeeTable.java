import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
public class EmployeeTable { public void JDBCConnection() throws Exception{
    String url = "jdbc:mysql://localhost:3306/AssementRequire";
    String user = "root";
    String pwd = "  ";
//Step 2: Establish the connection (path)
    Connection con = DriverManager.getConnection(url,user,pwd);

// Step3: Create a statement object
    Statement st = con.createStatement();
    //String sql="  SELECT * FROM EmployeeBasicInfo";
   // String sql="SELECT * FROM EmployeesDetails";
   // String sql="SELECT * FROM Post";
    //String sql="SELECT * FROM Comments";
     String sql="SELECT * FROM Album";
    ResultSet rs = st.executeQuery(sql);
    while(rs.next()){
        System.out.println( " UserId: "+ rs.getString(1)+
               // "Company_Name: " + rs.getString(2)+
               // "Person_Name: " + rs.getString(3) +
              //  " Email:"+rs.getString(4)+
                //" Contact: "+ rs.getString(5)+
               // " Zip code: "+ rs.getString(6)+
               // " eid "+ rs.getString(7)
                //"id"+ rs.getString(2)+
                //"title"+ rs.getString(3)+
                //"Body"+ rs.getString(4)
                "Id" + rs.getString(2)+
                "Name" + rs.getString(3)+
                "Email" + rs.getString(4)

        );
    }
    con.close();
}
    public static void main(String[] args) throws Exception {
// step 1: load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        EmployeeTable epr = new EmployeeTable();
        epr.JDBCConnection();
    }

}
