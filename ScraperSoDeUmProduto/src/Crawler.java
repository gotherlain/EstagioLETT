import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
public class Crawler {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		try {
			//String html = args[0];
			//recebe a url
			String html = null;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Digite a url:");
			html = scanner.nextLine();
			Document doc = Jsoup.connect(html).get(); // pega o codigo fonte da pagina
			
			//busca por elementos
			Element nomeProduto = doc.select("h1.titulo_det").get(0);
			Element precoNormal = doc.select("div.preco_normal").get(0);
			Element precoAvista = doc.select("span.preco_desconto").get(0);
			Element descricao = doc.select("div.content_tab").get(0);
			
			//mostra os precos
			System.out.println("Nome do produto "+ nomeProduto.text());
			System.out.println("Preço normal: "+precoNormal.text());
			System.out.println("Preço a vista: " +precoAvista.text());
			System.out.println("Descrição: "+descricao.text());
			
		
		}
		catch(Exception e) {
			
		}
	}

}
