package lab06;
/* 114210196 - Italo Hector de Medeiros Batista: LAB 06 - Turma 03 */



public class DadoInvalidoException extends EntradaException {

	public DadoInvalidoException() {
		super("O dado informado nao pode ser negativo.");
	}
	
	public DadoInvalidoException(String tipo) {
		super(tipo +" nao pode ser negativo.");
	}
	
}

