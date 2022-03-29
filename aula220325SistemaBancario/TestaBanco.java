package aula220325SistemaBancario;

public class TestaBanco {
	
	public static void main(String[] args) {
		
/*		Pessoa pessoaNumero1 = new Pessoa(); //cria uma instancia = copia
		pessoaNumero1.nome = "Marisa Marzanasco";
		pessoaNumero1.profissao = "Programadora";
		pessoaNumero1.cpf = "643.829.641-48";
		
		System.out.println("Nome: " + pessoaNumero1.nome);
		System.out.println("Profissão: " + pessoaNumero1.profissao);
		System.out.println("CPF: " + pessoaNumero1.cpf); 
		
		
		
		Pessoa pessoaNova = new Pessoa();
		pessoaNova.setNome("Marisa Marzanasco");
		
		System.out.println("Nome: " + pessoaNova.getNome());
		
		Pessoa pessoaComConstrutor1 = new Pessoa("Marisa Marzanasco" , "643.829.641-48", "12.345.678-9");
		
		System.out.println("Nome: " + pessoaComConstrutor1.getNome());
		System.out.println("CPF:  " + pessoaComConstrutor1.getCpf());
		System.out.println("Nome: " + pessoaComConstrutor1.getRg());
		*/
		
		Conta conta1 = new Conta();
		conta1.setAgencia(1234);
		conta1.setNumeroConta(567890);
		//conta1.setSaldo(1000000.50); >> nao se deve alterar diretamente essa informação. Ela apenas pode ser exibida
		conta1.setTitular("Marisa Marzanasco");
		
		
		conta1.depositar(1000.35);
		
		System.out.println("Agencia: "+conta1.getAgencia());
		System.out.println("Conta: "+conta1.getNumeroConta());
		System.out.println("Titular: "+conta1.getTitular());
		System.out.printf("Saldo: R$ %.2f\n" , conta1.getSaldo());		
		
		
		
		if (conta1.sacar(100)) {
			System.out.println("Saque efetuado com sucesso!");
		}
		
		else {
			System.out.println("Verifique valor do saque!");
		}
		
		System.out.printf("Saldo Atual: R$ %.2f\n" , conta1.getSaldo());
		
		Conta conta2 = new Conta();
		conta2.setAgencia(5182);
		conta2.setNumeroConta(2234);
		
		
		if (conta1.transferir(100, conta2)) {
			
			System.out.println("Transferência efetuado com sucesso!");
			
		}
		
		else {
			
			System.out.println("Verifique valor do saque!");
		}
		
		
		System.out.printf("Saldo Atual conta 1: R$ %.2f\n" , conta1.getSaldo());
		System.out.printf("Saldo Atual conta 2: R$ %.2f\n" , conta2.getSaldo());
		
	}
}