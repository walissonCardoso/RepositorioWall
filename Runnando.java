package cyber;

public class Runnando {

	public static void main(String[] args) {
            
            ComputadorAMD compAMD = new ComputadorAMD(512,256,500,80,"i5");
            
            compAMD.iniciar();
            compAMD.cadastrarUsuario("walisson","cabocoLindu");
            compAMD.cadastrarUsuario("Arthur","naruto123");
            
            compAMD.exibirEspecificacoes();
            compAMD.entrarUsuario("walisson","cabocoLindu");
            compAMD.mudarDados("walisson","queCoisa");
            
            
            ComputadorIntel compIntel = new ComputadorIntel(512,126,1024,500,"FX");
            compIntel.iniciar();
            compIntel.cadastrarUsuario("walissonCar","minhaNussa");
            compIntel.cadastrarUsuario("Arthur","morenaoCheroso");
            compIntel.cadastrarUsuario("Claudomiro","Poderoso_chefao");
            
            compIntel.exibirEspecificacoes();
            
            
            System.out.println("\nVamos jogar...");
            compIntel.jogar();
            System.err.println("\n");
            compAMD.jogar();
            
            System.out.println("\nFazer conta no Intel");
            compIntel.realizarCalculo(1,3,4);
            System.out.println("\nFazer conta no AMD");
            compAMD.realizarCalculo(2,4,5);
            
            //Usando polimorfismo...
            System.out.println("\nVamos tentar usar a classe Computador");

            Computador comp = new ComputadorAMD(256,256,400,40,"pentium II");
            comp.iniciar();
	}

}
