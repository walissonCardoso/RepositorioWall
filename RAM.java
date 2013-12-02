package cyber;

public class RAM {
	String dados[];
	final int SIZE;
	
	public RAM(final int size){
		if(size > 0)
			SIZE = size;
		else{
			System.out.println("Numero invalido na inicializacao da RAM");
			SIZE = 256;
		}
		dados = new String[SIZE];
	}
	
	public void setNaRAM(final int position, String dado){
		if(position >= 0 && position < SIZE)
			dados[position] = dado;
		else
			System.out.println("Endereco de RAM invalido");
	}
	
	public String getNaRam(final int position){
		if(position >= 0 && position < SIZE)
			return dados[position];
		else{
			System.out.println("Endereco de RAM invalido");
			return "";
		}
	}
	
	public int getSizeRam(){
		return dados.length;
	}
}
