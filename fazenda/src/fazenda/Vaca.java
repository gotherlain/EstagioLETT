package fazenda;

public class Vaca extends Mamiferos implements Som{
	
	int vezesQAmamentou=0;
	public Vaca(Double idade, Double altura, String corDoPelo, int vezesQAmamentou) {
		super(idade, altura, corDoPelo);
		this.vezesQAmamentou = vezesQAmamentou;
	}
	
	public Vaca(Double idade, Double altura, String corDoPelo) {
		super(idade, altura, corDoPelo);
		
	}
	
	
	public int getVezesQAmamentou() {
		return vezesQAmamentou;
	}



	public void setVezesQAmamentou(int vezesQAmamentou) {
		this.vezesQAmamentou = vezesQAmamentou;
	}

	@Override
	public void Som(int x){
		System.out.println("A vaca "+((x)+ 1)+ " faz: muuu");
//		
		
	}
	

	@Override
	public void Amamentar(int x) {
		System.out.println("A Vaca " + ((x)+1) +" amamentou");
		Controle.listaDeVacas.get(x).setVezesQAmamentou(vezesQAmamentou+1);
		System.out.println("A Vaca "+((x)+1)+" ja amamentou " + Controle.listaDeVacas.get(x).getVezesQAmamentou() +" Vezes");
	}
	
	
	
}
