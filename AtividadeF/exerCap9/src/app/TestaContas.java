package app;
import model.*;

public class TestaContas {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(); //2)UTILIDADE: temos o polimorfismo de referência, já que podemos receber qualquer objeto 
		                               //que seja uma Conta,no caso, conta corrente ou poupança, tendo algo mais CONCRETO.
		
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);
		
		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
			
	}

}
