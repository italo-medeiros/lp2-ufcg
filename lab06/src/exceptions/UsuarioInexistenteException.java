package exceptions;


public class UsuarioInexistenteException extends ObjetoInexistenteException {

	public UsuarioInexistenteException() {
		super("Este usuario nao esta cadastrado em loja.");
	}
	
	public UsuarioInexistenteException(String tipo){
		super(tipo);
	}
	
}
