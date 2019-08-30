package fazenda;

public class Pato extends Aves implements Som{
	
	int ovoPato = 0;
	Double alturaDoVooPato = 30.5;
	
	public Pato() {
		
	}
	
	public Pato(Double idade, Double altura, String corDaPena) {
		super(idade, altura,corDaPena);
	
	}
	
	
	
	public Pato(Double idade, Double altura, String corDaPena, int ovoPato) {
		super(idade, altura, corDaPena);
		this.ovoPato = ovoPato;
	}
	


	public int getOvoPato() {
		return ovoPato;
	}
	
	public Double getAlturaDoVooPato() {
		return alturaDoVooPato;
	}



	public void setOvoPato(int ovoPato) {
		this.ovoPato = ovoPato;
	}
	
	@Override
	public void Som(int x){
		System.out.println("O pato "+((x)+ 1)+ " faz: quack quack");
//		
		
	}
	

	@Override
	public void BotarOvo(int x) {
		System.out.println("O pato " + ((x)+1) +" botou ovo");
		Controle.listaDePatos.get(x).setOvoPato(ovoPato+1);
		System.out.println("O pato "+((x)+ 1)+" ja botou " + Controle.listaDePatos.get(x).getOvoPato() +" Ovos");
	}
	
	public void Voar(int x) {
		System.out.println("O Pato " + ((x)+1) +" voou");
		System.out.println("O Pato "+((x)+1)+" esta voando a " + Controle.listaDePatos.get(x).getAlturaDoVooPato() +" Metros");
	}
	/*
	public void Voar(Double altura) {
		System.out.println("O pato esta voando " + altura + " Metros");
		
	}*/
}