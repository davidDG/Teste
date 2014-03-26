import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Funcionario {
 
	
	public static void main(String args[]) throws ClassNotFoundException,
	SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://192.168.1.33:3306/javathin", "javathin",
				"javathin");
		
		String sql = ("insert into funcionario (nome, valorHora) values (?,?)");	
			
		String opcao = null;
		
	    

		opcao = JOptionPane.showInputDialog("Oque você deseja? \n 1- novo \n 2 pesquisar \n 0 para sair");
		switch (opcao) {
		case "1":		
			
			Statement stmt = conn.createStatement();	
			PreparedStatement pst = conn.prepareStatement(sql);
			
			String nome = JOptionPane.showInputDialog("digite o nome do funcionario");
			Double valorHora = Double.parseDouble(JOptionPane.showInputDialog("digite o valor da Hora"));
			
			pst.setString(1, nome);
			pst.setDouble(2, valorHora);
			
			
			pst.execute();
			pst.close();
			break;
		case "2":
			nome = JOptionPane.showInputDialog("digite o nome a ser pesquisado");
			PreparedStatement select = conn.prepareStatement("select * from funcionario where nome = (?)");	
			select.setString(1, nome);
			ResultSet rs = select.executeQuery();
			while (rs.next()) {
				System.out.println("ID: "+ rs.getInt("id") + " nome: "+ rs.getString("nome") + rs.getDouble(" valorHora"));			
			}
			rs.close();
			select.close();
			conn.close();
			
			break;
		case "0":
			
			break;
		}
	
	
	}
	
	
}
