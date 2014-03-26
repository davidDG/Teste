import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conta_corrente")

public class ContaCorrente extends Conta {

	@Column
	private Float limite=0f; 
	
	public ContaCorrente(){
		super(null);
	}
	
	public ContaCorrente(String conta){
		super(conta);
	}
	
		
	public boolean sacar (Float valor){
		if(valor<= saldo + limite){
		saldo = saldo - valor;
		return true;
		}else return false;
	}

	
	
}
