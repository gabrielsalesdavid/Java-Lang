package br.com.javalang;


import br.com.modificadoresdeacesso.Cliente;
import br.com.modificadoresdeacesso.Conta;

public class MaeDasClasses {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente("Bryan Gabriel", "Rua palmeiras, 2014");
		Cliente cli2 = new Cliente("Rebeca Vitoria", "Rua amor da minha vida, 2018");
		
		Conta c1 = new Conta(1, 500, 200, cli1);
		Conta c2 = new Conta(2, 600, 300, cli2);
		
		Caixa prateleira = new Caixa();
		
		System.out.println(c1);
		System.out.println(c2);
		
		if(c1.equals(c2)) {
			System.out.println("São a mesma conta! ");
		} else {
			System.out.println("São contas diferentes" );
		}
		
		prateleira.adicionar(c1);
		prateleira.adicionar(c2);
		
		//Conta conta = (Conta)prateleira.pegar(0);
		
		System.out.println(((Conta)prateleira.pegar(0)).getSaldo());
		
		prateleira.adicionar(cli1);
		
		System.out.println(((Cliente)prateleira.pegar(2)).getNome());
		
		if((Object)cli1 instanceof Conta) {
			System.out.println("O objeto é do tipo Conta! ");
		} else {
			System.out.println("O objeto não do tipo Conta! ");
		}
	}
}
