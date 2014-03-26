import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Funcionario")
public class Funcionarios {

	@Id
	@Column(name= "id")
	private int id;
	
	@Column(name= "nome")
	private String nome;
	
	@Column(name= "valorHora")
	private double valorHora;
	
	private double getValorHora() {
		return valorHora;
	}
	private void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	
	
	

}
