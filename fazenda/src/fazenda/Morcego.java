package fazenda;

public class Morcego extends Mamiferos implements Som{

	int vzsAmamentMorcego =0;
	Double alturaVooMorcego = 100.00;
	
	
	
	public Morcego(Double idade, Double altura, String corDoPelo, int vzsAmamentMorcego) {
		super(idade, altura, corDoPelo);
		this.vzsAmamentMorcego = vzsAmamentMorcego;
	}
	
	@Override
	public void Som(int x){
		System.out.println("O Morcego "+((x)+ 1)+ " faz: ishqihsiqhsqihsisqhi");
//		
		
	}
	
	


	public Morcego(Double idade, Double altura, String corDoPelo) {
		super(idade, altura, corDoPelo);
	}

	public int getVzsAmamentMorcego() {
		return vzsAmamentMorcego;
	}
	
	public Double getAlturaVooMorcego() {
		return alturaVooMorcego;
	}

	public void setVzsAmamentMorcego(int vzsAmamentMorcego) {
		this.vzsAmamentMorcego = vzsAmamentMorcego;
	}
	
	@Override
	public void Amamentar(int x) {
		System.out.println("O morcego " + ((x)+1) +" amamentou");
		Controle.listaDeMorcegos.get(x).setVzsAmamentMorcego(vzsAmamentMorcego+1);
		System.out.println("O Morcego "+((x)+1)+" ja amamentou " + Controle.listaDeMorcegos.get(x).getVzsAmamentMorcego() +" Vezes");
	}
	
	public void Voar(int x) {
		System.out.println("O Morcego " + ((x)+1) +" voou");
		System.out.println("O Morcego "+((x)+1)+" esta voando a " + Controle.listaDeMorcegos.get(x).getAlturaVooMorcego() +" Metros");
	}
}
