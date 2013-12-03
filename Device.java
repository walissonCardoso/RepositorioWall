package cyber;

import javax.print.attribute.standard.Sides;

public abstract class Device {
	
	
	private int maxRam;
	private RAM ram;
	
	
	public Device(final int maxRam, final int sizeram) {
		if(maxRam > 0)
			this.maxRam = maxRam;
		else{
			System.out.println("O maximo da ram deve ter um valor maior que 0");
			this.maxRam = 0;
		}
		if(sizeram > 0 && sizeram <= maxRam)
			ram = new RAM(sizeram);
		else
			System.out.println("O tamando da ram deve ser maior que zero e menor que o maximo");
	}
	
	public void trocarRam(final int sizeram){
		ram = null;
		if(sizeram > 0 && sizeram <= maxRam)
			ram = new RAM(sizeram);
		else
			System.out.println("O tamando da nova ram deve ser maior que zero e menor que o maximo");
	}
	
	public void setNaRam(final int position, String dado){
		ram.setNaRAM(position, dado);
	}
	
	public void mostraDado(final int position){
		String dado = ram.getNaRam(position);
		System.out.println("Nesta posicao tem: " + dado);
	}
	
	public int getMaxRAM(){
		return maxRam;
	}
	
	public int getSizeRAM(){
		return ram.getSizeRam();
	}
	
	public abstract void exibirEspecificacoes();
	
	public abstract double realizarCalculo(int oper, double op1, double op2);
}
