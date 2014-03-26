import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


public class CaixaEletronico {

	public static void main (String []args){
		boolean saque;
		Session sessao =HibernateUtil.getSession();
		sessao.beginTransaction();
		
		Conta minhaCC = (ContaCorrente) sessao.createCriteria(ContaCorrente.class)
				.add(Restrictions.eq("conta", "321"))
				.uniqueResult();
		Conta contaS = (ContaSalario) sessao.createCriteria(ContaSalario.class)
				.add(Restrictions.eq("conta", "321"))
				.uniqueResult();
		
		Conta contaP = (Conta) sessao.createCriteria(ContaPoupanca.class)
				.add(Restrictions.eq("conta", "321"))
				.uniqueResult();
		
		//JOptionPane.showMessageDialog(null, "saldo "+ minhaCC.getSaldo());
		//minhaCC.depositar(200f);
		//JOptionPane.showMessageDialog(null, "saldo "+ minhaCC.getSaldo());
		//minhaCC.sacar(3000f);
		
		System.out.println("saldo da conta corrente "+ minhaCC.getSaldo());
		System.out.println("saldo da conta salario "+ contaS.getSaldo());
		System.out.println("saldo da conta Poupança "+ contaP.getSaldo());	
		
		minhaCC.depositar(200f);
		
		sessao.update(minhaCC);
		sessao.update(contaS);
		
		sessao.getTransaction().commit();
		sessao.close();
		
		
		
	}
	
}
