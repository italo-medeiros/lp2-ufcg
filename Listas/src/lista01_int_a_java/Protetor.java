package lista01_int_a_java;

public class Protetor extends Papel {

	public Protetor(int poder, int defesa) {
		super(poder, defesa);
	}

	public double defesa(){
		return 1.5 * super.defesa;
	}	
}

