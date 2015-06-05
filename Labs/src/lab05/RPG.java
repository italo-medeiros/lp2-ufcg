package lab05;

import java.util.HashSet;


public class RPG extends Jogo {
	
	public RPG(String nome, double preco, HashSet<Jogabilidade> jogabilidades){
		super(nome, preco, jogabilidades);
	}

	public String toString() {

		StringBuffer sb = new StringBuffer();
		final String endOfLine = System.getProperty("line.separator");		
	
		sb.append(endOfLine);
		sb.append("+ "+ super.getNome()+" - RPG :");
		sb.append(endOfLine);
		sb.append("==> Jogou "+ super.getVezesJogada() +" vez(es)");
		sb.append(endOfLine);
		sb.append("==> Zerou "+ super.getVezesZerada() +" vez(es)");
		sb.append(endOfLine);
		sb.append("==> Maior score: "+ super.getMaiorScore());
		sb.append(endOfLine);
		return sb.toString();
	}
}
