package exceptions;


public class TipoJogoException extends TipoObjetoInexistenteException {

	public TipoJogoException() {
		super("Nao existe este tipo de jogo.");
	}
	
	public TipoJogoException(String tipo) {
		super(tipo);
	}
	
}
