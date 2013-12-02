package cyber;

public class Conta {
	private String nome;
	private String senha;
	
	public Conta(String nome, String senha){
		if(!nome.isEmpty() && !senha.isEmpty()){
			this.nome = nome;
			this.senha = senha;
		}else
			System.out.println("Nome ou senha nao podem ser vazios");
	}
	
	public boolean valida(String nome, String senha){
		if(this.nome == nome && this.senha == senha)
			return true;
		else
			return false;
	}
	
	public void alterar(String nome, String senha){
		if(!nome.isEmpty() && !senha.isEmpty()){
			this.nome = nome;
			this.senha = senha;
		}else
			System.out.println("Nome ou senha nao podem ser vazios");
	}
	
	public String getNome(){
		return nome;
	}
}
