package lista01_int_a_java;

public class Assassino extends Papel {

	public Assassino(int poder, int defesa) {
		super(poder, defesa);
	}
	
	public double ataca(){
		return 1.45 * super.poder;
	}
	
	public double defesa(){
		return 0.5 * super.defesa;
	}
}
