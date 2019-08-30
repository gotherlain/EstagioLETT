package fazenda;

public class Galinha extends Aves implements Som {
	int ovoGalinha=0;
	
	public Galinha(Double idade, Double altura, String corDaPena) {
		super(idade, altura,corDaPena);
	
	}
	
	public Galinha(Double idade, Double altura, String corDaPena, int ovoGalinha) {
		super(idade, altura,corDaPena);
		this.ovoGalinha = ovoGalinha;
	}
	
	@Override
	public void Som(int x){
		System.out.println("A galinha "+((x)+ 1)+ " faz: co co co po po po ri co cocorico");
//		
		
	}
	
	public int getOvoGalinha() {
		return ovoGalinha;
	}


	public void setOvoGalinha(int ovoGalinha) {
		this.ovoGalinha = ovoGalinha;
	}


	@Override
	public void BotarOvo(int x) {
		System.out.println("A Galinha " + ((x)+1) +" botou ovo");
		Controle.listaDeGalinhas.get(x).setOvoGalinha(ovoGalinha+1);
		System.out.println("A galinha "+((x)+1)+" ja botou " + Controle.listaDeGalinhas.get(x).getOvoGalinha() +" Ovos");
	}
	
	
}
