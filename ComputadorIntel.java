package cyber;

public class ComputadorIntel extends Computador{
    
        private final String modelo;
	
	public ComputadorIntel(final int maxRam, final int sizeRam, final int maxHD, final int sizeHD, String modelo){
		super(maxRam, sizeRam, maxHD, sizeHD);
		this.modelo = modelo;
	}
	
	public void jogar(){
		System.out.println("Intel nao roda jogo tao bem, mas sou mais rico!");
	}
	
	public void avaliarProcessador(){
		System.out.println("Este eh um processador Intel, moledo: " + modelo
                    + "Bom, processador, ams podia ser melhor pelo preço. Nota: " + 4.3);
	}
        
        @Override
	public double realizarCalculo(int oper, double op1, double op2){
		switch(oper){
                    case 1:
                        System.out.println("Realizando uma soma. Intel eh legal, neh Pablo?");
                        return op1+op2;
                    case 2:
                        System.out.println("Realizando uma subtracao. Intel eh legal, neh Pablo?");
                        return op1-op2;
                    case 3:
                        System.out.println("Realizando uma multiplicacao. Intel eh legal, neh Pablo?");
                        return op1*op2;
                    case 4:
                        System.out.println("Realizando uma divisao. Intel eh legal, neh Pablo?");
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
