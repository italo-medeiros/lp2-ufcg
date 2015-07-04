package lista01_int_a_java;

public class Lutador {

	String nome;
	int healthPoints;
	Habilidade habilidade;
	Papel papel;
	
	public Lutador(String nome, int healPoints, Habilidade habilidade, Papel papel) {
		this.nome = nome;
		this.healthPoints = healPoints;
		this.habilidade = habilidade;
		this.papel = papel;
	}

	
	public String ataca(Lutador outroLutador){
		String msg = null;
		
		if (this.healthPoints > 0) {
			this.habilidade.mana = this.habilidade.mana - this.habilidade.dano;   
			outroLutador.healthPoints = outroLutador.healthPoints - this.habilidade.mana;
		} else {
			msg = "Nao foi possivel usar "+ this.habilidade.toString() +".";
		}
		return msg;		
	}
	
}