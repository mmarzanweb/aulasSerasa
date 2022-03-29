package aula220325SistemaBancario;

public class PessoaFisica extends PessoaHeranca {
	
	private String cpf;
	private String profissao;
	private String rg;
	
	public PessoaFisica() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public PessoaFisica(String cpf, String profissao, String rg) {
		super();
		this.cpf = cpf;
		this.profissao = profissao;
		this.rg = rg;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	

}
