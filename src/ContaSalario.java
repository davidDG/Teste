import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "conta_salario")
public class ContaSalario extends Conta{
	
	public ContaSalario(){
		super(null);
	}
	
	public ContaSalario(String conta){
		super(conta);
	}
			
	public boolean sacar (Float valor){
		if(valor<= saldo){
		saldo = saldo - valor;
		return true;
		}else return false;
	}
}
