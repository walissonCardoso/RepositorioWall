package cyber;

public class HD {
	String dados[];
	final int SIZE;
	
	public HD(final int size){
		if(size > 0)
			SIZE = size;
		else{
			System.out.println("Numero invalido na inicializacao do HD");
			SIZE = 0;
		}
		dados = new String[SIZE];
	}
	
	public void setNoHD(final int position, String dado){
		if(position >= 0 && position < SIZE)
			dados[position] = dado;
		else
			System.out.println("Endereco de HD invalido");
	}
	
	public String getNoHD(final int position){
		if(position >= 0 && position < SIZE)
			return dados[position];
		else{
			System.out.println("Endereco de RAM invalido");
			return "";
		}
	}
}