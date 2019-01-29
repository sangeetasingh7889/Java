import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) {
		try {
			//Step-1 Register the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step-2 Create connection using DriverManager class
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile", "root","mysql");
			System.out.println(con);
			
			//Step-3 create statement
			String query = "insert into mobile.mobile(mobbrand, mobprice,mobcolor) values('test','test','test')";
			Statement stmt = con.createStatement();
			
			//Step-4 Execute the query
			int i = stmt.executeUpdate(query);
			
			String message = (i>0)?"SUCCESS":"REJECT";
			System.out.println(message);
			
			//Step-5 Close the connection
			con.close();
			
		}catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
