package cyber;

public class ComputadorAMD extends Computador{
	
	private final String modelo;
	
	public ComputadorAMD(final int maxRam, final int sizeRam, final int maxHD, final int sizeHD, String modelo){
		super(maxRam, sizeRam, maxHD, sizeHD);
		this.modelo = modelo;
	}
	
	public void jogar(){
		System.out.println("Nossa cara, jogo melhor no AMD que no Intel!!");
	}
	
	public void avaliarProcessador(){
	        System.out.println("Este eh um processador AMD" + modelo + "\nNota: " + 3.1
                    + "\nTa barato, mas tem alguns bugs");
	}
	
        @Override
	public double realizarCalculo(int oper, double op1, double op2){
		switch(oper){
                    case 1:
                        System.out.println("Realizando uma soma. Ta meio lento...");
                        return op1+op2;
                    case 2:
                        System.out.println("Realizando uma subtracao. Ta meio lento...");
                        return op1-op2;
                    case 3:
                        System.out.println("Realizando uma multiplicacao. Ta meio lento...");
                        return op1*op2;
                    case 4:
                        System.out.println("Realizando uma divisao. Ta meio lento...");
                        return op1/op2;
                    default:
                        System.out.println("Esta operacao don't exist!");
                        return 0;
                }
	}
	
	public void exibirEspecificacoes(){
            super.exibirEspecificacoes();
            avaliarProcessador();
	}
}
