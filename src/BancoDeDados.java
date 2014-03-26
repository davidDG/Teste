import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.spi.DirStateFactory.Result;



public class BancoDeDados {

	public static void main(String args[]) throws ClassNotFoundException,
			SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://192.168.1.33:3306/javathin", "javathin",
				"javathin");

		String sql = ("insert into funcionario (nome)"+ "values (?)");
		
		Statement stmt = conn.createStatement();
		
		PreparedStatement pst = conn.prepareStatement(sql);
		
		pst.setString(1, "David");
		
		pst.execute();
		
		pst.close();
		
		
		PreparedStatement select = conn.prepareStatement("select * from funcionario");
		
		ResultSet rs = select.executeQuery();
		
		while (rs.next()) {
			System.out.println("ID: "+ rs.getInt("id") + "nome: "+ rs.getString("nome"));
			
			
		}
		rs.close();
		select.close();
		conn.close();
	}

}
