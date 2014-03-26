import javax.swing.JOptionPane;


public class Atendente {

	public static void main(String[] args) {
		
		ContaCorrente minhaCC = new  ContaCorrente("51454684");
		
		ContaCorrente c1 =new ContaCorrente("55121834");
		
		ContaCorrente c2 =new ContaCorrente("45445464");
		
		
		minhaCC.depositar(50f);
		
		System.out.println(minhaCC.getSaldo());
		
		minhaCC.sacar(20f);
		
		System.out.println(minhaCC.getSaldo());
		
	    boolean saqueEfetuado = minhaCC.sacar(50F);
		
		if (saqueEfetuado){
			JOptionPane.showMessageDialog(null,"saque efetuado");
		}else{
			JOptionPane.showMessageDialog(null,"não foi posivel efetuar o saque voce so tem "+ minhaCC.getSaldo());
		}
		
		 System.out.println("jose "+ c1.getSaldo());

	}

}
