package lista01_int_a_java;

public class Curandeiro extends Papel{

	public Curandeiro(int poder, int defesa) {
		super(poder, defesa);
	}
	
	public double ataque(){
		return super.poder * 0.5 * (-1);
	}
	
	public double cura(){
		return super.poder * 1.4;
	}
}
