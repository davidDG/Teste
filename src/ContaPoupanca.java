
public class ContaPoupanca extends Conta {


	public ContaPoupanca() {
		super(null);
		// TODO Auto-generated constructor stub
	}

	public ContaPoupanca(String conta){
		super(conta);
	}
	
		
	@Override
	public boolean sacar(Float valor) {
		// TODO Auto-generated method stub
		return false;
	}

	public Float getSaldo() {
		
		return saldo+ saldo * 0.05f;
	}
	
	
}
