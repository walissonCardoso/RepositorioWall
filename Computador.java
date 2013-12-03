package cyber;

import javax.swing.JOptionPane;

public abstract class Computador extends Device{
	
	
	private Conta contas[];
	private int indiceConta;
	private int qtContas;
	private Data hoje;
	private HD hd;
	private int maxHD;
	private int sizeHD;
	
	public Computador(final int maxRam, final int sizeRam, final int maxHD, final int sizeHD) {
		
		super(maxRam, sizeRam);
		this.qtContas = 0;
                this.contas = new Conta[0];
		this.hoje = new Data(10, 10, 1990);
		
		if(maxHD > 0)
			this.maxHD = maxHD;
		else{
			System.out.println("O maximo da ram deve ter um valor maior que 0");
			this.sizeHD = 0;
		}
		if(sizeHD > 0 && sizeHD <= maxHD){
			hd = new HD(sizeHD);
                        this.sizeHD = sizeHD;
                }else
			System.out.println("O tamando da ram deve ser maior que zero e menor que o maximo");
	}
	
	public boolean iniciar(){
		
		System.out.println("Carregando...");
		if(contas.length == 0){
			System.out.println("Sistema iniciado com sucesso");
			return true;
		}else{
			String nome = JOptionPane.showInputDialog("Digite a conta a ser logada");
			String senha = JOptionPane.showInputDialog("Digite a senha");
			boolean entrou = entrarUsuario(nome, senha);
			if(entrou){
				System.out.println("Sistema iniciado com sucesso");
				return true;
			}else{
				System.out.println("Conta inexistente");
				return false;
			}
		}
	}
	
	public void cadastrarUsuario(String nome, String senha){
		Conta contasAux[] = new Conta[qtContas+1];
		for(int i = 0; i < qtContas; i++)
			contasAux[i] = contas[i];
		contasAux[qtContas] = new Conta(nome,senha);
		contas = null;
		
		qtContas++;
		
		contas = new Conta[qtContas];
		for(int i = 0; i < qtContas; i++)
			contas[i] = contasAux[i];
		
		contasAux = null;
	}
	
	public boolean entrarUsuario(String nome, String senha){
		
		indiceConta = -1;
		for(int i = 0; i < contas.length; i++)
			if(certificar(contas[i], nome, senha)){
				indiceConta = i;
				return true;
			}
		return false;
	}
	
	public boolean mudarDados(String nome, String senha){
		if(indiceConta != -1){
			contas[indiceConta].alterar(nome, senha);
			return true;
		}else
			System.out.println("Conta nao logada");
		return false;
	}
	
	protected boolean certificar(Conta conta, String nome, String senha){
		if(conta.valida(nome, senha))
			return true;
		else
			return false;
	}
	
	public void exibirEspecificacoes(){
		System.out.println(
				"\nEste computador possui " + qtContas + "contas"
				+ "\nO maximo de memoria RAM eh: " + getMaxRAM() + "MB"
				+ "\nHa " + getSizeRAM() + " MB na RAM neste momento"
				+ "\nO maximo de memoria HD eh: " + maxHD + "GB"
				+ "\nHa " + sizeHD + " GB no HD neste momento"
				+ "\nHa " + qtContas + " contas neste computador"
				+ "\n\nVoce esta logado como " + (indiceConta == -1 ? "visitante" : contas[indiceConta].getNome())
				+ "\nHoje eh dia " + hoje.getData());
	}
        
        public int getMaxHD(){
            return maxHD;
        }
        
        public int getSizeHD(){
            return sizeHD;
        }
	
	public abstract void jogar();
	
	public abstract void avaliarProcessador();
}
