import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass

public abstract class Conta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	protected Integer id;
	@Column
	protected String conta;
	@Column
	protected Float saldo=0f;
	
	public Conta(String conta){
		this.conta = conta;
	}
		
	public String getConta() {
		return conta;
	}
	
	public Float getSaldo() {
		return saldo;
	}
	
	public void depositar (Float valor){
		saldo = saldo + valor;
	}
		
	public abstract boolean sacar(Float valor);
		
	
	
}
